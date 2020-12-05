package org.inheritance;

public class Rectangle extends Shape {
	private Double length;
	private Double breadth;

	Rectangle(Double length, Double breadth) {
		this.length = length;
		this.breadth = breadth;
		{
			System.out.println("enter the length and breadth");
			double rectangle = length * breadth;
			System.out.println("rectangle");
		}

	}
}
