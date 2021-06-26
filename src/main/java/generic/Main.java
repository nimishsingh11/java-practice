package generic;

public class Main {
public static void main(String[] args) {
	Test<String> t=new Test<>("ram");
	t.getA();
	Test<Integer> t1=new Test<>(15);
	t1.getA();
	
}
}
