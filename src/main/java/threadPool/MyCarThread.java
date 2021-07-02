package threadPool;

public class MyCarThread implements Runnable {
	Car car;
	MyCarThread(Car car){
		this.car=car;
	}
public void run() {

	car.display();
}
}
