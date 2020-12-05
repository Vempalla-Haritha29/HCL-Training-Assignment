package org.inheritance;

public class AccountClass1 extends SavingsAccount {
	String accname;
	String accno;
	String bankname;
	String Organisationname;

	public static void main(String args[]) {
		System.out.println("enter the account details");
		SavingsAccount s = new SavingsAccount();
		s.setAccname("Rani");
		s.setAccno("12330000543");
		s.setBankname("ICICI");
		s.setOrganisationname("XYZ");
		System.out.println("Accname:" + s.getAccname() + "\n" + "Accno:" + s.getAccno() + "\n" + "Bankname:"
				+ s.getBankname() + "\n" + "Organisationname:" + s.getOrganisationname());
		s.display();
	}
}
