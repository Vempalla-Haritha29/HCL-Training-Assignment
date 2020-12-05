package org.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainUserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String name, email, userName, password;
		Scanner sc = new Scanner(System.in);
		ArrayList<UserName> al = new ArrayList<UserName>();
		System.out.println("Enter the no.of user details");
		n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the user1 details:");
		name = sc.nextLine();
		System.out.println("Enter the user2 details:");
		name = sc.nextLine();
		System.out.println("Enter the user3 details:");
		name = sc.nextLine();
		al.add(new UserName("Mahesh", "mahesh@abc.in", "mahi", "1234"));
		al.add(new UserName("Ahamed", "jahamed@abc.in", "ahamed j", "abcd"));
		al.add(new UserName("Lenin", "alenin@abc.in", "lenin a", "lenin@123"));
		System.out.println("sort by" + "\n" + "1.Name" + "\n" + "2.Email");
		sc.nextLine();
		Collections.sort(al, new SortedbyName());
		System.out
				.println(" 1. SortedbyName:" + "\n" + "Name" + "\t" + "Email" + "\t" + "UserName" + "\t" + "Password");
		for (int i = 0; i < al.size(); i++)
			System.out.println(al.get(i));
		System.out
				.println(" 2. SortedbyEmail:" + "\n" + "Name" + "\t" + "Email" + "\t" + "UserName" + "\t" + "Password");
		for (int i = 0; i < al.size(); i++)
			System.out.println(al.get(i));

	}

}
