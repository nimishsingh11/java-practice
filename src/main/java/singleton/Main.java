package singleton;
public class Main {
	public static void main(String[] args) {
		Singleton a=Singleton.getInstance();
		System.out.println(a.name +" "+a.phno+"  "+a.home.pincode+" "+a.home.state);
		Singleton a2=Singleton.getInstance();
		System.out.println(a2.name);
		
		System.out.println(a.equals(a2));
		
		Home h1=Home.getInstHome();
		System.out.println(h1.state + "  "+h1.pincode);
		Home h2=Home.getInstHome();
		System.out.println(h1.equals(h2));
		
		
	}
	
}
