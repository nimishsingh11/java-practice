package practice2;

import java.util.Arrays;

public class Reverse {
public static void main(String args[]) {
	StringBuilder str2=new StringBuilder("Sumo");
	StringBuilder strrev = str2.reverse();
	System.out.println(strrev);
	
	
	String str="nimish";
	String rev="";
	for(int i=0;i<str.length();i++) {
		rev=rev+str.charAt(str.length()-1-i);
	}
	System.out.println(rev);
	
	String str1="joe";
	char[] a = str1.toCharArray();
	String rev2="";
	for(int i=0;i<str1.length();i++) {
		char b=a[str1.length()-1-i];
		rev2=rev2+b;
	}
	System.out.println(rev2);
	
	
	String m="raju";
	String mrev="";
	for(int z=0;z<m.length();z++) {
	mrev=mrev+m.charAt(m.length()-1-z);
}
	System.out.println(mrev);
}
}
