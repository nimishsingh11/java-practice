package udemy;

public class ObjCreation {
String a="nimish";

public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	//obj creation using new instance
	try {
	Class cls=Class.forName("udemy.ObjCreation");
	ObjCreation o=(ObjCreation)cls.newInstance();
	System.out.println(o.a);
	}
	catch(InstantiationException e) {
		e.printStackTrace();
	}
	catch(IllegalAccessException e) {
		e.printStackTrace();
	}
	catch(ClassNotFoundException e) {
		System.out.println("not found class");
		e.printStackTrace();
	}
}
}
