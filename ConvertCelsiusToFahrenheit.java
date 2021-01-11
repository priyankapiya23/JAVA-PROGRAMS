// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */
/*Given a temperature in celsius C. You need to convert the given temperature to Fahrenheit.

Example 1:

Input:
C = 32
Output: 89
Explanation: Using the conversion
formula of celsius to farhenheit , it
can be calculated that, for 32 degree
C, the temperature in Fahrenheit = 89.*/

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);

		int T=sc.nextInt();//input number of testcases
		while(T-->0)
		{
		    CelsiusToFahrenheit obj=new CelsiusToFahrenheit();

		    int C;
		    C=sc.nextInt();//input temperature in celscius

		    System.out.println((int)(obj.cToF(C)));//print the output
		}

	}
}
// } Driver Code Ends


//User function Template for Java


class CelsiusToFahrenheit
{
    public double cToF(int C)
    {
        //Your code here
         double f = (C  * 9/5 + 32);
    return (f);
    }
}
