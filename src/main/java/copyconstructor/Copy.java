package copyconstructor;

public class Copy {
   int age;
    int age1;
   StringBuilder address;
   Copy d;
   Copy(int age, StringBuilder address){
	   this.age=age;
	   this.address=address;
   }
   @Override
public String toString() {
	return "Copy [age=" + age + ", address=" + address + "]";
}
Copy(Copy c){
	   this.age=c.age;
	   this.address=new StringBuilder(c.address);
   }

//call by value
int car(int age1) {
	this.age1=age1+1;
	return this.age1;
}
Copy bike(Copy d) {
	age1=100;
	return d;
}
}
