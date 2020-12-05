package org.interfaces;

import java.util.Scanner;

public class Main3 {
	private static String stallName;
	private static Integer cost;
	private static String ownerName;
	private static Integer tvSet;
	private static Integer projector;
	private static Integer screen;

	public static void name(String args[]) {
		int ch;
		Stall s = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("choose StallType\r\n" + "\r\n" + "1)GoldStall\r\n" + "2)PremiumStall\r\n" + "\r\n"
				+ "ExceutiveStall\r\n");
		System.out.println("Enter the choice:");
		sc.hasNextLine();
		System.out.println("Enter the Stall details");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			s = new GoldStall(stallName, cost, ownerName, tvSet);
			s.display();
			break;
		case 2:
			s = new PremiumStall(stallName, cost, ownerName, projector);
			s.display();
			break;
		case 3:
			s = new ExceutiveStall(stallName, cost, ownerName, screen);
			s.display();
			break;

		}

	}
}
