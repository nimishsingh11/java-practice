package arraylist;

import java.util.ArrayList;


public class ListArray {
public static void main(String[] args) {
	
	ArrayList<String> groceryList=new ArrayList<String>();
	groceryList.add("pulses");
	groceryList.add("sugar");
	groceryList.add("salt");
	groceryList.add(0,"salt");
	groceryList.remove("salt");
	/*for(int i=0;i<groceryList.size();i++) {
	System.out.println(groceryList.get(i));
	}*/
	groceryList.forEach((n)->
		System.out.println(n));
	
	}
	
}
	
	
	

