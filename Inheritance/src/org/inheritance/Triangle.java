package org.inheritance;

public class Triangle extends Shape {
	private Double base;
	private Double height;

	Triangle(Double base, Double height) {
		this.base = base;
		this.height = height;
		{
			System.out.println("Enter the base and height");

			double Triangle = (1 / 2) * (base * height);
			System.out.println("Triangle");
		}

	}
}
