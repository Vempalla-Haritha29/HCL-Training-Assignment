package org.hcl;

import java.util.Scanner;

public class Main {
	public static void name() {
		String playername, bowlername, wickettype;
		Long over, ball;
		WicketDetails w = new WicketDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of wickets");
		Long wicket = sc.nextLong();
		System.out.println("Enter the details of wickets");
		over = sc.nextLong();
		ball = sc.nextLong();
		wickettype = sc.nextLine();
		playername = sc.nextLine();
		bowlername = sc.nextLine();
		String[] arrOfStr = wickettype.split(",");
		String a = arrOfStr[0];
		String b = arrOfStr[1];
		String c = arrOfStr[2];
		String d = arrOfStr[3];
		String e = arrOfStr[4];
		System.out.println("Wicket Details");
		System.out.println("Over:" + w.getOver());
		System.out.println("Ball:" + w.getBall());
		System.out.println("Wickettype:" + w.getWickettype());
		System.out.println("Playername:" + w.getPlayername());
		System.out.println("Bowlername:" + w.getBowlername());
	}

}
