/*// if else condition
//take input 1<=n<=100
//print weired if number is odd and if number is even and in the range 2 to 5 print not weired
// if number even in range 6 to 20 print weird
//print not weird if number is if greater than 20
// print hello*/
import java.util.Scanner;
public class f3
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any number");
    int n = s.nextInt();
    if(n%2!=0)
    System.out.println("Weird");
    if((n%2==0) &&(n>=2 && n<=5))
    System.out.println("Not Weird");
    if((n%2==0) &&(n>=6 && n<=20))
    System.out.println("Weird");
    if((n%2==0) &&(n>20))
    System.out.println("not Weird");

  }
}
