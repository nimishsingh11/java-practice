package data_type;

import java.util.Arrays;

public class DataType {
	char a = 'c';
	int m = 99;
	String o="name";
	int b = (int) a;
	
	char n = (char) m;

	
	boolean a1= Boolean.TRUE;
	Boolean a2= a1;
	boolean a3=a2;
	
	
	byte a4=122;
	int a5=a4;
	byte a6=(byte)a5;
	
	long a7=10;
	Long a8=a7;
	Long a9=10L; //mention L to tell dat it is a long data type v r entering
	
	Long a10=30L;
	float a11=2.2f;
	Float a12=2.2f;
	
	double a13=a11;
	Double a14;
	
	Double a15=(double) a11;
	Integer a17=54;
	Double a16=(double) a17;
	
	
	
	public static void main(String[] args) {
		DataType d = new DataType();
		
		
		int c1[]= {10,20,30};
		int c2[]=c1;
		c2[1]=50;
		int x1=10;
		int x2=x1;
		x2=20;
		
		
		
		
		System.out.println("int value of c" + d.b + "  " + d.n);
		System.out.println(d.a7 );
		
		System.out.println(x1 +"  "+x2 );
		System.out.println(Arrays.toString(c1) +"  "+Arrays.toString(c2) );
	}
}
