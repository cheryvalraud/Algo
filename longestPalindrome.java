import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String word = sc.next();
        
        String longestPalindrome = "";
        
        for (int i = 0; i < N; i++) {
            String oddPalindrome = expandAroundCenter(word, i, i);
            if (oddPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = oddPalindrome;
            }
            
            String evenPalindrome = expandAroundCenter(word, i, i + 1);
            if (evenPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = evenPalindrome;
            }
        }
        
        System.out.println(longestPalindrome.length());
        System.out.println(longestPalindrome);
    }

    public static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}


// INPUT Form :

/*   Input:         Output:
     5                 5
abbba               abbba */     

/*Input:             Output:      
12                    8
bcabbacb       abcbcabbacba
*/
