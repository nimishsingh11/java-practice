package udemy;

public class Main {
public static void main(String[] args) {
	Dimensions dimension=new Dimensions(500,100,200);
	Resolution resolution=new Resolution(100,200);
	Monitor monitor=new Monitor("15K","Intel",15,resolution);
	System.out.println(monitor.draw("red"));
	Case dcase=new Case("abc","intel","100kv",dimension);
	MotherBoardHasA motherboard=new MotherBoardHasA("abc","HP",500);
	Pc pc=new Pc(dcase,monitor,motherboard);
	System.out.println(pc.toString());
	//System.out.println(pc.getMonitor().draw("blue"));
//	System.out.println(pc.draw("name"));
	System.out.println(pc.powerUp());
}
}
