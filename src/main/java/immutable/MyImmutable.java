package immutable;

public final class MyImmutable {
	
	private final int age;
	private final StringBuilder name;
	private final Address address;
	public MyImmutable(int age, StringBuilder name , Address address) {
		super();
		this.age = age;
		this.name = new StringBuilder(name);
		this.address=address;
	}


	public int getAge() {
		return age;
	}

	public StringBuilder getName() {
		return name;
	}
	public StringBuilder getArea() {
		return address.area;
	}
	public int getpincode() {
		return address.pincode;
	}
	
	
}
