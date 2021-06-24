package threading;

public class Singleton  {
private static Singleton singletonInstance;
private String name;
private Singleton(){
 this.name="nimish";
 System.out.println("Hello how r u?????????");
}

synchronized public static Singleton  getInstance(){
	if(singletonInstance==null) {
		singletonInstance=new Singleton();
	}
	return singletonInstance;
}
public String getName() {
	return this.name;
}

}
