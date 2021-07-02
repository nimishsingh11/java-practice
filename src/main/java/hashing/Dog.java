package hashing;

import java.util.Objects;

public class Dog {
String name;
Dog(String name){
	this.name=name;
}
@Override
public int hashCode() {
	return Objects.hash(name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Dog other = (Dog) obj;
	return Objects.equals(name, other.name);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
