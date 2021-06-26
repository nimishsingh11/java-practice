package multithreadingTwo;

public class Main {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Tabless table=new Tabless();
		
		Thread th1=new Thread(new MyThread(table));
		Thread th2=new Thread(new MyThread(table));
		Thread th3=new Thread(new MyThread(table));
		
		th1.setName("t1");
		th2.setName("t2");
		th3.setName("t3");
	//	th1.setPriority(10); //whyyy its position is not guarrented
//		th2.setPriority(9);//c d finish point
	//	th3.setPriority(8);
		th1.start();
	//	th2.start();
		//th3.start();
		
		//th1.suspend();
		try {
			th1.join();
			
		//System.out.println("joined after1000ms");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		th2.start();
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th3.start();
		
		
		
	}
	
	
}
