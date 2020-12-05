package org.interfaces;

public class ICICIBank implements MutualFund {
	int amount_invest;
	int sip;

	public ICICIBank(int amount_invest, int sip) {
		super();
		this.amount_invest = amount_invest;
		this.sip = sip;
	}

	@Override
	public void duration() {
		System.out.println("ICICIBank-\n you will have returns as-" + (amount_invest * 60 / 100) * sip + "/-");

	}

	@Override
	public void amount() {
		System.out.println("In" + sip + "years");

	}

}
