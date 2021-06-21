package Udemy;

public class BankAcc {
private int accountNumber;
private int balance;
private String customerName;
private String email;
int phNo;
BankAcc(){
	this(0,0,null,null,0);
	System.out.println("default constr");
}
BankAcc(int accountNumber,int balance,String customerName,String email,int phNo){
	this.accountNumber=accountNumber;
	this.balance=balance;
	this.customerName=customerName;
	this.email=email;
	this.phNo=phNo;
}

public int getAccountNumber() {
	return accountNumber;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getPhNo() {
	return phNo;
}

public void setPhNo(int phNo) {
	this.phNo = phNo;
}
public int deposit(int depositAmount) {
	this.balance+=depositAmount;
	return this.balance;
}
public int withdraw(int withdrawAmount) {
	if(this.balance<withdrawAmount) {
		System.out.println("balance is less than withdrawal amount.U cannot withdraw");
	}
	else {
	this.balance-=withdrawAmount;
	}
	return this.balance;
}
public static void main(String[] args) {
	BankAcc b=new BankAcc();
//BankAcc b=new BankAcc(1,1000,"nimish","n@gmail.com",8566555);
System.out.println(b.deposit(1000));
System.out.println(b.withdraw(3000));
}


}
