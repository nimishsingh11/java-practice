package udemy;

import java.util.Arrays;

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
		c = a;
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		int a[] = { 20, 10, 100, 5, 50 };
		ArrayChallenge ac = new ArrayChallenge(a);
		ac.sortedArray();
	}
}
