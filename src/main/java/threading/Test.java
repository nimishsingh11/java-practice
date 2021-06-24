package threading;

public class Test extends Thread {
public static void main(String[] args) {
	Thread t=Thread.currentThread();
	
	System.out.println(t.getName());
}
	

}
