package string;

import java.nio.CharBuffer;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Stringg {
String a="nimish";
String b=new String("nimish");
byte c[]= {66,65,68};
String d= new String(c);
CharBuffer e;



public static void main(String[] args) {
	Stringg s=new Stringg();
	//System.out.println(s.d);
	StringBuffer sb=new StringBuffer("abc");
	sb.append("Singh");
	String a2=sb.toString();
	//System.out.println(sb);
	//System.out.println(a2);
	
	StringTokenizer st=new StringTokenizer("amit,singh,chauhan" ,"," , false);
	 while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
	 StringJoiner sj=new StringJoiner(":","[","]");
	 sj.add("sumo").add("pratap").add("singh");
	 System.out.println(sj.toString());
	 
}
}
