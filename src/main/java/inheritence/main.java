package inheritence;

public class main {
	public static void main(String[] args) {
		Cub c=new Cub("ballo");
		Animal a=new Lion(10,c);
		((Lion) a).display();
		
		a.roll_no();
		Animal.id();
		a.name();
	} 

}
