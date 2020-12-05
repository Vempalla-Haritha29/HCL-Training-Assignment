import java.util.Scanner;
class Delivery
{
  Long over;
  Long ball;
  Long runs;
  String batsman;
  String bowler;
  String nonStriker;
  public Delivery(Long over,Long ball,Long runs,String batsman,String bowler,String nonStriker)
 {
  this.over=over;
  this.ball=ball;
  this.runs=runs;
  this.batsman="batsman";
  this.bowler="bowler";
  this.nonStriker="nonStriker";
 }
 public void displayDeliveryDetails();
{
 System.out.println("Delivery details");
 System.out.println("over:"+over+"\n"+"ball:"+ball+"\n"+"runs:"+runs+"\n"+"batsman:"+batsman+"\n"+"bowler:"+bowler+"\n"+"nonStriker:"+nonStriker);
}
}
class Main
{
public static void main(String args[])
{
  Long over,ball,runs;
  String batsman,bowler,nonStriker;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the over");
  over=sc.nextLong();
  sc.nextLine();
  System.out.println("Enter the ball");
  ball=sc.nextLong();
  sc.nextLine();
  System.out.println("Enter the runs");
  runs=sc.nextLong();
  sc.nextLine();
  System.out.println("Enter the batsman name");
  batsman=sc.nextLine();
  System.out.println("Enter the bowler name");
  bowler=sc.nextLine();
  System.out.println("Enter the nonStriker");
  nonStriker=sc.nextLine();
  Delivery x=new Delivery(over,ball,runs,batsman,bowler,nonStriker);
  x.displayDeliveryDetails();
}
}