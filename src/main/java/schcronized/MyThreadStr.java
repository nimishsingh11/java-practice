package schcronized;

import java.util.concurrent.Callable;

public class MyThreadStr implements Callable<Object> {
 Str str;
 
 MyThreadStr(Str str){
	 this.str=str;
 }
 
@Override
public Object call() throws Exception {
	str.sl=str.appendBuilder();
	System.out.println( str.appendBuilder()+"  "+Thread.currentThread().getId() );
	return null;
}
}
