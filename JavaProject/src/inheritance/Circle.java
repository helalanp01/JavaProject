package inheritance;

public class Circle extends Shape {
double radius;
String color;
public Circle(double radius,String color) {
	this.radius=radius;
	this.color=color;
}
public Circle() {
	this.radius=1.0;
	this.color="RED";
}
public double getArea() {
	double result=radius*radius*Math.PI;
	return result;
}

}
