package org.collections;

public class Address implements Comparable<Address> {
	private String name;
	private String addressLine1;
	private String addressLine2;
	private Integer pincode;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String name, String addressLine1, String addressLine2, Integer pincode) {
		super();
		this.name = name;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public int compareTo(Address ad) {
		if (this.pincode < ad.getPincode())
			return -1;
		else if (this.pincode > ad.getPincode())
			return 1;
		else
			return 0;

	}

	public String name() {
		// TODO Auto-generated method stub
		return name;
	}

	public String addressLine1() {
		// TODO Auto-generated method stub
		return addressLine1;
	}

	public String addressLine2() {
		// TODO Auto-generated method stub
		return addressLine2;
	}

	public int pincode() {
		// TODO Auto-generated method stub
		return pincode;
	}
}
