package inheritence;

abstract class Animal {
	Animal(){
		System.out.println("constructor called");//called wen instance of inherited class is created
	}
 final void name() {
	 System.out.println("final method in abstract class");
 }
 void roll_no() {
	 System.out.println("meth in parent");
 }
 static void id() {
	 System.out.println("meth in parent");
 }

}
