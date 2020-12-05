package org.interfaces;

import java.util.Scanner;

public class Main2 {
	int amount_invest;
	int sip;
	int duration;
	int amount;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to invest");
		int amount_invest = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the tenure of the sip");
		int sip = sc.nextInt();
		sc.nextLine();
		MutualFund a = new AxisBank(amount_invest, sip);
		a.duration();
		a.amount();
		a = new HdfcBank(amount_invest, sip);
		a.duration();
		a.amount();
		a = new ICICIBank(amount_invest, sip);
		sc.close();

	}

}
