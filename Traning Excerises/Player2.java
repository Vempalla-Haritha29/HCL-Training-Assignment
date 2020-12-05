import java.util.Scanner;
class Player
{
    String name,country,skill;
    public static void Display(String name,String country,String skill);
  {
       System.out.println("Player Details:");
       System.out.println("Name:"+name);
       System.out.println("Country:"+country);
       System.out.println("Skill:"+skill);

  }
}
class Main
{
    public static void main(String args[])
  {
       String details;
       Player p=new Player();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter name,country,skill:");
       details=sc.nextLine();
       String[] arrOfStr=details.split(" , ");
       String x=arrOfStr[0];
       String y=arrOfStr[1];
       String z=arrOfStr[2];
       p.Display(x,y,z);
   }
}    
