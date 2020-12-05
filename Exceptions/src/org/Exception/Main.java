package org.Exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int cost, answer = 0;
		int n;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the cost of items for 'n' days");
			cost = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the value of n");
			n = sc.nextInt();
			answer = cost / n;
			System.out.println("cost per day of the item is:" + answer);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
	}

}
