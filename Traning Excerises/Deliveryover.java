import java.util.Scanner;
class Delivery
{
    private Long over;
    private Long ball;
    private Long runs;
    private String batsman;
    private String bowler;
    private String nonStriker;
    public Delivery()
   {
  
 }
   public void setOver(Long over)
  {
   this.over=over;
  }
  public Long getOver()
  {
  return over;
  }
  public void setBall(Long ball)
  {
  this.ball=ball;
  }
  public Long getBall()
  {
  return ball;
  } 
  public void setRuns(Long runs)
  {
   this.runs=runs;
  }
  public Long getRuns()
  {
  return runs;
  }
  public void setBatsman(String batsman)
  {
   this.batsman=batsman;
  }
  public String getBatsman()
  {
  return batsman;
  }
  public void setBowler(String bowler)
  {
   this.bowler=bowler;
  }
  public String getBowler()
  {
  return bowler;
  }
  public void setNonStriker(String NonStriker)
  {
   this.nonStriker=nonStriker;
  }
  public String getNonStriker()
  {
  return nonStriker;
  }
  public Delivery(Long over,Long ball,Long runs,String batsman,String bowler,String nonStriker)  
    super();
    this.over=over;
    this.ball=ball;
    this.runs=runs;
    this.batsman=batsman;
    this.bowler=bowler;
    this.nonStriker=nonStriker;
  }
class Main
{
  public static void main(String args[])
  {
    Delivery d=new Delivery();
    Scanner sc=new Scanner(System.in);
    Long over,ball,runs;
    String batsman,bowler,nonStriker;
    System.out.println("enter the over:");
    over=sc.nextLong(); 
    System.out.println("enter the ball:");
    ball=sc.nextLong();
    System.out.println("enter the runs:");
    runs=sc.nextLong(); 
    System.out.println("enter the batsman name:");
    batsman=sc.nextLine(); 
    System.out.println("enter the bowler name:");
    bowler=sc.nextLine(); 
    System.out.println("enter the nonStriker name:");
    nonStriker=sc.nextLine();  
    d.setOver(over);
    d.setBall(ball);
    d.setRuns(runs);
    d.setBatsman(batsman);
    d.setBowler(bowler);
    d.setNonStriker(nonStriker);
    System.out.println("Over:"+d.getOver());
    System.out.println("Ball:"+d.getBall());
    System.out.println("Runs:"+d.getRuns());
    System.out.println("Batsman:"+d.getBatsman());
    System.out.println("Bowler:"+d.getBowler());
    System.out.println("NonStriker:"+d.getNonStriker());
  }
}