package inner_class;

public class InnerClassInsideMethod {
  String name;
  private String company="abc";
  void m1() {
	  String a="local variable"; //this variable is final or effectively final
	 // System.out.println("Inner method");
	  class Inner{
		void  m2(){
			System.out.println(a);
			company="changed company";
			System.out.println(company);
		// System.out.println("Inner");
		  }
	  }
	 
	  
	  Inner i=new Inner();
	  i.m2();
  }
 
 
}
