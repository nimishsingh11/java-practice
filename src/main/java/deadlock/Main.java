package deadlock;



public class Main {
public static void main(String[] args) {
	Resource r=new Resource();
	MyThread t1=new MyThread(r);
	t1.start();
	MyThread2 t2=new MyThread2(r);
	
	t2.start();
}
}
