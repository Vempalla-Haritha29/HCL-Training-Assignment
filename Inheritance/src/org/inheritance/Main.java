package org.inheritance;

class Main {
	static String accname;
	static String accno;
	static String bankname;

	public static void main(String args[]) {
		System.out.println("enter the account details");
		AccountDetails a = new AccountDetails();
		a.setAccname("Sita");
		a.setAccno("ICIC0000543");
		a.setBankname("ICICI");
		System.out.println(
				"Accname:" + a.getAccname() + "\n" + "Accno:" + a.getAccno() + "\n" + "Bankname:" + a.getBankname());
		a.display();
	}

}
