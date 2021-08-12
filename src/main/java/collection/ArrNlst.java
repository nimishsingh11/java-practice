package collection;

import java.util.Arrays;
import java.util.List;

public class ArrNlst {
 public static void main(String[] args) {
	Integer arr[]= {1,2,32,5,3,5};
	List<Integer> l=Arrays.asList(arr); //array to list
	//System.out.println(l.size());
	//System.out.println(l.get(2));
	//System.out.println(arr.length);
	
	l.set(0,10);
	for (Integer i : l) {
		System.out.print(i +" ");
		
	}
	System.out.println();
	for (Integer i1 : arr) {
		System.out.print(i1+" ");
	}
	System.out.println();
	Integer arr2[]=new Integer[l.size()];
	arr2=l.toArray(arr2);
	for (Integer a1 : arr2) {
		System.out.print(a1+" ");
		
	}
}
}
