package org.inheritance;

public class SavingsAccount2 extends Account {
	protected Double minimumbalance;

	public SavingsAccount2() {
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount2(Double minimumbalance) {
		super();
		this.minimumbalance = minimumbalance;
	}

	public Double getMinimumbalance() {
		return minimumbalance;
	}

	public void setMinimumbalance(Double minimumbalance) {
		this.minimumbalance = minimumbalance;
	}

}
