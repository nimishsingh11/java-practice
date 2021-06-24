package enumm;

public enum CoffesSize {
	BIG(8), HUGE(10), OVERWHELMING(16);

	private int ounces;

	CoffesSize(int ounces) {
		this.ounces = ounces;
		System.out.println("constructor called"+this.toString());
	}

	public int getOunces() {
		return ounces;
	}
}
