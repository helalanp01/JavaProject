package inheritance;

public class Bicycle {
public int cadence;
public int gear;
public int speed;
private int wheel;
public void setCadence(int newValue) {
	cadence=newValue;
}
public void setGear(int newValue) {
	gear=newValue;
	System.out.println("gear");
}
public void setWheel(int newValue) {
	wheel=newValue;
	System.out.println("Its private");
}
public void applyBrack(int decrement) {
	speed-=decrement;
}
public void speedUp(int increment) {
	speed+=increment;
}
}
