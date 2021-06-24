package schcronized;

public class Main {
	public static void main(String[] args) {
		
		  Tables t=new Tables();
		  MyTableThread tt=new MyTableThread(t);
		  tt.start();
		  MyTableThread tt1=new MyTableThread(t);
		  tt1.start();
		  
		 
	/*	Sender sender = new Sender();
		sender.names.add("nimish");
		ClientsThreads ct1 = new ClientsThreads("hi", sender);
		ClientsThreads ct2 = new ClientsThreads("hi", sender);
		ClientsThreads ct3 = new ClientsThreads("hi", sender);
		ct1.setName("T1");
		ct2.setName("T2");
		ct3.setName("T3");
		ct1.start();
		ct2.start();
		ct3.start();*/
	}

}
