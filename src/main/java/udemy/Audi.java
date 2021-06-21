package udemy;

public class Audi extends Car {
	private int noOfSeats;
 Audi(int noCylinders,String cylindername,int noOfSeats){
	 super(6,"steel");
	 this.noOfSeats=noOfSeats;
	 
 }
 public int getNoOfSeats() {
	return noOfSeats;
}

public void startEngine() {
		System.out.println("start Engine by Audi");
		
	}
}
