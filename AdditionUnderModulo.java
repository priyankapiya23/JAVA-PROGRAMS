// { Driver Code Starts
//Initial Template for Java
/*Given two numbers a and b, find the sum of a and b. Since the sum can be very large, find the sum modulo 109+7.



Example 1:

Input:
a = 9223372036854775807
b = 9223372036854775807
Output: 582344006
Explanation:
9223372036854775807 + 9223372036854775807
= 18446744073709551614.
18446744073709551614 mod (109+7)
= 582344006*/

import java.util.*;
import java.io.*;
import java.lang.*;

class AdditionUnderModulo 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        //taking testcases
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0) {
            String[] str = read.readLine().trim().split(" ");

            //taking input a and b
            Long a = Long.parseLong(str[0]);
            Long b = Long.parseLong(str[1]);

            //calling method sumUnderModulo()
            System.out.println(new Solution().sumUnderModulo(a,b));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    public static long sumUnderModulo(long a, long b)
    {
        // code here
        long m = 1000000007;
       return ((a%m) +(b%m))%m;

    }

}
