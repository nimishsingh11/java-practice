package threadPool;

public class MyThread2 extends Thread{
	MyQueue myqueue;
	 MyThread2( MyQueue myqueue){
		 this.myqueue=myqueue;
	 }
	 
	 public void run() {
		 System.out.println(myqueue.getAndremove());
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
}
