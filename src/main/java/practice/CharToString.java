package practice;

public class CharToString {
	public static void main(String[] args) {
		char a='a';
		//String b=Character.toString(a) ;
		String b=String.valueOf(a);
		System.out.println(b);
		
		String str="nimish";
		for (int i=0 ;i<str.length();i++) {
			char d=str.charAt(i);
			System.out.println(d);
		}
	}

}
