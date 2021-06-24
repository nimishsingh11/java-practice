package threading;


import java.util.Random;
import java.util.concurrent.Callable;

public class Calll implements Callable{
	
	public Integer call() throws InterruptedException {
		 Random generator = new Random();  
	       Integer randomNumber = generator.nextInt();  
	       System.out.println(randomNumber);
	      Thread.sleep(1000);  
	       return randomNumber; 
	}
}
	 
	  
	     

