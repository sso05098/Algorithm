package classtest;

public class Circle {
	double radius;
	double area;
	final double PI = 3.14;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	double getArea() {
		return area;
	}
	
	void calArea() {
		area = PI * radius * radius;
	}
	
	void show() {
		System.out.printf("반지름 = %.2f, 면적 = %.2f\n", radius, area);
	}
		

	}
