package schcronized;

public class Tables {
int no;

synchronized void getTable(int no) {
	for(int i=0 ;i<10 ;i++) {
		 System.out.println((i+1)*no);
	}
}
}
