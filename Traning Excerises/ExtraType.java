import java.util.Scanner;
class ExtraType
{
   String name;
   Long runs;
   public String getName()
  {
  return name;
  }
  public void setName(String name)
  { 
  this.name=name;
  }
  public long getRuns()
  {
  return runs;
  }
  public void setRuns(long runs)
  {
  this.runs=runs;
  }
}
class Main
{
  public static void main(String args[])
  {
   String details;
   ExtraType e=new ExtraType();
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the extratype details:");
   details=sc.nextLine();
   System.out.println("ExtraType Details");
   String[] arrOfStr=details.split("#");
   e.setName(arrOfStr[0]);
   System.out.println("ExtraType:"+e.getName());
   long r=Long.parseLong(arrOfStr[1]);
   e.setRuns(r);
   System.out.println("Runs:"+e.getRuns());
}
}