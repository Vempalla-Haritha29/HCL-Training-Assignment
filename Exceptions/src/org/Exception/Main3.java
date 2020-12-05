package org.Exception;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) throws EventTypeDoesNotExsits {
		String name;
		String detail;
		String ownername;
		Double typeid;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of events");
		n = sc.nextInt();
		System.out.println("Enter the details of event1");
		detail = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the details of event2");
		sc.nextLine();
		System.out.println("The events are:" + "\n" + "name" + "\t" + "details" + "\t" + "ownername" + "\t" + "typeid");
		Event e = new Event();
		e.toString();
	}
}
