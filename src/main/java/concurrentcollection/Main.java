package concurrentcollection;

public class Main {
public static void main(String[] args) {
	
	MyThread t=new MyThread();
	t.list.add("nimish");
	t.list.add("suman");
	t.list.add("nimish");
	t.start();
/*	for (String string : t.list) {
		System.out.println(string);
	}*/
	t.list.add("vihaan");
	t.list.add("vihaan");
	
}
}
