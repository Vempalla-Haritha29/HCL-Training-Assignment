package org.inheritance;

import java.util.Scanner;

public class Main2 {
	@SuppressWarnings("resource")
	public static void main() {
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("choose account type:" + "\n" + "1.Savingsaccount" + "\n" + "2.Currentaccount");
		System.out.println("enter the choice");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("SavingsAccount details");
			break;
		case 2:
			System.out.println("CurrentAccount details");
			break;
		default:
			System.out.println("wrong choice");
			break;
		}

	}
}
