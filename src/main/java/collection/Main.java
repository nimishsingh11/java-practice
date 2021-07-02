package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
public static void main(String[] args) {
	List<Dog> l=new ArrayList<>();
	Dog d1=new Dog("tiger");
	l.add(d1);
	l.add(new Dog("bruno"));
	Iterator<Dog> i=l.iterator();
	while(i.hasNext()) {
		System.out.println(i.next().name);
	}
	Dog arr[]=new Dog[l.size()];
	arr=l.toArray(arr);
	for (Dog dog : arr) {
		System.out.println(dog.name);
	}
}
}
