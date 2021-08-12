package practiceset;

public class LinearSearch {
 public static void main(String args[]) {
	 Integer num=3;
	Integer arr[]=new Integer[] {10,20,14,8,3};
	for(int i=0;i<arr.length;i++) {
		if(num==arr[i]) {
			System.out.println("The no "+num +"exists in the array at location "+i);
			break;
		}
	}
	System.out.println("The no "+num +" does not exist in the array");
 }
}
