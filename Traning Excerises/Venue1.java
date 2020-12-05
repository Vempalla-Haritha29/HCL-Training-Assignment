import java.util.Scanner;
class Venue
{
  string name;
  stringcity;
  Venue(string name,string city)
 {
  this.name="name";
  this.city="city";
 }
}
class Main
 {
 public static void main(String args[])
 {
   string name,city;
   Scanner sc=new Scanner(System.in)
   System.out.println("Enter the name");
   name=sc.nextLine();
   System.out.println("Enter the city");
   city=sc.nextLine();
   Venue v=new Venue(name,city);
   System.out.println("the name is"+v.name);
   System.out.println("the city is"+v.city);
 }
}