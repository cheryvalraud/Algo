import java.util.*;

class Main {
    public static boolean isPalindrome(String s) {
      
        s = s.toLowerCase();

        // Two pointers approach
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Compare characters at left and right
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Not a palindrome if mismatch is found
            }
            left++;
            right--;
        }

        return true; // It's a palindrome
    }

    public static void main(String[] args) {
        String s = "radar";
        System.out.println(isPalindrome(s)); 
    }
}
