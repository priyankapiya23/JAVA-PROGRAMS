//take input from user and print is table
import java.util.Scanner;
public class f6
{
  public static void main(String[] args)
  {
    Scanner s= new Scanner(System.in);
    System.out.print("Enter any number");
    int n = s.nextInt();
    for(int i=1;i<=10;i++)
    {
      int table=(n*i);
      System.out.println(n+" * "+i+" = "+table);
    }
  }
}
