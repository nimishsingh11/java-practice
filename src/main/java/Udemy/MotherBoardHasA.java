package Udemy;

public class MotherBoardHasA {
 private String model;
 private  String manufacturer;
 private int ramSlots;
public String getModel() {
	return model;
}
@Override
public String toString() {
	return "MotherBoardHasA [model=" + model + ", manufacturer=" + manufacturer + ", ramSlots=" + ramSlots + "]";
}
public MotherBoardHasA(String model, String manufacturer, int ramSlots) {
	super();
	this.model = model;
	this.manufacturer = manufacturer;
	this.ramSlots = ramSlots;
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
public int getRamSlots() {
	return ramSlots;
}
public void setRamSlots(int ramSlots) {
	this.ramSlots = ramSlots;
}
}
