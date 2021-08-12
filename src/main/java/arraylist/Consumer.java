package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Consumer {
String name;
String area;
ArrayList<Bills> bills;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public ArrayList<Bills> getBills() {
	return bills;
}
public void setBills(ArrayList<Bills> bills) {
	this.bills = bills;
}
public Consumer(String name, String area, ArrayList<Bills> bills) {
	super();
	this.name = name;
	this.area = area;
	this.bills = bills;
}
public Consumer() {
	
}

@Override
public String toString() {
	return "Consumer [name=" + name + ", area=" + area + ", bills=" + bills + "]";
}
public static void main(String args[]) {
	
	ArrayList<Bills> bill =new ArrayList<>();
	
	Bills b1=new Bills("grocery",1000);
	Bills b2=new Bills("stationery",3000);
	bill.add(b1);
	bill.add(b2);
	
	Consumer c=new Consumer("dany","lko",bill);
	System.out.println(c.toString());
}



}
