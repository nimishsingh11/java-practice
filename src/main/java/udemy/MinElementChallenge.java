package udemy;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
 static Scanner sc=new Scanner(System.in);
 int min;
 static int array[];
  public static int[] getIntegers(int size) {
	  array= new int[size] ;
	  System.out.println("Enter numbers");
	  for(int i=0;i<size;i++) {
		  array[i]=sc.nextInt();
	  }
	  return array;
  }
  public int findMin() {
	  for(int i=0; i<array.length-1;i++) {
		  if (array[i]<array[i+1]) {
			  min=array[i];
		  }
	  }
	  return min;
  }
  public static void main(String[] args) {
	  MinElementChallenge min=new MinElementChallenge();
	 System.out.println(Arrays.toString(min.getIntegers(5))); 
	  System.out.println(min.findMin());
}
}

