/*Given a number N, find an integer denoting the smallest number evenly divisible by each number from 1 to n.


Example 1:

Input:
N = 3
Output: 6
Explanation: 6 is the smallest number
divisible by 1,2,3.*/
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Smallestdivisiblenumber g=new Smallestdivisiblenumber();
            System.out.println(g.getSmallestDivNum(n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Smallestdivisiblenumber
{
    public static long getSmallestDivNum(int n)
    {
        return lcm(n);
    }
       static long gcd(long a, long b)
       {
           if(a%b!=0)
           {
               return gcd(b,a%b);

           }

           return b;
       }
       static long lcm(long n)
       {
           long ans =1;
           for (long i =1;i<=n;i++)
           {
               ans = (ans*i)/(gcd(ans,i));

          }

          return ans;
      } }
