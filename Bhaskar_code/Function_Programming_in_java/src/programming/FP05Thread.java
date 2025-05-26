package programming;

public class FP05Thread {
	public static void main(String[] args) {

		Runnable runnable = () -> {

			for (int i = 1; i < 1000; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		};

		Thread t1 = new Thread(runnable);
		t1.start();

		Thread t2 = new Thread(runnable);
		t2.start();

		Thread t3 = new Thread(runnable);
		t3.start();
	}
}
