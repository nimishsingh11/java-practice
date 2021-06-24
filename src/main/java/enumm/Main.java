package enumm;

public class Main {
	enum Days{
		SUN,MON,TUES,WED;
	}
	
	
public static void main(String[] args) {
	Month.APR.toString();
	System.out.println(Month.AUG.getClasses());
	Month arrMonth[]=Month.values();
	for(int i=0;i<arrMonth.length;i++) {
		System.out.println(arrMonth[i]+" "+arrMonth[i].ordinal()+" "+arrMonth[i].getClasses());
	}
	
	
	
	
	
/*	String str="SUN";
// System.out.println(Days.valueOf(str)) ;
 Days arr[]=Days.values();
 for(int i=0;i<arr.length;i++) {
 System.out.println(arr[i] +" "+ arr[i].ordinal());
 }*/
	
//MyEnum c1=MyEnum.GREEN;
	
/*System.out.println("Ounces in Big"+CoffesSize.BIG.getOunces());
CoffesSize arr[]=CoffesSize.values();
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]+"  "+arr[i].getOunces());
}*/
	
}
}
