package org.inheritance;

public class Circle extends Shape {
	private Double radius;

	Circle(Double radius) {
		this.radius = radius;
		{
			System.out.println("enter the radius");
			double circle = (22 / 7) * (radius * radius);
			System.out.println("area");

		}
	}
}
