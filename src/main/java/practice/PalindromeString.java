package practice;

import java.util.Arrays;

public class PalindromeString {
public static void main(String[] args) {
	String str="455";
	Integer l=str.length();
	int flag=1;
   if(l%2 == 0)	{
	for(int i=0;i<l/2;i++) {
		if(str.charAt(i)!=str.charAt(l-i-1)) {
			flag=1;
			break;
		}
	}
	flag=0;
   }
  
   if(flag==0) {
	   System.out.println("is a palindrome");  
   }
   else {
	   System.out.println("not a palindrome");
   }
   
   
   
   
	//sorting of string
	String str2="nimish";
	char[] m=str2.toCharArray(); //changing to char array
	Arrays.sort(m);//sorting using method in Arrays
	String str3=String.valueOf(m);//changing from Array to string
//	System.out.println(str3);
	
	//reverse words in string
     String str4="sumanyu";
    char arr[]=str4.toCharArray();
    char arr2[]=new char[arr.length];
    for(int i=0 ;i<arr.length;i++) {
    	char temp=arr[arr.length-i-1];
    	arr2[i]=temp;
    }
   
    String str5=String.valueOf(arr2);
  //  System.out.println(str5);
    
    //count the number of vowels in a string
    String s1="nimisheu";
    char c1[]=s1.toCharArray();
    System.out.println(c1);
    int numVowels=0;
    for(int i=0;i<c1.length;i++) {
    	if(c1[i]== 'a'|| c1[i]== 'e' || c1[i]== 'i' ||c1[i]== 'o' ||c1[i]== 'u'){
    		numVowels++;
    		
    	}
    }
    System.out.println("no of vowels"+numVowels);
}
}
