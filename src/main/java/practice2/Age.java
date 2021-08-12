package practice2;

public class Age {
	public enum Month { Jan,Feb,Mar,Apr }    
public static void main(String[] args) {
	Month[] m=Month.values();
	for(Month month:m) {
	switch(month) {
	case Jan:
		   System.out.println("This is winter month");  
           break;  
	case Feb:
		   System.out.println("This is spring month");  
        break;  
	case Mar:
		   System.out.println("This is autumn month");  
     break;  
	}
}
}
}

