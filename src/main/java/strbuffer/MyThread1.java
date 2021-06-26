package strbuffer;

public class MyThread1 extends Thread {
 
 StringBuffer str;
 MyThread1(StringBuffer str ){
	
	 this.str=str;
 }
 public void run() {
	this.str.append("-hello");
	 System.out.println( Thread.currentThread().getId() + " "+ this.str);
	 
 }
}
