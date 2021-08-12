package practiceset;

public class Largest {
public static void main(String[] args) {
	int n1=30 , n2=40,n3=10;
	if(n1>n2) {
		if(n1>n3) {
			System.out.println(n1 +"is greatest");
		}
		else if(n3>n2){
			System.out.println(n3 +"is greatest");
		}
	}
	else {
		System.out.println(n2 +"is greatest");
	}

//sum of array elements
Integer[] arr=new Integer[5];
int sum=0;
for(int i=0;i<5;i++) {
arr[i]=i;
sum=sum+arr[i];
}
System.out.println(sum);
}
}
