/* 
A - Doors in the Center  / 
Time Limit: 2 sec / Memory Limit: 1024 MB

Score : 
100 points

Problem Statement
Find a length-
N string that satisfies all of the following conditions:

Each character is - or =.
It is a palindrome.
It contains exactly one or exactly two =s. If it contains two =s, they are adjacent.
Such a string is unique.

Constraints
1≤N≤100
N is an integer.
Input
The input is given from Standard Input in the following format:

N
Output
Print the answer.

Sample Input 1
Copy
4
Sample Output 1
Copy
-==-
Sample Input 2
Copy
7
Sample Output 2
Copy
---=---

*/






import java.util.*;

class Main {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     
     char [] dp = new char[n];
     
     Arrays.fill(dp,'-');
  if (n % 2 == 1) {
           
            dp[n / 2] = '=';
        } else {
            
            dp[n / 2 - 1] = '=';
            dp[n / 2] = '=';
        }
  
     
     System.out.print(new String(dp));
    }
}
