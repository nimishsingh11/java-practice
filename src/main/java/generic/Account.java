package generic;

public class Account {
 
	public <T> void display(T acc) {
		System.out.println(acc);
	}
	public <T> T getAcc(T acc) {
		
		return acc;
	}
	
	public static void main(String[] args) {
		Account account=new Account();
		account.display(123456);
		System.out.println(account.getAcc('d'));
	}
}
