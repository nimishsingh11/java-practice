package data_type;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		 int a[]=new int[5] ;
		 a[4]=60;
		 
		 for(int i=0; i<5 ; i++) {
		// System.out.println(a[i]);
		 } 	
		
		
		int c[]=new int[5];
		c[0]=5;
	//	System.out.println(c[0]);
		
		Operators o[]=new Operators[4];
		o[0]=new Operators();
		o[1]=new Operators();
		o[2]=new Operators();
		for(int i=0 ; i<o.length ;i++) {
		//System.out.println(o[i]);
		}
		int z=10;
		int d[]=new int[5];
		for(int i=0;i<d.length;i++) {
		     d[i]=z;
		     z++;
		System.out.println("array is  "+d[i]);
		i++;
		
		
		}
	int cloned_d[]=d.clone();
	for(int i=0;i<d.length;i++) {
		System.out.println("cloned array is  "+cloned_d[i]);	
	}
	
	
	int arr[][]= {{10,20,30},{40,50,60}};
	int cloned_arr[][]=arr.clone();
	
	for(int i=0;i<2;i++) {
		for(int j=0;j<3;j++)
		System.out.println("cloned arr[] []array is  "+cloned_arr[i][j]);	
	}
	
	}
}
