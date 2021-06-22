package arraylist;

import java.util.ArrayList;

public class Customer {
	String customerName;
	ArrayList<Double> transaction= new ArrayList<Double>();

	Customer(String customerName, double amount) {
		this.customerName = customerName;
		addAmount( amount);
		//this.transaction.add(amount);
		
	}
	
	public void addAmount(double amount) {
		transaction.add(amount);
		System.out.println(amount + "amount added");
	}
	public String getCustomerName() {
		return customerName;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", transaction=" + transaction + "]";
	}
	public ArrayList<Double> getTransaction() {
		return transaction;
	}
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
