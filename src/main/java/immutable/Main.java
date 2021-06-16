package immutable;

public class Main {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("goa");
		Address a=new Address(s ,"karnataka",11111);
		
		StringBuilder sb=new  StringBuilder("Nimish");
		MyImmutable obj  = new MyImmutable(30, sb , a);
		//System.out.println(obj.getName());

		System.out.println(obj.getName() +" - "+obj.getAge() +" - "+obj.getArea() +"  -"+ obj.getpincode());
		sb.append("singh");
		s.append("great");
		System.out.println(obj.getName() +" - "+obj.getAge() +" - "+obj.getArea() +"  -"+ obj.getpincode());
		
	}
}
