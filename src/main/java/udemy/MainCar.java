package udemy;

public class MainCar {
public static void main(String[] args) {
	Car c = null;
	
	
	//System.out.println(a.startEngine());
//	System.out.println(a.getNoCylinders());
	
	int no=1;
	switch(no) {
	case 1:
		c=new Alto();
		//break;
	case 2: 
		c=new Audi();
		//break;
	}
	System.out.println(c.startEngine());
	System.out.println(c.getNoCylinders());
}
}
