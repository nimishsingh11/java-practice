package notifyy;

public class WithdrawlThread extends Thread {
	Account account;
	WithdrawlThread(Account account){
		this.account=account;
	}
 public void run() {
	this.account.withdraw(5000);;
 }
}
