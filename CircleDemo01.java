package classtest;

import java.util.Scanner;

public class CircleDemo01 {

	public static void main(String[] args) {
		System.out.print("원의 반지름 : ");
		Scanner in = new Scanner(System.in);
		
		Circle circle = new Circle(in.nextDouble());
		circle.calArea();
		circle.show();

	}

}
