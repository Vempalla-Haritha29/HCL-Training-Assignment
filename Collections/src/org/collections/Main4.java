package org.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		String name = null;
		String choice;
		Scanner sc = new Scanner(System.in);
		Set<String> s = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the username");
			name = sc.nextLine();

			System.out.println("Do you want to continue?(Y/N)");
			choice = sc.nextLine();
			s.add(name);
		}
		System.out.println("Number of users=" + n);

	}

}
