package collection;

import java.util.PriorityQueue;

public class PrioQue {
public static void main(String[] args) {
/*	PriorityQueue<Student> pq=new PriorityQueue<>();
	pq.add(new Student("Nimish",32));
	pq.add(new Student("Sumo",5));
	pq.add(new Student("Rudra",1));
	while(pq.size()>0) {
		pq.poll().print() ;	
	}*/
 
	PriorityQueue<College> co=new PriorityQueue<>(new ColgnameComparator());
    co.add(new College("MMT","001UP"));
    co.add(new College("BBD","002UP"));
    co.add(new College("HP","003UP"));
    while(co.size()>0) {
		co.poll().print() ;	
	}
 
	
	
	
}
}
