package org.Exception;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		int n;
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the integer value");
			n = sc.nextInt();
			sc.nextLine();
			System.out.println("Entered value is " + n);
		} catch (InputMismatchException ie) {
			ie.printStackTrace();
		}
	}

}
