package schcronized;

public class ClientsThreads extends Thread{
String msg;
Sender sender;
ClientsThreads(String msg,Sender sender){
	this.msg=msg;
	this.sender=sender;
}
public void run() {
	System.out.println("Removal is "+sender.remove() +" by thead id "+ Thread.currentThread().getName());
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
