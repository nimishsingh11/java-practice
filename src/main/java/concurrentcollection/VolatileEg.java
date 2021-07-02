package concurrentcollection;

public class VolatileEg {
	  static  int a = 0, b = 0;
	  
	    
	synchronized static    void update()
	    {
	        a++;
	        b++;
	        System.out.println("incrementing by "+ Thread.currentThread().getId());
	    }
	 
	    // Defining static void method
synchronized	static   void read()
	    {
	        System.out.println(
	            "a=" + a + " b=" + b +"   "+ Thread.currentThread().getId());
	    }
	 public static void main(String[] args)
	    {
	 
	        // Creating an instance t1 of
	        // Thread class
	        Thread t1 = new Thread() {
	            public void run()
	            {
	                for (int i = 0; i < 50; i++) {
	                   read();
	                   update();
	                }
	                
	            }
	        };
	 
	        // Creating an instance t2 of
	        // Thread class
	        Thread t2 = new Thread() {
	            public void run()
	            {
	                for (int i = 0; i < 50; i++) {
	                	read();
	                    update();
	                }
	            }
	        };
	 
	        // Starting instance t1 and t2
	        t1.start();
	        t2.start();
	    }
}
