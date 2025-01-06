

public class Test3 implements Runnable {
 
	@Override

	public void run() {

		System.out.println("This is run method !!!");

	}

	public static void main(String[] args) {

		Test3 t1=new Test3();

		/* public Thread(Runnable target) {

        this(null, target, "Thread-" + nextThreadNum(), 0);

    }*/

		Thread t=new Thread(t1);

		t.start();

		System.out.println(t.getName());

		t.setName("Jhon Thread");

		System.out.println(t.getName());

		System.out.println(t.getId());

	}
 
 
}

 