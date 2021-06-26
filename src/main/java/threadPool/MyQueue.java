package threadPool;

import java.util.LinkedList;

public class MyQueue {
LinkedList<String> ll=new LinkedList<String>();


public void add(String str) {
	ll.add(str);
//	System.out.println("added data");
}
public String getAndremove() {
	String str=ll.get(0);
	ll.remove(0);
	return str;
}


}
