package arrays;

public class Arrayss {
	int a[]=new int[5];
	A ab[]=new A[3];
 
	
	
	
public static void main(String[] args) {
	Arrayss i =new Arrayss();
	for (int m=0 ; m<i.a.length ;m++) {
		i.a[m]=m;
		System.out.println(i.a[m]);
	}
	//i.a[5]=4;
	int n=10;
	for (int m=0; m<i.ab.length; m++) {
		
	i.ab[m]=new A(n);
	System.out.println(i.ab[m].geta());
	n=n+10;
	}
	
	
	
	
	
}
}
