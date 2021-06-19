package interfaces;

public interface Hero {
	public  final String colg="HT";
	public static Boolean b =true;
	void show();
	 
    String full_name(String name);
    default void emp() {
    	String colg_name = "abc";
    	int a=10;
    	System.out.println(colg_name);
    }
    static void happy() {
    	System.out.println("happy");
    }
    
    
}
