package exception;

import java.io.IOException;

public class Car {

	public int m1(int a, int b) throws IOException {
		if(a==3) {
			throw new IOException("value is 3");
		}
		if(a==7) {
			throw new NumberFormatException("value is 7");
		}
		return (a+b);
	}
	
	public static void main(String[] args) {
		Car c=new Car();
		try {
			System.out.println(c.m1(7, 2));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("i managed the exception");
		}
		
	}
}
