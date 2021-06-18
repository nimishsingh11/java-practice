package data_type;

public class Operators{
	public static void main(String[] args) {
		boolean a=true;
		if(a) { //a==!true
			System.out.println(a);
		}
		
		//boolean b = a==true ? true : false ;
		boolean b = a ? true : false ;
		System.out.println(b);
		
		
	double a1=20.00;
	double a3=80.00;
	double a4=(a1+a3)*100.00; 
	double a5=a4%40;
	System.out.println(a5);
	
	
	boolean a7=(a5==0)?true :false ;
	System.out.println(a7);
	
	if(a7!=true) {
		System.out.println("got some remainder");
	}
	
	int a10=-15;
	System.out.println(a10 >>>1);
	
	int z=10;
	Integer z2=new Integer(z);
	System.out.println(z2);
	int z3=z2;
	System.out.println(z3);
	
	}	
	}

