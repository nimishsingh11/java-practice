package inheritence;

public class Cub {
	String name;
	int age;
 Cub(String name ,int age){
	 this.name=name;
	 this.age=age;
 }
  float add(float a, float b) {
	  System.out.println("adding in parent");
	  return (a+b);
  }
}
