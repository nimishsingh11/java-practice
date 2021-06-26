package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collection {
public static void main(String[] args) {
	List<String> l= new ArrayList<>();
	l.add("anshu");
	l.add("harit");
	l.add("rudra");
	//System.out.println(l.get(0));
	Iterator i=l.iterator();
	while(i.hasNext()) {
	//	System.out.println(i.next());
	}
	for (String string : l) {
	//	System.out.println(string);
	}
	Set<Integer> s=new TreeSet<>();
	s.add(50);
	s.add(15);
	s.add(30);
	s.add(12);
	Iterator<Integer> i2=s.iterator();
	while(i2.hasNext()) {
	//	System.out.println(i2.next());
	}
	Map<Integer ,String> map=new HashMap<>();  
    //Adding elements to map  
    map.put(1,"Amit");  
    map.put(5,"Rahul");  
    map.put(2,"Jai");  
    map.put(6,"Amit");  
    //Traversing Map  
    Set<Map.Entry<Integer ,String>> set=map.entrySet();//Converting to Set so that we can traverse  
    Iterator<Map.Entry<Integer ,String>> itr=set.iterator();  
    while(itr.hasNext()){  
        //Converting to Map.Entry so that we can get key and value separately  
   System.out.println("hii");
     //   System.out.println(itr.next().getKey()+" "+itr.next().getValue());  
    }  
	
}
}
