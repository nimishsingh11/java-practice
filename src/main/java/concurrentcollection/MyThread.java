package concurrentcollection;

import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread extends Thread{
CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<String>();


public void run() {
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	list.add("sumo");
	System.out.println(Thread.currentThread().getId()+"  "+list);
}
}
