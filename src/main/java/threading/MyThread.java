package threading;

public class MyThread extends Thread{
	   public void run()
	    {
	        try {
	            // Displaying the thread that is running
	        	Thread.sleep(500);
	            System.out.println(
	                "Thread " + Thread.currentThread().getId()
	                + " is running");
	        }
	        catch (InterruptedException e) {
	            // Throwing an exception
	            System.out.println("Exception is caught");
	        }
	        
	    }
}
