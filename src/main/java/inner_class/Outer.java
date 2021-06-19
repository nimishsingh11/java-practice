package inner_class;



class Outer{
	String name;
	private int salary;
	
	void m1(String name ,int salary){
		this.name=name;
		this.salary=salary;
		System.out.println(name+"  "+salary);
		Inner i=new Inner();
		i.m2(2000 );
		System.out.println(this);
		
}
	
	class Inner{
		private int bonus;
		void m2(int bonus ) {
			System.out.println(name);
			System.out.println(salary+bonus);
			System.out.println(this); //reference of inner class
			//System.out.println(i);
			System.out.println(Outer.this);
		}
	}
}