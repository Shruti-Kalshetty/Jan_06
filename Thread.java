//creation of thread

public class Test2 extends Thread {

//executing of thread

	public void run() {

		System.out.println("This is run method");

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
 
		Test2 t=new Test2();

		System.out.println(t.getName());

		//calling of thread

		t.start();

	}
 
}

 