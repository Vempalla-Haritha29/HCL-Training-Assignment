import java.util.Scanner;
class Player
{
  String name;
  String country;
  String skill;
  Player(String name,String country,String skill)
 {
  this.name="name";
  this.country="country";
  this.skill="skill";
 }
}
class Main
{
public static void main(String args[])
{
String name,country,skill;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the player name");
name=sc.nextLine();
System.out.println("Enter the country name");
country=sc.nextLine();
System.out.println("Enter the skill");
skill=sc.nextLine();
Player p=new Player(name,country,skill);
System.out.println("Player Details:");
System.out.println("player name:"+name);
System.out.println("country name:"+country);
System.out.println("skill name:"+skill);
}
}