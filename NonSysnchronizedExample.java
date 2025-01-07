class Counter {

	private int count = 0;

	public void increment() {

		count++; // Non-synchronized

	}

	public int getCount() {

		return count;

	}

}

public class NonSysnchronizedExample {
 
	public static void main(String[] args) throws InterruptedException  {

		Counter counter = new Counter();

		Thread t1 = new Thread(() -> {

			for(int i = 0; i < 1000;i++) {

				counter.increment();

			}

		});

 
		Thread t2 = new Thread(() -> {

			for(int i = 0; i < 1000;i++) {

				counter.increment();

			}

		});

		//start the threads

		t1.start();

		t2.start();

		//wait for both threads to finish

		t1.join();

		t2.join();

		//Print the final count

		System.out.println("Final Count(Non-Synchronized): " + counter.getCount());

 
	}
 
}

 