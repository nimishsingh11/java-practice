package collection;

import java.util.TreeSet;

public class TriSet {
public static void main(String[] args) {
	TreeSet<String> t=new TreeSet<>();
	t.add("tree");
	t.add("root");
	t.add("branches");
	t.add("stem");
	for (String s : t) {
		System.out.println(s);
	}
//	System.out.println("Poll first "+t.pollFirst());
	//System.out.println("Decending set "+t.descendingSet());
	System.out.println(t.headSet("root", false));
	System.out.println(t.tailSet("root", false));
	System.out.println(t.tailSet("root", true));
}
}
