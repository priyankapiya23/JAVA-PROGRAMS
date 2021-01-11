// input numbers and show in which datatpes it can be fit

import java.util.*;
public class f8
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter terms");
    int t1=s.nextInt();
    for(int i=0;i<t1;i++)
    {
      try
      {
        long x = s.nextLong();
        System.out.println(x+"can be fitted in:");
        if(x>= Byte.MIN_VALUE &&  x<=Byte.MAX_VALUE){
         System.out.println("*byte");}
        if(x>= Short.MIN_VALUE &&  x<=Short.MAX_VALUE){
        System.out.println("*short");}
        if(x>=Integer.MIN_VALUE &&  x<=Integer.MAX_VALUE){
        System.out.println("*Int");}
        if(x>= Long.MIN_VALUE &&  x<=Long.MAX_VALUE){
        System.out.println("*Long");}
      }
      catch(Exception e)
      {
        System.out.println(s.next()+"can't be fitted anywhere");
      }
      }
    }
  }
