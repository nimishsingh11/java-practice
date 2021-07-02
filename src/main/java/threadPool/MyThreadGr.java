package threadPool;



public class MyThreadGr {
	public static void main(String[] args) {
		Car c=new Car();
		MyCarThread c1=new MyCarThread(c);
		Thread t1=new Thread(c1);
		t1.start();
		
		ThreadGroup tg=new ThreadGroup("GroupA");
		Thread t2=new Thread(tg,c1);
		Thread t3=new Thread(tg,c1);
		Thread t4=new Thread(tg,c1);
	    t2.start();
	    t3.start();
	    t4.start();
	    System.out.println(tg.getName());
	   // tg.list();
	    tg.suspend();
	}
}
