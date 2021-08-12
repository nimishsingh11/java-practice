package arrays;

public class CloningArray {
  int a[]=new int[5];
  int b[]=a.clone();
  
  //cloning multidimentional array
  int c[][]=new int[3][4];
  int d[][]=c.clone();
  public static void main(String[] args) {
	CloningArray ca=new CloningArray();
	for(int i=0;i< ca.a.length;i++) {
		ca.a[i]=3*i;
		
	}
	System.out.println();
	for(int i=0;i< ca.a.length;i++) {
		//ca.b[i]=3*i;
		//System.out.print(ca.b[i]+" ");
		System.out.print(ca.a[i] + " ");
	}
	System.out.println();
	for(int i=0;i< ca.a.length;i++) {
		//ca.b[i]=3*i;
		//System.out.print(ca.b[i]+" ");
		System.out.print(ca.b[i] + " ");
	}
	System.out.println();
	for(int i=0;i<ca.c.length;i++) {
		for (int j=0 ;j<ca.c[0].length;j++) {
			ca.c[i][j]=i+j;
			
		}
	}
	for(int i=0;i<ca.c.length;i++) {
		for (int j=0 ;j<ca.c[0].length;j++) {
			System.out.print(ca.c[i][j]+" ");
		}
		System.out.println();
	}
	for(int i=0;i<ca.d.length;i++) {
		for (int j=0 ;j<ca.d[0].length;j++) {
			System.out.print(ca.d[i][j]+" ");
		}
		System.out.println();
	}
}
}
