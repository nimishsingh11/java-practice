package schcronized;

public class MainSt {
	public static void main(String[] args) {
		
		Str str=new Str(new StringBuffer("ajay"),new StringBuilder("Sanju"));
		for(int i=0 ;i<10;i++) {
		MyThreadStr1 ts=new MyThreadStr1(str);
		ts.start();
	}
	}


}
