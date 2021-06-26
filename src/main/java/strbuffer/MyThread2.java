package strbuffer;

public class MyThread2 extends Thread {
	Buffer buffer;
	 MyThread2(Buffer buffer){
		 this.buffer=buffer;
	 }
	 public void run() {
		 buffer.addBufferStr(new StringBuffer("hiii"));
		 System.out.println(buffer.sf + "  "+Thread.currentThread().getId());
	 }
}
