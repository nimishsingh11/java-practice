package interfaces;

public class Book extends Head implements Hero {
	int a[]= {1,2,1};
	
	public void show() {
		System.out.println("hii");
	}
	public String full_name(String name){
		System.out.println("Child meth");
		return name;
	}
	public int m1() {
		System.out.println("return 1");
		return 1;
	}
	//returning null as a obbj reference
	Head m2(){
		System.out.println("return null");
		return null;
	}
	
	//returning array
	int[] array() {
		return a;
	}
}
