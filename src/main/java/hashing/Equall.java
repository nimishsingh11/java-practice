package hashing;

import java.util.Objects;

public class Equall {
String name;
Integer rollNo;
Equall(String name,Integer rollNo){
	this.name=name;
	this.rollNo=rollNo;
}
public static void main(String[] args) {
	Equall e1=new Equall("nimish",10);
	Equall e2=new Equall("nimish",10);
	
	System.out.println(e1.equals(e2));
	
	System.out.println(e1 +" "+e2);
}
@Override
public int hashCode() {
	return Objects.hash(name, rollNo);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Equall other = (Equall) obj;
	return Objects.equals(name, other.name) && Objects.equals(rollNo, other.rollNo);
}
}
