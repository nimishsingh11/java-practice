package udemy;

public class Audi extends Car {
 Audi(){
	 super(6,"steel");
 }
 public String startEngine() {
		System.out.println("start Engine by Audi");
		return cylindername;
	}
}
