package multithreadingTwo;

public class MainForAccount {
	public static void main(String[] args) {
		Account a=new Account(2000);
		MyThreadAccessAccount t1=new MyThreadAccessAccount(a);
		t1.start();
		MyThreadAccessAccount t2=new MyThreadAccessAccount(a);
		t2.start();
		MyThreadAccessAccount t3=new MyThreadAccessAccount(a);
		t3.start();
		
		
	}
	
}
