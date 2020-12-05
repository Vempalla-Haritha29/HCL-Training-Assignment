package org.inheritance;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Double area;
		Double radius = null;
		Double length = null;
		Double breadth = null;
		Double base = null;
		Double height = null;
		int ch;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Shape s = null;
		System.out.println("Enter the shape" + "\n" + "1.circle" + "\n" + "2.rectangle" + "\n" + "3.Triangle");
		System.out.println("enter the choice");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			s = new Circle(radius);
			s.computearea();
			break;
		case 2:
			s = new Rectangle(length, breadth);
			s.computearea();
			break;
		case 3:
			s = new Triangle(base, height);
			s.computearea();
			break;
		}
	}

}
