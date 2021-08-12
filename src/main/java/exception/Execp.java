package exception;

public class Execp {
	int a[] = new int[5];

	public int[] m1(int m)  {
		if (m > a.length) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			for (int i = 0; i < m; i++) {
				this.a[i] = 2 * i;
				System.out.print(a[i] + " ");
			}
			return this.a;
		}
	}
	

	public static void main(String[] args) {
		Execp m = new Execp();
	
		try {
			m.m1(6);
		} 
		catch (Exception e) {
			System.out.println("array size is out of bound");
			e.printStackTrace();
		}
	
		try {
			System.out.println( m.a[6]);
		}
		catch(Exception e) {
			System.out.println("plz mention correct index");
		}
}
}
