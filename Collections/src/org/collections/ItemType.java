package org.collections;

public class ItemType {
	private String name;
	private Double deposit;
	private Double costperday;

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

	@Override
	public String toString() {
		return "ItemType [name=" + name + ", deposit=" + deposit + ", costperday=" + costperday + "]";
	}

	void display() {
	}

}
