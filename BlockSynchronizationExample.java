class BlockSyncCounter {

	private int count = 0;

	public void increment() {

		synchronized(this) {

			count++;

		}

	}

	public int getCount() {

		return count;

	}

}

public class BlockSynchronizationExample {
 
	public static void main(String[] args) throws InterruptedException {

		BlockSyncCounter counter = new BlockSyncCounter();

		Thread t1 = new Thread(() -> {

			for (int i = 0; i<1000;i++) {

				counter.increment();

			}

		});


		Thread t2 = new Thread(() -> {

			for (int i = 0; i<1000;i++) {

				counter.increment();

			}

		});

		t1.start();

		t2.start();

		t1.join();

		t2.join();

		System.out.println("Final Count (Block-Synchronized): " + counter.getCount());

}

}

 