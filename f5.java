// print in format
//java 079
//c++  678
//c    007

import java.util.Scanner;
public class f5
{
public static void main(String[] args)
{
  Scanner s = new Scanner(System.in);
  System.out.println("Enter  string ,  and any  number");
  for(int i=0;i<3;i++)
  {
     String s1=s.next();
     int n=s.nextInt();
     System.out.printf("%-15s%03d\n",s1,n);//printf is used to print in a format
   }
 }
 }
