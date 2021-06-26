package notifyy;

public class Account {
private int balance=1000;
 
synchronized public void withdraw(int amount) {
	if (this.balance<5000) {
		System.out.println("U cannot withdraw.Plz deposit");
		try {
			wait();
			withdraw(amount);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	else if(this.balance<amount){
	System.out.println("Insufficient balance");
	try {
		wait();
		withdraw(amount);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	else {
		this.balance=balance-amount;
		System.out.println("The amount is withdrawn" + this.balance);
	}
}
synchronized public void  deposit(int amount) {
	this.balance=balance+amount;
	System.out.println("The balance is being deposited"+this.balance);
	while(this.balance<6000) {
	deposit(amount);
	}
	notify();

}
}
