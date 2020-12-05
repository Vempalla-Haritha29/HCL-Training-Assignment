package org.interfaces;

public class AxisBank implements MutualFund {
	int amount_invest;
	int sip;

	public AxisBank(int amount_invest, int sip) {
		super();
		this.amount_invest = amount_invest;
		this.sip = sip;
	}

	@Override
	public void duration() {
		System.out.println("AxisBank-\n you will have returns as-" + (amount_invest * 56 / 100) * sip + "/-");
	}

	@Override
	public void amount() {
		System.out.println("In" + sip + "years");

	}

}
