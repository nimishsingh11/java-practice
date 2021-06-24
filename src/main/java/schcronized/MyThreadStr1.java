package schcronized;

public class MyThreadStr1 extends Thread {
	Str str;
	 MyThreadStr1(Str str){
		 this.str=str;
	 }
	 public void run() {
		
		System.out.println("The thread id  "+Thread.currentThread().getId()+" "+str.appendBuffer());
	 }

}
