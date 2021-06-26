package deadlock;

public class Main2 {
public static void main(String[] args) {
	Message m=new Message();
	Writer w=new Writer(m);
	Reader r=new Reader(m);
	Thread t1=new Thread(w);
	t1.start();
	
	Thread t2=new Thread(r);
	t2.start();
	
	
}
}
