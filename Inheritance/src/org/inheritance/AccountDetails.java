package org.inheritance;

public class AccountDetails {
	protected String accname;
	protected String accno;
	protected String bankname;

	public AccountDetails() {
		// TODO Auto-generated constructor stub
	}

	public AccountDetails(String accname, String accno, String bankname) {
		super();
		this.accname = accname;
		this.accno = accno;
		this.bankname = bankname;
	}

	public String getAccname() {
		return accname;
	}

	public void setAccname(String accname) {
		this.accname = accname;
	}

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	void display() {
	}
}
