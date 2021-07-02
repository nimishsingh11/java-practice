package strbuffer;

public class Main {
public static void main(String[] args) {
	Buffer b=new Buffer();
	//MyThread1 t1=new MyThread1(b);
	MyThread2 t2=new MyThread2(b);
//	t1.start();
	t2.start();
}
}
