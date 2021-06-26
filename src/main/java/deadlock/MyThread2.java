package deadlock;

public class MyThread2 extends Thread {
	Resource res;
	 MyThread2(Resource res){
		 this.res=res;
	 }
	 public void run() {
	
		 res.resource1();
		 System.out.println("Im holding resourse1"+Thread.currentThread().getId());
		 try {
			Thread.sleep(5000);
			//res.resource1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
