package org.interfaces;

public class Service implements car {

	int carnumber;
	int years;
	String brand;

	@Override
	public void sum() {
		int sum = 0;
		while (carnumber != 0) {
			sum = sum + (carnumber % 10);
			carnumber = carnumber / 10;
		}
		if (sum % 2 == 0)
			System.out.println("You can come on Tuesday,Thursday or Saturday");
		else
			System.out.println("You can come on Monday,Wednesday or Friday");
	}

	@Override
	public void years() {
		if (years > 5)
			System.out.println("you are eligible for free washing");
		else
			System.out.println("you are not eligible for free washing");
	}

	@Override
	public void brand() {
		if (brand.toUpperCase().contentEquals("MARUTI") || brand.toUpperCase().contentEquals("MARUTI"))
			System.out.println("your servicing charges are:4750");
		else
			System.out.println("your servicing charges are:5000");
	}
}
