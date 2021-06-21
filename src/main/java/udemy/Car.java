package udemy;

public class Car {
private boolean engine=true;
private int noCylinders;
private String cylindername;
private int wheels=4;


Car(int noCylinders,String cylindername){
	this.noCylinders=noCylinders;
	this.cylindername=cylindername;
}
public boolean isEngine() {
	return engine;
}
public int getNoCylinders() {
	return noCylinders;
}
public String getCylindername() {
	return cylindername;
}
public void startEngine() {
	System.out.println("start Engine by Parent");

}
public void accelerate() {
	System.out.println("accelerated by Parent");
}
public void brake() {
	System.out.println("brakes applied by parent");
}
}


