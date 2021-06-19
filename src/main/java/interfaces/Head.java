package interfaces;

public  class Head  {
	String name;
	
public String m1(String name){
	System.out.println("hellppp");
	return name;
}
Head m2(){
	Head h1=new Head();
	if(h1 instanceof Head) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	return h1;
}




}
