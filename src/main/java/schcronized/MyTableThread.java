package schcronized;

public class MyTableThread extends Thread {
  Tables table;
  
  MyTableThread(Tables table){
	  this.table=table;
  }
  
  public void run() {
	  
	  table.getTable(2);
	  
	  
  }
}
