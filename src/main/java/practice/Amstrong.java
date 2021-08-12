package practice;

public class Amstrong {
	public static boolean arms(int num) {
		int n=num;
		int sum=0;
		while(n >= 1) {
			int d=n%10;
			sum=sum+ (d*d*d);
			n=n/10;
		}
		if(sum==num) {
		return true;
		}
		else {
			return false;
		}
	}
	
public static void main(String args[]) {
	
	System.out.println(Amstrong.arms(153));
}
}
