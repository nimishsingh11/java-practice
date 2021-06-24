package threading;

public class Main {
	public static void main(String[] args) {

	/*	ThreadProg threadProg = new ThreadProg();
		Thread thread = new Thread(threadProg);
		System.out.println(thread.getName());
		thread.run();*/
		Calll c= new Calll();
		
		try {
			c.call();
		
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println("handled exception");
		}
		
		
	}
}
