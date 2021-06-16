package immutable;

public final class MyImmutable {
	
	private final int age;
	private final String name;
	
	public MyImmutable(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
}
