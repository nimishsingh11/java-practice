package deadlock;

public class MyThread extends Thread {
 Resource res;
 MyThread(Resource res){
	 this.res=res;
 }
 public void run() {
 res.resource1();
 System.out.println("Im holding resourse1"+Thread.currentThread().getId());
 try {
	Thread.sleep(5000);
	//res.resource2();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
}
}

