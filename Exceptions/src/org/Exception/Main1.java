package org.Exception;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		String name;
		Double deposit;
		Double costperday;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the item type details:");
			System.out.println("Enter the name:");
			name = sc.nextLine();
			System.out.println("Enter the deposit:");
			deposit = sc.nextDouble();
			Double d = Double.valueOf(deposit);
			System.out.println("Enter the costperday:");
			costperday = sc.nextDouble();
			Double dl = Double.valueOf(costperday);
			System.out.println("The Details of the item type are:" + "\n" + "name:" + "Tv" + "\n" + "deposit:" + "1000"
					+ "\n" + "costperday:" + "100");
			ItemType i = new ItemType();
			i.toString();
		} catch (NumberFormatException ne) {
			ne.printStackTrace();
		}
	}
}
