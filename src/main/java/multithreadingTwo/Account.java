package multithreadingTwo;

public class Account {
private int balance;
public static int count=10;

Account(int balance){
	this.balance=balance;
}
public  int getBalance() {
	System.out.println("Current balance is "+balance+"checked by " +Thread.currentThread().getId());
	return this.balance;
}
public synchronized boolean withdraw(int withdrawal) {
	if(this.balance >=withdrawal) {
		balance=balance-withdrawal;
		System.out.println(withdrawal +" is withdrawn by "+ Thread.currentThread().getId());
		return true;
	}
	System.out.println("Cannot be withdrawn  "+ Thread.currentThread().getId());
	return false;
}

public static int getCount() {
	System.out.println(count +"by  "+Thread.currentThread().getId());
	return count;
}
}
