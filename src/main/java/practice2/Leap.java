package practice2;

public class Leap {
	public static void main(String args[]) {
		int year=1800;
		if(year!=0) {
			if(year%400 ==0) {
				System.out.println("it is a leap year");
			}
			
			else if(year%100 ==0) {
				System.out.println("it is not a leap year");
			}
			else if(year%4 ==0) {
				System.out.println("it is a leap year");
			}
			else {
				
					System.out.println("it is not a leap year");
			
			}
		}
		
	}
	
}
