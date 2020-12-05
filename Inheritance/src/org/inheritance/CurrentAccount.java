package org.inheritance;

public class CurrentAccount {
	private String Tinnumber;
	private String accname;
	private String accno;
	private String bankname;

	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(String tinnumber, String accname, String accno, String bankname) {
		super();
		Tinnumber = tinnumber;
		this.accname = accname;
		this.accno = accno;
		this.bankname = bankname;
	}

	public String getTinnumber() {
		return Tinnumber;
	}

	public void setTinnumber(String tinnumber) {
		Tinnumber = tinnumber;
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
