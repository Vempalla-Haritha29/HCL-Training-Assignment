package org.interfaces;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ch;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Fort f = null;
		System.out.println("what you want to visit:" + "\n" + "Rajmachi" + "\n" + "Shivgadh" + "\n" + "Murud");
		System.out.println("enter the choice");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			f = new Rajmachi();
			f.distance();
			break;
		case 2:
			f = new Shivgadh();
			f.distance();
			break;
		case 3:
			f = new Murud();
			f.distance();
			break;
		}
	}

}
