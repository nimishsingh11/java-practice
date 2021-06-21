package udemy;

public class Obj {
	// returning object
	int a;
	int b;

	Obj(int a,int b) {
		this.a = a;
		this.b=b;
	}

	Obj returnObj() {
		return new Obj(a + 20,10); // obj of parameterized constructor
	}

	//passing object in obj as parameter
	boolean equal(Obj o) {
		return (a==o.a && b==o.b );
	}
	public static void main(String[] args) {
		Obj o = new Obj(10,20);
		System.out.println(o.returnObj().a);
		Obj o2 = new Obj(20,20);
		System.out.println(o.equal(o2));

	}
}
