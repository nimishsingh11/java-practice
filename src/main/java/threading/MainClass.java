package threading;

public class MainClass {
public static void main(String[] args) {
	for(int i=0;i<5;i++) {
	MyThread2 m1=new MyThread2();
	m1.start();
	}
}
}
