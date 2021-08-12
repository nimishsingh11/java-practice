package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Bank {
	private String bankname;
	private ArrayList<Customer> customer;

	public Bank(String bankname, Customer customer) {
		this.bankname = bankname;
		this.customer=new ArrayList<Customer>();
	}
	public boolean addNewCustomer(String name,double initialAmount) {
		this.customer.add(new Customer(name,initialAmount));
		return true;
	}
	public boolean addtransaction(String customerName,double amount) {
		return true;
	}
	public boolean findCustomer(String cusName) {
		/*for(int i=0;i<customer.size();i++) {
		if(	customer.get(i).customerName == cusName) {
		 System.out.println("customer name exists");
		 return true;
		}*/
		for(Customer c:customer) {
		if(c.getCustomerName()==cusName) {
			System.out.println("customer name exists");
			 return true;
		}
		}
		System.out.println("customer does not exist.Added new customer");
		addNewCustomer( cusName,0);
		return false;
		
		
	}
	

	@Override
	public String toString() {
		return "Bank [bankname=" + bankname + ", customer=" + customer + "]";
	}

	public static void main(String[] args) {
		
		Bank b1 = new Bank("bob", null);
		b1.addNewCustomer("Anil", 1000);
		b1.addNewCustomer("Peppa", 1000);
		b1.addNewCustomer("Amit", 10);
	b1.findCustomer("bob");
	
		// System.out.println(b2.toString());
		// System.out.println(b3.toString());
		
		System.out.println(b1.toString());
	}
	
/*	boolean addNewCustomer(String cusName ,double initialAmount){
		this.customer.add(new Customer(cusName,initialAmount));
		return true;
	}*/

}
