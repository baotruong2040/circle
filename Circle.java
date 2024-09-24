package src;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double r) {
		radius = r;
		color = "red";
	}
	
	public Circle(double rad, String color) {
		rad = radius;
		this.color = color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setRadius(double r) {
		radius = r;
	}
	public String getColor() {
		 return color;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
}
