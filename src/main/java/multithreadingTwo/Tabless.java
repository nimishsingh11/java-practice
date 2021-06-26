package multithreadingTwo;

public class Tabless {
  
	public  void getTable(int no){
		
		
		for(int i=1;i<5;i++) {
			System.out.println(no*i +" run by " +Thread.currentThread().getName()  );
	
		
}
}
}