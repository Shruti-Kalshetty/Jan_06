

public class Test4 extends Thread {
 
	public void run() {

		for(int i=1;i<=10;i++) {

			System.out.println(i);

		}

	}

	public static void main(String[] args) {

		Test4 t=new Test4();

		Test4 t1=new Test4();

		t.start();

		try {

			t.join();

		} catch (InterruptedException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		t1.start();

		try {

			t1.join();

		} catch (InterruptedException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		System.out.println(t.getName());

		System.out.println(t.getId());

		System.out.println(t1.getName());

		System.out.println(t1.getId());
 
	}
 
}

 