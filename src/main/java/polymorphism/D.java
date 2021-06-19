package polymorphism;

public class D extends C {
  B m1() {
	  System.out.println("inside D");
	  return new B();
  }
}
