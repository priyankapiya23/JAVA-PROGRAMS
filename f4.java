//take input from user int,string,double
//first line print string
// second line print double
// third line print integers
import java.util.Scanner;
public class f4
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a  integer, double number and any senetence number");

    int i = s.nextInt();
    Double d= s.nextDouble();
    s.nextLine(); // we can not use nextLine() just after nextInt() so this line is used to flush
    String ss= s.nextLine();

    System.out.println("Integer: "+i);
    System.out.println("Double: "+d);
    System.out.println("String: "+ss);
  }
}
