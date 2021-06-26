package practiceset;

public class Fabonacci {
	int num1=0;
	int num2=1;
	public void fab() {
		for(int i=0;i<15;i++) {
		int num3=num1+num2;
		System.out.println(num3);
		num1=num2;
		num2=num3;
	}
	}
 public static void main(String[] args) {
	Fabonacci f=new Fabonacci();
	f.fab();
}
}
