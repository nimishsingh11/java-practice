package udemy;

public class Car {
boolean engine=true;
int noCylinders;
String cylindername;
int wheels=4;


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
public String startEngine() {
	System.out.println("start Engine by Parent");
	return cylindername;
}
public void accelerate() {
	System.out.println("accelerated by Parent");
}
public void brake() {
	System.out.println("brakes applied by parent");
}
}


