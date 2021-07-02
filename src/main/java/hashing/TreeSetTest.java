package hashing;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
public static void main(String[] args) {
	Set<String> t=new TreeSet<>();
    t.add("sumo");
    t.add("pratap");
    t.add("singh");
    for (String string : t) {
		System.out.println(string);
	}
}
}
