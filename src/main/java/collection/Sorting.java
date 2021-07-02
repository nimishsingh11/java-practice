package collection;

import java.util.ArrayList;
import java.util.Collections;



public class Sorting {
public static void main(String[] args) {
	ArrayList<Compare> al=new ArrayList<Compare>();
	al.add(new Compare(1,"sumo",50)) ;
	al.add(new Compare(2,"adil",55)) ;
	al.add(new Compare(3,"amit",35)) ;
	al.add(new Compare(4,"suman",55)) ;
	
	
	Collections.sort(al);
	for (Compare c : al) {
		System.out.println(c.age+" "+c.name+" "+c.rollNo);
	}
}
}
