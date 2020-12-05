package org.collections;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String mobilenumber;
		String userName;
		String password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of users");
		sc.nextLine();
		System.out.println("Enter the details of user1");
		sc.nextLine();
		System.out.println("Enter the details of user2");
		sc.nextLine();
		System.out.println("Enter the details of user3");
		sc.nextLine();
		Map<String, Integer> m = new TreeMap<String, Integer>();
		m.put("Jack", 12345);
		m.put("Jane", 13579);
		m.put("John", 24680);
		Set<Map.Entry<String, Integer>> entries = m.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			String string = entry.getKey();
			Integer integer = entry.getValue();
		}
		System.out.println("The user details in the reverse order:" + m);

	}

}
