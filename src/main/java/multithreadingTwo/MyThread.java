package multithreadingTwo;

public class MyThread implements Runnable{
	Tabless table;
	MyThread(Tabless table){
		this.table=table;
	}
public void run() {
		
		
		try {
			Thread.sleep(300);
			table.getTable(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Max Priority is "+Thread.MAX_PRIORITY);
		
		
	}
	
}

