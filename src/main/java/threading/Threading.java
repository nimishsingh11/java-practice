package threading;

public class Threading {
  private void m1(){
	  m2();
	  System.out.println("m1 called");
	  
	  
  }
  private void m2(){
	  m3();
	  System.out.println("m2 called");
	 
  }
  private void m3(){
	  System.out.println("m3 called");
  }
  
  public static void main(String[] args) {
	    /*    int n = 8; // Number of threads
	        for (int i = 0; i < n; i++) {
	            MyThread object  = new MyThread();
	            object.run();
	        }*/
	       
	      	  TestCallRun t1=new TestCallRun();  
	      	  TestCallRun t2=new TestCallRun();  
	      	   t1.start();
	      	   t2.start();
	     	 // t1.run();  
	      //	  t2.run();  
	      	   System.out.println("im done");
	      	 }  
	        
	      // Threading th=new Threading();
	      //  th.m1();

}


