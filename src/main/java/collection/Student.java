package collection;

public class Student implements Comparable<Student> {
 String name;
 Integer age;
 
 Student(String name,Integer age){
	 this.name=name;
	 this.age=age;
 }
 public void print() {
	 System.out.println(this.name+" "+this.age);
 }
@Override
public int compareTo(Student o) {
	if(this.age>o.age)
		return 1;
	else if(this.age<o.age)
		return -1;
	else
		return 0;
}
}
