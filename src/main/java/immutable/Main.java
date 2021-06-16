package immutable;

public class Main {

	public static void main(String[] args) {
		MyImmutable obj  = new MyImmutable(30, "Harit");
		System.out.println(obj.getName() +" - "+obj.getAge());
	}
}
