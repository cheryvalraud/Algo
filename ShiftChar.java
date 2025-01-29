import java.util.*;

class Main {

    public static String transforming(String s, int k ){
       StringBuilder stb = new StringBuilder();

        for(int i=0; i< s.length(); i++){
            char currentChar = s.charAt(i);
            char transformedChar = (char)(((currentChar - 'a' + k) % 26) + 'a'); // for z : 122 - 97 = 25;
                                                                                 // 25 + 1 = 26 then 26 % 26 = 0 then we get back to a
            stb.append(transformedChar);
        }
        return stb.toString();
    }

    public static void main(String[] args) {

     String  s = "abcyy";
     int k = 2;

     System.out.println(transforming(s, k));
    }
}
