package threading;

class TestCallRun extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){
		  System.out.println(i);  
	    try{Thread.sleep(500);
	    }
	    catch(InterruptedException e){
	    	System.out.println(e);}  
	    
	  }  
	 }  
	
	}  