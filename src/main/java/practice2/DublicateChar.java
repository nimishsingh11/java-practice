package practice2;

import java.util.HashMap;
import java.util.Map;

public class DublicateChar {
	public static void main(String[] args) {
Map<Character,Integer> count=new HashMap<>();
 String str="aeropalne";
 
 //insert char in the hashmap as key if it does not exist and put value=1 and if it exist then increase the value by 1
 for(int i=0;i<str.length();i++) {
	char j=str.charAt(i) ;
	if(count.get(j)!=null) {
		Integer k=count.get(j)+1 ;
		count.put(j, k);
	}
	else {
	count.put(j, 1);
	}
 }
 for(Map.Entry a: count.entrySet()) {
	 System.out.println(a.getKey()+"  "+a.getValue());
 }
 
 
}
}
