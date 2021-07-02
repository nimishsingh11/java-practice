package collection;

public class College {
String colgName;
String code;
College(String colgName,String code){
	this.colgName=colgName;
	this.code=code;
}
public void print() {
	System.out.println(this.colgName + "  "+this.code);
}
}
