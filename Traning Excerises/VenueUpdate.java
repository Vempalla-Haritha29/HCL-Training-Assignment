import java.util.Scanner;
class Venue
{
	private String name,city;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city=city;
	}

}
class Main
{
	public static void main(String []args)
	{
		String name,city;
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter venue Name:");
		name=sc.nextLine();
		System.out.println("Enter City Name:");
		city=sc.nextLine();
		Venue v=new Venue();
		System.out.println("venue Details:");
		v.setName(name);
		System.out.println("venue is:"+v.getName());
		v.setCity(city);
		System.out.println("City is:"+v.getCity());
		System.out.println("verify and update venue Details:");
		System.out.println("1.Update Venue Name \r\n" + 
				   "2.Update City Name \r\n" + 
				   "3.All information Correct/Exit \r\n" + 
				   "Type 1 or 2 or 3"); 
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				String Venue;
				System.out.println("Enter Venue Details:");
				sc.nextLine();
				Venue=sc.nextLine();
				System.out.println("Venue Details:");
				v.setName(Venue);
				System.out.println("Venue is:"+v.getName());
				System.out.println("City is:"+v.getCity());
				break;
			case 2:
				String citi;
				System.out.println("Enter Venue Details:");
				sc.nextLine();
				citi=sc.nextLine();
				System.out.println("Venue Details:");
				System.out.println("Venue is:"+v.getName());
				v.setCity(citi);
				System.out.println("City is:"+v.getCity());
				break;
			case 3:
				System.out.println("Venue Details:");
				System.out.println("Venue is:"+v.getName());
				System.out.println("City is:"+v.getCity());
				break;
		}
}
}

		
		

