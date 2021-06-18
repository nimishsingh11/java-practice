package interfaces;

import java.util.Arrays;

public class Calling {
	public static void main(String[] args) {
		 Book h=new Book();
		 if (h instanceof Hero){
			System.out.println("true"); 
		 }
		 h.emp();
		 h.m1();
		 h.m2();
		 System.out.println (Arrays.toString(h.array()));
		 System.out.println(h.full_name("nimish"));
				 }

}
