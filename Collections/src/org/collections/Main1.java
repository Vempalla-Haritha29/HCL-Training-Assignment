package org.collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Double;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String name = null;
		Double deposit = null;
		Double costperday = null;
		String choice;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList();
		ArrayList<Double> l = new ArrayList();
		for (int i = 0; i <= 1; i++) {
			System.out.println("Enter the details of ItemType");
			n = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name");
			name = sc.nextLine();
			System.out.println("Enter the Deposit");
			deposit = sc.nextDouble();
			System.out.println("Enter the costperday");
			costperday = sc.nextDouble();
			System.out.println("Do you want to continue?(y/n)");
			choice = sc.nextLine();
			sc.nextLine();
			al.add(name);
			l.add(deposit);
			l.add(costperday);

		}

		System.out.println("Name" + "\t" + "deposit" + "\t" + "costperday");
		for (int j = 0; j < al.size(); j++)
			System.out.println(al.get(j) + "\t" + l.get(j) + "\t" + l.get(j));

	}

}
