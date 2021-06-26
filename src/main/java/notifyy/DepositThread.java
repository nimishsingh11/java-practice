package notifyy;

public class DepositThread extends Thread {
	Account account;
	DepositThread(Account account){
		this.account=account;
	}
 public void run() {
	this.account.deposit(500);
 }
}
