package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequee {
public static void main(String[] args) {
	Deque<String> dq=new ArrayDeque<>();
	dq.add("nimish");
	dq.add("sumu");
	dq.add("rudra");
	for (String s : dq) {
		System.out.print(s+ " ");
	}
	System.out.println();
	dq.offerLast("anshu");
	for (String s : dq) {
		System.out.print(s+" ");
	}
	System.out.println();
	System.out.println(dq.pollLast());
	for (String s : dq) {
		System.out.print(s+" ");
	}
	
}
}
