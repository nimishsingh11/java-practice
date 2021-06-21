package udemy;

public class Monitor {
private String model;
private String manufacturer;
private int size;
private Resolution nativeResolution;
public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
	super();
	this.model = model;
	this.manufacturer = manufacturer;
	this.size = size;
	this.nativeResolution = nativeResolution;
}
public String draw(String color){
	return color;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getManufacturer() {
	return manufacturer;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public Resolution getNativeResolution() {
	return nativeResolution;
}
public void setNativeResolution(Resolution nativeResolution) {
	this.nativeResolution = nativeResolution;
}
@Override
public String toString() {
	return "Monitor [model=" + model + ", manufacturer=" + manufacturer + ", size=" + size + ", nativeResolution="
			+ nativeResolution + "]";
}

}
