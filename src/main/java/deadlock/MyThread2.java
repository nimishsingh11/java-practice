package deadlock;

public class MyThread2 extends Thread {
	Resource res;
	 MyThread2(Resource res){
		 this.res=res;
	 }
	 public void run() {
	 synchronized (res.resource2) {  
	     System.out.println("Thread 2: locked resource 2");  

	     try { Thread.sleep(1000);} catch (Exception e) {}  

	     synchronized (res.resource2) {  
	      System.out.println("Thread 2: locked resource 1");  
	     }  
	}
	}
}
