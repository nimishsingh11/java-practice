package collection;

import java.util.HashMap;
import java.util.Map;

public class Maps {
public static void main(String[] args) {
	Map<Integer,String> m=new HashMap<>();
	m.put(1,"rahul");
	m.put(2,"chauhan");
	m.put(3,"jameel");
	m.remove(1,"rahul");
	m.put(4,"asad");
	m.putIfAbsent(1, "adil");
	for (Map.Entry<Integer,String> m1 : m.entrySet()) {
		System.out.println(m1.getKey()+" "+m1.getValue());
	}
	 HashMap<Integer,String> map=new HashMap<Integer,String>();  
     map.put(104,"Ravi");  
     map.putAll(m);  
     System.out.println("After invoking putAll() method ");  
     for(Map.Entry<Integer,String> m2:map.entrySet()){    
          System.out.println(m2.getKey()+" "+m2.getValue());    
         }  
     System.out.println(m.keySet());
     System.out.println(m.entrySet());
    
}
}
