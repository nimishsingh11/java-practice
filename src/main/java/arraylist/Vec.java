package arraylist;

import java.util.ArrayDeque;
import java.util.Vector;

public class Vec {
	public static void main(String[] args) {
		 Vector<String> v=new Vector<String>();
		 v.add("sumo");
		 v.add("pratap");
		 v.add("singh");
		 v.remove(0);
		 v.forEach((n)->
			System.out.println(n));
ArrayDeque<String> dq=new ArrayDeque<String>();
dq.add("ab");
dq.add("cd");
dq.add("ef");
dq.add("gh");
dq.addFirst("mn");
dq.forEach((n)->
System.out.println(n));
   
	}
}
