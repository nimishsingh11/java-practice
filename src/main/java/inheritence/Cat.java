package inheritence;

public class Cat extends Cub {
	String name;
	double d;
	double e;

	Cat(String name, double d, double e) {
		super("nimish", 6);

		this.name = name;
		this.d = d;
		this.e = e;
	}

	double add(double d, double e) {

		System.out.println("adding in the cat");
		return d + e;

	}
}
