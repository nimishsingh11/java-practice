package udemy;

public class Alto extends Car{
Alto(){
	super(4,"aluminium");
}
public String startEngine() {
	System.out.println("start Engine by Alto");
	return cylindername;
}
}
