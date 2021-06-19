package arrays;

public class MultiDimentional {
	static String a[][] = new String[2][3];

	public static void main(String[] args) {
		for (int i = 0; i <a.length ; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j]=i +"" +j;
			}
		}
		for (int i = 0; i <a.length ; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			}
	}
}
