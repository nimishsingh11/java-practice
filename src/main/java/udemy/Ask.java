package udemy;

import java.util.Arrays;

public class Ask {
	int a[] = new int[5];
	Ask(int a[]) {
		this.a = a;
	}
	public void sortedArray() {
		int c[] = new int[a.length];
		c = a;    //a new object is not created with the name c ????
		Arrays.sort(c);
		System.out.println("Sorted Array"+Arrays.toString(c));
		System.out.println("Unsorted Array"+Arrays.toString(a));
}

	public static void main(String[] args) {
		int a[]= {10,29,30,10,19};
	Ask ask=new Ask(a);	
	ask.sortedArray();
	}
}