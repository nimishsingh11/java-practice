package threading;

public class MyString  {
	public static void main(String[] args) {
		 int n = 10; 

	        //*************************String Builder Test*******************************//
	        StringBuilder sb = new StringBuilder("Nimish");
	        MyThread3 builderThreads = new MyThread3(sb);
	        builderThreads.run();
	        
	       
	}

}










