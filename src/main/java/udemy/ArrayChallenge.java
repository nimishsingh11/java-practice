package udemy;

import java.util.Arrays;

import com.sun.java_cup.internal.runtime.Scanner;

public class ArrayChallenge {
	int a[] = new int[5];
	ArrayChallenge(int a[]) {
		this.a = a;
	}
	
	

	public void printArray() {
		System.out.print("Array is ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(this.a[i] + " ");
		}
		System.out.println();
	}
	public void sortedArray() {
		int c[] = new int[a.length];
		int d[]=new int[c.length];
		c = Arrays.copyOf(a, 5);
		Arrays.sort(c);
		System.out.println("Sorted Array"+Arrays.toString(c));
		System.out.println("Unsorted Array"+Arrays.toString(a));
		for (int i=0;i<c.length;i++) {
			int temp=c[c.length-1-i];
			d[i]=temp;	
		}
		System.out.println("Reversed Array"+Arrays.toString(d));
	}
	public static void main(String[] args) {
	
		
		int a[] = { 20, 10, 100, 5, 50 };
		ArrayChallenge ac = new ArrayChallenge(a);
		ac.sortedArray();
	}
}
