package org.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String name;
		String choice;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList();
		for (int i = 0; i <= 1; i++) {
			System.out.println("Enter the user name");
			n = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name");
			name = sc.nextLine();
			System.out.println("Do you want to continue?(y/n)");
			choice = sc.nextLine();
			al.add(name);
		}

		System.out.println("The names entered are:");
		for (int j = 0; j < al.size(); j++)
			System.out.println(al.get(j));

	}

}
