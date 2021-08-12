package practice;

public class Factorial {
	
	public static int fac(int number ) {
		int fac=1;
	for(int i=1;i<=number ;i++) {
		fac=fac*i;
	}
		

		return fac;
	}
public static void main(String args[]) {
	System.out.println(Factorial.fac(1));
}
}
