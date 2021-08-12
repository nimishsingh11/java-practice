package arraylist;

public class Bills {
String item;
Integer price;
public String getItem() {
	return item;
}
public void setItem(String item) {
	this.item = item;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
public Bills(String item, Integer price) {
	super();
	this.item = item;
	this.price = price;
}
public Bills() {
	
}
@Override
public String toString() {
	return "Bills [item=" + item + ", price=" + price + "]";
}

}
