package collection;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
public static void main(String[] args) {
	Set<Integer> s=new TreeSet<>();
	s.add(40);
	s.add(10);
	s.add(10);
	
	for (Object object : s) {
		System.out.println(object);
	}
}
}
