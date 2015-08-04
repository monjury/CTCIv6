package example.runnable;

public class MyRunnable implements Runnable {

	public int count = 0;

	@Override
	public void run() {
		System.out.println("Thread start");
		try {
			while (count < 5) {
				System.out.println(count + " Thread sleep");
				Thread.sleep(50);
				count++;
			}
		}
		catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
		System.out.println("Thread end");
	}

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		while (r.count < 5) {
			try {
				System.out.println(r.count + " Main Thread sleep");
				Thread.sleep(25);
			}
			catch (InterruptedException e) {
				System.out.println("Main Thread interrupted");
				e.printStackTrace();
			}
		}

	}
}
