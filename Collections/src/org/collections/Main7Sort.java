package org.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main7Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, pincode;
		String name, addressLine1, addressLine2;
		Scanner sc = new Scanner(System.in);
		ArrayList<Address> al = new ArrayList<Address>();
		System.out.println("Enter the no.of users");
		n = sc.nextInt();
		System.out.println("Enter user address");
		sc.nextLine();
		al.add(new Address("Josh", "Marina Street", "Chennai", 646461));
		al.add(new Address("Martin", "Mullai Nagar", "Salem", 640002));
		al.add(new Address("Justin", "Ambedkhar Road", "Chennai", 646432));
		Collections.sort(al);
		for (Address ad : al) {
			System.out.println(
					ad.getName() + "," + ad.getAddressLine1() + "," + ad.getAddressLine2() + "," + ad.getPincode());

		}

	}

}
