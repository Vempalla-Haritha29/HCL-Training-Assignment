package org.interfaces;

public class HdfcBank implements MutualFund {
	int amount_invest;
	int sip;

	public HdfcBank(int amount_invest, int sip) {
		super();
		this.amount_invest = amount_invest;
		this.sip = sip;
	}

	@Override
	public void duration() {
		System.out.println("HdfcBank-\n you will have returns as-" + (amount_invest * 49 / 100) * sip + "/-");

	}

	@Override
	public void amount() {
		System.out.println("Invest" + sip + "years");

	}

}
