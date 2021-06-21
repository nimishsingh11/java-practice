package udemy;

public class MainCar {
public static void main(String[] args) {
	Car c = null;
	
	
	//System.out.println(a.startEngine());
//	System.out.println(a.getNoCylinders());
	
	int no=2;
	switch(no) {
	case 1:
		c=new Alto();
		//break;
	case 2: 
		c=new Audi(1,"Abc",5);
		//break;
	}
	c.startEngine();
//	System.out.println(c.getNoCylinders());
	System.out.println(((Audi) c).getNoOfSeats());
}
}
