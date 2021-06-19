package arrays;

public class Ar {
	int a[] = new int[5];
	String fish[] = new String[5];
    
	void printArr(int a[]) {
		for (int i = 0; i < a.length; i++) {
			this.a[i] = a[i];
			System.out.println(this.a[i]);
		}
	}

	String[] returnArr() {
		String str = "star";
		for (int i = 0; i < fish.length; i++) {
			this.fish[i] = str;
			str = str + "fish";
		}
		return this.fish;
	}
	
	
public static void main(String[] args) {
		Ar ar = new Ar();
		int b[] = { 1, 2, 3, 4 };
		ar.printArr(b);
		String m[] = ar.returnArr();
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + " ");
		}
		System.out.println();
		System.out.println(ar.a.getClass());
		System.out.println(ar.fish.getClass().getGenericSuperclass());
	}
}
