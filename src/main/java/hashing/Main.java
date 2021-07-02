package hashing;

public class Main {
	static Integer hash=0;
	
	 public static int hashCode( char value[]) {
	        int h = hash;
	        if (h == 0 && value.length > 0) {
	            char val[] = value;

	            for (int i = 0; i < value.length; i++) {
	                h = 31 * h + val[i];
	            }
	            hash = h;
	        }
	        return h;
	    }
public static void main(String[] args) {
	String str="sumo";
	String str1=new String("sumo");
	Integer i=10;
	
	System.out.println(Main.hashCode(str.toCharArray()));
	System.out.println(Main.hashCode(str1.toCharArray()));
	

}
}
