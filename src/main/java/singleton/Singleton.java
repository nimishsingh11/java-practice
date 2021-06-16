package singleton;

public class Singleton {
     public  String name;
     public  int phno;
     public Home home;
     private static Singleton instance;
     
     private Singleton() {
    	this. name="nimish";
    	this. phno=176782;
    	this.home= Home.getInstHome();
    	
		
	}
     
  public static  Singleton getInstance() {
	  if (instance == null) {
    	 instance= new Singleton();
	  }
    	 return instance;
     }
	
	
}
