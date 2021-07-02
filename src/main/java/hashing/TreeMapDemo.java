package hashing;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
 public static void main(String[] args) {
	SortedMap<Integer,Dog> m=new TreeMap<>();
	m.put(1,new Dog("bruno"));
	m.put(3,new Dog("tiger"));
	m.put(2,new Dog("guchi"));
	m.put(4,new Dog("guchi"));
	
	System.out.println(m.keySet());
	System.out.println(m.values());
	System.out.println(m.get(4).getName());
	System.out.println(m.headMap(4));
}
 
}
