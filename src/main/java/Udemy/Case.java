package Udemy;

public class Case {
private String model;
private String manufacturer;
private String powerSupply;
private Dimensions dimensions;
@Override
public String toString() {
	return "Case [model=" + model + ", manufacturer=" + manufacturer + ", powerSupply=" + powerSupply + ", dimensions="
			+ dimensions + "]";
}
public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
	super();
	this.model = model;
	this.manufacturer = manufacturer;
	this.powerSupply = powerSupply;
	this.dimensions = dimensions;
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
public String getPowerSupply() {
	return powerSupply;
}
public void setPowerSupply(String powerSupply) {
	this.powerSupply = powerSupply;
}
public Dimensions getDimensions() {
	return dimensions;
}
public void setDimensions(Dimensions dimensions) {
	this.dimensions = dimensions;
}
}
