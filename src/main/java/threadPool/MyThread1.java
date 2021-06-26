package threadPool;

public class MyThread1 extends Thread {
 MyQueue myqueue;
 MyThread1( MyQueue myqueue){
	 this.myqueue=myqueue;
 }
 
 public void run() {
	 myqueue.add("Nimish Login");
 }
}
