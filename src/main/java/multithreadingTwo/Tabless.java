package multithreadingTwo;

public class Tabless {
  
	public void getTable(int no){
		synchronized (this) {
			
		
		for(int i=1;i<11;i++) {
			System.out.println(no*i +" run by " +Thread.currentThread().getName()  );
	}
		
}
}
}