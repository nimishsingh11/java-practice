package hashing;

import java.util.Objects;

public class Student {
		String name;
		Integer rollno;
		Integer age;
		Student(String name,Integer rollno,Integer age){
			this.name=name;
			this.rollno=rollno;
			this.age=age;
		}
		
		
	/*	public int hashCode() {
			return Objects.hash(age, name, rollno);
		}
*/
		@Override
		public boolean equals(Object obj) {
		
			Student stu = (Student) obj;
			return (stu.name==this.name && stu.age==this.age&& stu.rollno==this.rollno);
		}

		public static void main(String[] args) {
			Student s1=new Student("nimish",10,20);
			Student s2=new Student("nimish",10,20);
			Student s3=new Student("sumo",10,20);
			Student s4=s1;
			//System.out.println(s1.equals(s2));
			//System.out.println(s1.equals(s3));
			//System.out.println(s1.equals(s4));
		//	System.out.println(s1.hashCode());
		//	System.out.println(s2.hashCode());
		//	System.out.println(s3.hashCode());
		//	System.out.println(s4.hashCode());
			String str1="nimish";
			String str4="singh";
			String str2=new String("nimish");
			String str3=new String("aman");
			
			System.out.println(str1.hashCode());
			System.out.println(str2.hashCode());
			System.out.println(str3.hashCode());
			System.out.println(str4.hashCode());
		System.out.println(System.identityHashCode(str1));	
			
		}
		
		
		
}
