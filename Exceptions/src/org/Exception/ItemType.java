package org.Exception;

public class ItemType {
	String name;
	Double deposit;
	Double costperday;

	public ItemType() {
	}

	public ItemType(String name, Double deposit, Double costperday) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costperday = costperday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDeposit() {
		return deposit;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}

	public Double getCostperday() {
		return costperday;
	}

	public void setCostperday(Double costperday) {
		this.costperday = costperday;
	}

	public String toString() {
		System.out.println("name:" + this.name);
		System.out.println("deposit:" + this.deposit);
		System.out.println("costperday:" + this.costperday);
		return name;

	}

}
