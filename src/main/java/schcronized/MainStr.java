package schcronized;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MainStr {
public static void main(String[] args) throws Exception {
	Str str=new Str(new StringBuffer("nimish"),new StringBuilder("singh"));
	
	Callable callable=new MyThreadStr(str);
	Thread t=new Thread(new FutureTask(callable));
	t.start();
   Thread t2=new Thread(new FutureTask(callable));
	t2.start();
 

}
}
