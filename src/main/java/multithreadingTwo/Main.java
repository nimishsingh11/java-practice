package multithreadingTwo;

public class Main {
	public static void main(String[] args) {
		Tabless table=new Tabless();
		Runnable r=new MyThread(table);
		
		
		Thread th1=new Thread(r);
		
		
		Thread th2=new Thread(r);
		
		
		Thread th3=new Thread(r);
		
		th1.setName("Anil");
		th2.setName("kumar");
		th3.setName("Chauhan");
		th1.setPriority(10); //whyyy its position is not guarrented
		th2.setPriority(9);
		th3.setPriority(8);
		th1.start();
		th2.start();
		th3.start();
		th2.yield();
	}
	
	
}
