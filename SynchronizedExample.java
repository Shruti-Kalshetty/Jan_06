class SyncCounter {

	private int count = 0;

	public synchronized void increment() {

		count++;

	}

	public int getCount() {

		return count;

	}

}

public class SynchronizedExample {
 
	public static void main(String[] args) throws InterruptedException {

		SyncCounter counter = new SyncCounter();

		Thread t1 = new Thread(() -> {

			for (int i = 0; i < 1000;i++) {

				counter.increment();

			}

		});

		Thread t2 = new Thread(() -> {

			for (int i = 0; i < 1000;i++) {

				counter.increment();

			}

		});

		//Start the threads

		t1.start();

		t2.start();

		t1.join();

		t2.join();

		System.out.println("Final Count (Synchronized): " + counter.getCount());

	}

 
}
 