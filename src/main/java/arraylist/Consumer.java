package arraylist;

public class Consumer {
String name;
int age;

public Consumer(String name, int age) {
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "Consumer [name=" + name + ", age=" + age + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


}
