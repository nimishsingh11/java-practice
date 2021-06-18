package data_type;

public class Statements {
	public static void main(String[] args) {
		int a = 100;
		int b;
		b = ++a;

		System.out.println(b);
		b = a++;
		System.out.println(b);
		System.out.println(a);

		boolean b1 = false;
		if (b1) {// shortcut b1==true
			System.out.println("false");
		} else {
			System.out.println("true");
		}
		
	    
        boolean newGameOver=true;
		int score=10000;
		int levelCompleted=8;
		int bonus=200;
		if(newGameOver) {
		int finalScore=score+(levelCompleted * bonus);
		System.out.println(finalScore);
		}
	    
	}
}
