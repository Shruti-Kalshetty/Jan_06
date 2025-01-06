import java.util.Scanner;
 
public class Test6  extends Thread{
 
	public void run() {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number:");

		int no=sc.nextInt();

		for(int i=1;i<=10;i++) {

			try {

				Thread.sleep(1500);

			} catch (InterruptedException e) {

				// TODO Auto-generated catch block

				e.printStackTrace();

			}

			System.out.println(no+"x"+i+"="+(no*i));

		}

	}

	public static void main(String[] args) {

 
		Test6 t=new Test6();

		Test6 t1=new Test6();

		t.start();

		try {

			t.join();

		} catch (InterruptedException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		t1.start();

	}
 
}

 