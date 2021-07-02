package comparableNcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
String name;
Integer rollno;
Integer age;
Student(String name,Integer rollno,Integer age){
	this.name=name;
	this.rollno=rollno;
	this.age=age;
}
public static void main(String[] args) {
	ArrayList<Student> list=new ArrayList<>();
	list.add(new Student("nimish",12,55));
	list.add(new Student("mish",12,22));
	list.add(new Student("sh",12,36));
	Collections.sort(list,new CompareClass());
	for (Student student : list) {
		System.out.println(student.name+" "+student.age);
	}
	
}
}
