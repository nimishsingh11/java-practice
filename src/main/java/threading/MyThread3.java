package threading;

public class MyThread3  extends Thread{
	 StringBuilder sb;

	    public MyThread3 (StringBuilder sb) {
	        this.sb = sb;
	    }

	    @Override
	    public void run() {
	        for (int i = 0; i < 6; i++) {
	            sb.append("a");
	            System.out.println(sb);
	        }

}
}
