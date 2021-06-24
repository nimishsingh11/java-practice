package threading;

public class ThreadProg implements Runnable {

	@Override
	public void run() {
		 try
	        {
	            Thread.sleep(1500);
	        } 
	        catch (InterruptedException e) 
	        {
	            e.printStackTrace();
	        }
		 System.out.println("thread1");
	}
}
	          
	       
 

