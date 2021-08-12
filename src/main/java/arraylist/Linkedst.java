package arraylist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedst {
 public static void  printList(LinkedList<String> ll) {
	for(String a:ll) {
		System.out.println(a);
	}
 }
 public static boolean addInOrder(LinkedList<String> ll , String name) {
	 Boolean flag=true;
	for(String a:ll) {
		//System.out.println(a.compareTo(name));
		int b=a.compareTo(name);
		if(b==0) {
			System.out.println("The name already exist");
			flag=false;
		
		}
	}
	if(flag==true) {
			ll.add(name);
			
			
	}	
	
	 
	 
	 /* ListIterator<String> sll=ll.listIterator();
	 while(sll.hasNext()) {
		 int comparison=sll.next().compareTo(name);
		 if(comparison==0) {
			 System.out.println(name +"already added");
			 return false;
		 }else if (comparison>0) {
			 sll.previous();
			 sll.add(name);
			 System.out.println(name +" added");
			 return true;
		 }
		 else if (comparison<0) {
			
		 }
	 }
	 sll.add(name);*/
	return flag;
 }
 
 
 public static void main(String[] args) {
	 
	 LinkedList<String> ll=new LinkedList<String>();
	ll.add("sumo");
	ll.add("pratap");
	ll.add("singh");
	
//	ll.forEach((n)->
	//System.out.println(n));
	
	//printList(ll);
	System.out.println(addInOrder(ll,"sumo"));
	//printList(ll);
	System.out.println(addInOrder(ll,"zai"));
	printList(ll);
	
}
}
