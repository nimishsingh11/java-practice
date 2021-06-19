package copyconstructor;

public class Main {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("aman");
	Copy c1=new Copy(10,sb);
	Copy c2=new Copy(c1);
	//System.out.println("cons"+c1);
	//System.out.println("copy cons"+c2);
	sb.append("singh");
	//System.out.println("cons"+c1);
	//System.out.println("copy cons"+c2);
	
	System.out.println(c1.car(20));
	System.out.println(c1.age1);
	System.out.println(c1.bike(c1));
	System.out.println(c1.age1);
	
}
}
