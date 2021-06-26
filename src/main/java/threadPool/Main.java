package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
public static void main(String[] args) {
	MyQueue q=new MyQueue();
	for(int i=0;i<50;i++) {
		q.add("harit" + " "+i);
	}
	
	 ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
    for(int i=0;i<50;i++){  
         Runnable worker = new MyThread2(q);  
         executor.execute(worker);//calling execute method of ExecutorService
         
       }  
     executor.shutdown();  
   //  while (!executor.isTerminated()) { System.out.println(q.ll.size());  }  

     System.out.println("Finished all threads");  
 }  

}
