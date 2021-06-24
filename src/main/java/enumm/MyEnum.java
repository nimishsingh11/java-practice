package enumm;

public enum MyEnum {
 RED,GREEN,BLUE;
	
	private MyEnum() {
		System.out.println("Contructor called for" +this.toString());
	}
}
