package inheritence;

public class Lion extends Animal {
	int a;
	Cub cub;
	Lion(int a, Cub cub){
		this.a=a;
		this.cub=cub;
	}
  
	void display(){
	 System.out.println(a + cub.name); 
  }
void roll_no() {
	 
	  System.out.println("meth inherited");
	  
  }
  static void id() {
	  System.out.println("meth inherited");
  }
}
