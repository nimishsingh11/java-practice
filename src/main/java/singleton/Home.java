package singleton;

public class Home {
public String state;
public int pincode;
private static Home inst;
 private Home(){
	this.state="UP";
	this.pincode=66787;
}
 public static Home getInstHome(){
	if(inst==null) {
	inst=new Home();
	}
	return inst;
	}
	

 
}
