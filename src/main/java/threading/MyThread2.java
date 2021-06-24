package threading;

public class MyThread2 extends Thread {
	public void run() {
	Singleton s1=Singleton.getInstance();
	System.out.println(Thread.currentThread().getId() +" "+ s1.getName() );
	}

	
}

