package exception;

public class MyException extends Exception {

	int accountNo[]=new int[5];
	int balance[]=new int[5];
	MyException() {
		
	}
	MyException(String msg){
		
	}
	void setAccAndBal(int[] accountNo, int[] balance) {
		this.accountNo =accountNo;
		this.balance =balance;
		for(int i=0 ;i<accountNo.length ;i++) {
		System.out.println("Acc "+accountNo[i]+ " has bal  "+ balance[i]);
		}
	}
	
	
	public static void main(String[] args) {
		MyException e=new MyException();
		int a[]= {10001,10002,10003,10004};
		int b[]= {101,201,100,50};
		e.setAccAndBal(a,b);
		
		try{
			for(int i=0 ;i<e.balance.length ;i++) {
			if(e.balance[i]<100) {
				throw new MyException("balance is very low"); 
			}
			}
		}
			catch(Exception e1) {
				e1.printStackTrace();
			}
	}
		
	
}
