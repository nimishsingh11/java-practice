package exception;

import java.io.IOException;

public class Car {
	public int m1(int a, int b) throws IOException, ExecptionEg {
		if(a==3) {
			throw new IOException("value is 3");
		}
		else if(a==7) {
			throw new ExecptionEg("value is 7");
		}
		System.out.println("The value is ...");
		return (a+b);
	}
	public void m2() {
		System.out.println("another method");
	}
	
	public static void main(String[] args)  {
		Car c=new Car();
		
		try {
			System.out.println(c.m1(3, 3));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(ExecptionEg e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("i managed the exception");
		}
		System.out.println("Exception handling");
		c.m2();
	}
}
