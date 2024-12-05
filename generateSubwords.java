
import java.util.*;

 class Main {
    public static void main(String[] args) {
        String str = "abbba";  // The input string
        List<String> subwords = new ArrayList<>();  // List to store subwords
        
        // Loop to generate all substrings
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                subwords.add(str.substring(i, j));  // Add the substring from index i to j-1
            }
        }
        
        // Print all the subwords
        for (String subword : subwords) {
            System.out.println(subword);
        }
    }
}
