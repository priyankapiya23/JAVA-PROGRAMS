/*A prime number is a number which is only divisible by 1 and itself.
Given number N check if it is prime or not.



Example 1:

Input:
N = 5
Output: Yes
Explanation: 5 is a prime number.


Example 2:

Input:
N = 4
Output: No
Explanation: 4 is not a prime number.*/
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class PrimalityTest {
	public static void main (String[] args) {

	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);

		int T=sc.nextInt();//input testcases


		while(T-->0)//while testcase have not been exhausted
		{
		    Primality  obj=new Primality ();
		    int N;
		    N=sc.nextInt();//input n
		    if(obj.isPrime(N))
		    System.out.println("Yes");
		    else

		    System.out.println("No");

		}

	}
}

// } Driver Code Ends


//User function Template for Java

class Primality
{
    public boolean isPrime(int N)
    {
      // code here
      for(int i=2;i<(int)Math.sqrt(N)+1;i++)
      {
          if(N%i==0)
          {
              return false;
          }}
      return true;
      }

 }
