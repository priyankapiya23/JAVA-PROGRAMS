// { Driver Code Starts
/*You are given an interger I, find the absolute value of the interger I.



Example 1:

Input:
I = -32
Output: 32
Explanation:
The absolute value of -32 is 32.


Example 2:

Input:
I = 45
Output: 45
Explanation:
The absolute value of 45 is 45 itself.*/
#include <bits/stdc++.h>

using namespace std;

int absolute(int I);

int main() {
    int T;    // number of testcases
    cin >> T; // input number of testcases
    while (T--) {
        int I;
        cin >> I;
        cout << absolute(I) << endl; // print the output
    }
    return 0;
}// } Driver Code Ends


// User function Template for C++

int absolute(int I)
{
    // code here
    if(I>0)
    {
    return I;
    }
    else
    {
    return (I*(-1));
}}
