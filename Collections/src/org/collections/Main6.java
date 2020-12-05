package org.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);

		List<String> li = new ArrayList<String>();
		List<Integer> l = new ArrayList<Integer>();
		li.add("Jenny");
		li.add("Maria");
		li.add("Jaquilin");
		li.add("Rentia Sarah");
		l.add(1200);
		l.add(850);
		l.add(600);
		l.add(150);
		System.out.println("Enter the no.of customers");
		n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the booking price according to the customer name ");
		sc.nextLine();
		System.out.println("List" + li);
		System.out.println("List:" + l);
		int minList = Collections.min(l);
		int maxList = Collections.max(l);
		System.out.println(li + " customer spends minimum amount of Rs" + minList);
		System.out.println(li + "customer spends maximum amount of Rs" + maxList);

	}

}
