// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */
/*Given an integer N. Find the number of digits that appear in its factorial.
Factorial is defined as, factorial(n) = 1*2*3*4……..*N and factorial(0) = 1.


Example 1:

Input: N = 5
Output: 3
Explanation: Factorial of 5 is 120.
Number of digits in 120 is 3 (1, 2, and 0)*/
import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);

		//taking total testcases
		int T=sc.nextInt();

		while(T-->0)
		{
		    Factorial obj=new Factorial();
		    int N;

		    //taking N

		   //calling method digitsInFactorial()
		   System.out.println(obj.digitsInFactorial(N));

		}

	}
}

// } Driver Code Ends


//User function Template for Java


class Factorial
{
    public int digitsInFactorial(int N)
    {
        if(N<0)
        return 0;
        if(N<=1)
        return 1;

    double digit =0;
     for(int i=2;i<=N;i++)
     {
    digit=digit+(Math.log10(i));
     }
    return(int)(Math.floor(digit))+1;
    }
}
