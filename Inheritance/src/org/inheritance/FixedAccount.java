package org.inheritance;

public class FixedAccount extends SavingsAccount2 {
	protected Integer lockingperiod;

	public FixedAccount() {
		// TODO Auto-generated constructor stub
	}

	public FixedAccount(Integer lockingperiod) {
		super();
		this.lockingperiod = lockingperiod;
	}

	public Integer getLockingperiod() {
		return lockingperiod;
	}

	public void setLockingperiod(Integer lockingperiod) {
		this.lockingperiod = lockingperiod;
	}

}
