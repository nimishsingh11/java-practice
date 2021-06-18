package data_type;

public class Exercise {
	int number;
	double kilometerPerHour;
	double milesPerHour;
void checkNumber(int number) {
	if(number>0) {
		System.out.println("positive");
	}
	else if(number<0) {
		System.out.println("negative");
		
	}
	else {
		System.out.println("equal to zero");
	}
}

long toMilesPerHour(double kilometerPerHour) {
	if(kilometerPerHour<0) {
		return -1;
	}
	return Math.round(kilometerPerHour);
}

 void printConversion(double kilometerPerHour) {
	 milesPerHour=Math.round(kilometerPerHour *.621);
	  if(milesPerHour <0) {
		  System.out.println("Invalid");
	  }
	  else {
		  System.out.println(milesPerHour);
	  }
 }
 
 //overloading
 double feet;
 double inches;
 double cm;
 double calcFeetAndInchesToCentimeters(double feet,double inches){
	if(feet >=0 && inches>=0 &&inches<=12 ) {
		inches=inches+feet*12;
		cm=(inches* 2.54 );
		return cm;
	}
	else {
		return -1;
	}
 }
 double calcFeetAndInchesToCentimeters(double feet){
		if(feet >=0 && inches>=0 &&inches<=12 ) {
			inches=inches+feet*12;
			cm=(inches* 2.54 );
			return cm;
		}
		else {
			return -1;
		}
	 }
 boolean n;
 static boolean n1;
public static void main(String[] args) {
	Exercise e=new Exercise();
	System.out.println(e.n +" "+n1);
	e.checkNumber(10);
	System.out.println(e.toMilesPerHour(10.2222));
	e.printConversion(10.25);
	System.out.println(e.calcFeetAndInchesToCentimeters(19,45));
}
}
