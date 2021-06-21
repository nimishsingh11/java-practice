package udemy;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEntryFromConsole {
	private static Scanner scanner = new Scanner(System.in);

	public static int[] getIntegers(int capacity) {
		int[] array = new int[capacity];
		System.out.println("Enter " + capacity + " integer values:\r");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}

	public static void main(String[] args) {
		int[] myIntegers = getIntegers(5);
		System.out.println(Arrays.toString(myIntegers));

	}
}
