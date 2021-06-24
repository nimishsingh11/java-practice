package deadlock;

public class MyThread extends Thread {
 Resource res;
 MyThread(Resource res){
	 this.res=res;
 }
 public void run() {
 synchronized (res.resource1) {  
     System.out.println("Thread 1: locked resource 1");  

     try { wait();
     
     } catch (Exception e) {}  

     synchronized (res.resource2) {  
      System.out.println("Thread 1: locked resource 2");  
     }  
}
}
}
