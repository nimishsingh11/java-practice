package deadlock;

public class Resource {
	final String resource1 = "ratan jaiswal";  
    final String resource2 = "vimal jaiswal"; 
 synchronized   public void resource1() {
    	System.out.println("Im resource1 ");
    	resource2();
    }
synchronized    public void resource2() {
    	System.out.println("Im resource2");
    //	resource1();
    }

}
