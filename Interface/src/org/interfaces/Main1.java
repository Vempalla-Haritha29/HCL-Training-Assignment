package org.interfaces;

import java.util.Scanner;

public class Main1 {
	int carnumber;
	int years;
	String brand;

	public static void main(String args[]) {
		Service s = new Service();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your carnumber");
		s.carnumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter how many years old can do u have car");
		s.years = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter brand of your car");
		s.brand = sc.nextLine();
		s.sum();
		s.years();
		s.brand();
		sc.close();
	}
}
