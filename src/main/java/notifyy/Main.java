package notifyy;

public class Main {
public static void main(String[] args) {
	Account acc=new Account();
	DepositThread t1=new DepositThread(acc);
	WithdrawlThread t2=new WithdrawlThread(acc);
	t2.start();
	t1.start();
	
}
}
