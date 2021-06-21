package udemy;

public class Pc {
private Case theCase;
private Monitor monitor;
private MotherBoardHasA motherboard;
public Pc(Case theCase, Monitor monitor, MotherBoardHasA motherboard) {
	super();
	this.theCase = theCase;
	this.monitor = monitor;
	this.motherboard = motherboard;
}

@Override
public String toString() {
	return "Pc [theCase=" + theCase + ", monitor=" + monitor + ", motherboard=" + motherboard + "]";
}

public String powerUp() {
	System.out.println("drawlogo");
	drawlogo();
	return null;
}
private void drawlogo() {
	monitor.draw("red");
	
}

private Case getTheCase() {
	return theCase;
}
private  void setTheCase(Case theCase) {
	this.theCase = theCase;
}
private  Monitor getMonitor() {
	return monitor;
}
private  void setMonitor(Monitor monitor) {
	this.monitor = monitor;
}
private  MotherBoardHasA getMotherboard() {
	return motherboard;
}
private  void setMotherboard(MotherBoardHasA motherboard) {
	this.motherboard = motherboard;
}


}
