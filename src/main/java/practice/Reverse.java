package practice;

public class Reverse {
	public static void inWords(Integer[] num) {
		String[] singleDigit= new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] doubleDigit= new String[]{ "ten", "eleven","twelve","thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		 String[] tensMultiple = new String[] { "","",   "twenty",  "thirty", "forty",  "fifty", "sixty", "seventy", "eighty", "ninety"  };
		int l= num.length;
	if(l == 1) {
		System.out.println(singleDigit[num[0]]);
	}
	else if(l==2) {
		if(num[0]==1) {
		System.out.println(doubleDigit[num[1]]);
		}
		else if( num[1]==0) {
			System.out.println(tensMultiple[num[0]]);
		}
		else {
			System.out.println(tensMultiple[num[0]]+" "+singleDigit[num[1]]);
		}
		
	}
	else if(l==3) {
		
	}
	}
	
	
public static void main(String[] args) {
	int number=14522;
	StringBuilder sb2=new StringBuilder();
	sb2.append(number);
	StringBuilder sb3=sb2.reverse();
	System.out.println(sb3);

	System.out.println("reverse is =  "+Integer.parseInt(sb3.toString()));
	
	//reverse
/*	int len2=String.valueOf(number).length();
	Number[] rev=new Number[len2];
	for(int z=0;z<len2;z++) {
		rev[z]=number%10;
		number= number/10;
	}
	for(int z=0;z<len2;z++) {
		System.out.print(rev[z]);
	}
	System.out.println();
	*/
	//write no in words
	Integer i=89;
	int len=String.valueOf(i).length();
	Integer[] testArray = new Integer[String.valueOf(i).length()];
	for(int m=0;m<len;m++) {
		testArray[len-1-m]=(i%10);
		i=i/10;
	}
	
	Reverse.inWords(testArray);
	
}
}
