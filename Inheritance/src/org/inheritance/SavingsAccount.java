package org.inheritance;

public class SavingsAccount {

	private String accname;
	private String accno;
	private String bankname;
	private String Organisationname;

	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(String accname, String accno, String bankname, String organisationname) {
		super();
		this.accname = accname;
		this.accno = accno;
		this.bankname = bankname;
		Organisationname = organisationname;
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

	public String getOrganisationname() {
		return Organisationname;
	}

	public void setOrganisationname(String organisationname) {
		Organisationname = organisationname;
	}

	void display() {
	}
}
