// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */
/*Given the first 2 terms A and B of a Geometric Series. The task is to find the Nth term of the series.

Example 1:

Input:
A = 2
B = 3
N = 1
Output: 2
Explanation: The first term is already
given in the input as 2
Example 2:

Input:
A = 1
B = 2
N = 2
Output: 2
Explanation: Common ratio = 2,
Hence second term is 2.*/
import java.io.*;
import java.util.*;
class GPTerm  {
	public static void main (String[] args) {

	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);

		//taking total testcases
		int T=sc.nextInt();
		while(T-->0)
		{

		    GP  obj=new GP ();
		    int A,B;

		    //taking A and B
		    A=sc.nextInt();
		    B=sc.nextInt();
		    int N;

		    //taking N
		    N=sc.nextInt();

		   //calling method termOfGP() of class GP
		   System.out.println((int)Math.floor(obj.termOfGP(A,B,N)));

		}

	}
}
// } Driver Code Ends


//User function Template for Java

class GP
{

    public double termOfGP(int A,int B,int N)
    {
        //Your code here
        double r=((double) B)/((double)A);
        return (A*(Math.pow(r,N-1)));
    }

}
