package multithreadingTwo;

public class MyThreadAccessAccount extends Thread{
  Account account;
  MyThreadAccessAccount(Account account){
	  this.account=account;
  }
  
  public void run() {
	//  account.getBalance();
	//  account.withdraw(1000) ;
     Account.getCount();
  }
}
