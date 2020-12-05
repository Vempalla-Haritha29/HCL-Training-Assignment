package org.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String name;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList();
		System.out.println("Enter the no.of halls");
		n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i <= 2; i++) {

			System.out.println("Enter the Hallname");
			name = sc.nextLine();
		}
		System.out.println("Enter the hallname to be searched");
		name = sc.nextLine();
		al.add(name);
		for (int j = 0; j < al.size(); j++)
			System.out.println(al.get(j));
		System.out.println("hall is found in the list at position");

	}

}
