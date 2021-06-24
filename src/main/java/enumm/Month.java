package enumm;

public enum Month {
JAN(13),FEB(14),MAR(12),APR(1),JUN(0),JUL(20),AUG(15);
private int classes;
private Month(int classes) {
	
	this.classes=classes;
	System.out.println("Constructors called by" +this.toString());
};
int getClasses(){
	return this.classes;
}
}
