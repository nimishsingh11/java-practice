package strbuffer;

public class Buffer {
	public static void main(String[] args) {
		 StringBuffer sf =new StringBuffer("Hello");
		 for(int i=0;i<10 ;i++) {
		   MyThread1 t1=new MyThread1(sf);
		   t1.start();
		 }
		 
	}
 
   
	
}
