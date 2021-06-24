package schcronized;

import java.util.ArrayList;

public class Sender {
String msg;
ArrayList<String> names=new ArrayList<String>();
public void sendMsg(String msg) {
	System.out.println(msg);
}
public void add(String name) {
	names.add(name);
}
 public synchronized boolean remove() {
	if(names.size()>0) {
	names.remove(0);
	return true;
}
	return false;

}
}
