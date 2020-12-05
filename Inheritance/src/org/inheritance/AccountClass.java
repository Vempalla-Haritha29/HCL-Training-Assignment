package org.inheritance;

public class AccountClass extends CurrentAccount {
	String accname;
	String accno;
	String bankname;
	String Tinnumber;

	public static void main(String args[]) {
		System.out.println("enter the account details");
		CurrentAccount c = new CurrentAccount();
		c.setAccname("Rani");
		c.setAccno("12340000543");
		c.setBankname("ICICI");
		c.setTinnumber("abcd112345");
		System.out.println("Accname:" + c.getAccname() + "\n" + "Accno:" + c.getAccno() + "\n" + "Bankname:"
				+ c.getBankname() + "\n" + "Tinnumber:" + c.getTinnumber());
		c.display();
	}
}
