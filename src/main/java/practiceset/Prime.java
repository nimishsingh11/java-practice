package practiceset;

public class Prime {
public static void main(String[] args) {
	int num=14;
	int f=0;
	for(int i=2;i<num-1 ;i++) {
		if(num%i ==0) {
			System.out.println("the no is not prime");
			f=1;
			break;
		}
	}
	if(f==0) {
		System.out.println("The no is prime");
	}
	}
}

