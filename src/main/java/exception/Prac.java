package exception;

public class Prac {
	
	void m1(int a,int b)  {
		if (b==0) {
			System.out.println("Number Format Exception");
			throw new NumberFormatException();	
		}
		System.out.println("No exception thrown");
	}
	
public static void main(String[] args) {
	Prac p=new Prac();
	try {
	p.m1(10, 0);
	}
	catch(Exception e) {
		System.out.println("exception handled");
		e.printStackTrace();
	}
	/*try {
		String a=null;
		a.charAt(0);
	}
	catch(Exception e){
		System.out.println("The string is null");
	}
	try {
		String a="nimish";
		a.charAt(10);
	}
	catch(Exception e){
		System.out.println("The stringIndex Out of bound exception");
	}
	try {
		
		int b=Integer.parseInt("nimish");
		System.out.println(b);
	}
	catch(Exception e){
		System.out.println("Number Format Exception");
	}*/
	
	
}
}
