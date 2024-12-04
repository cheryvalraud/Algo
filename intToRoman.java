import java.util.*;

class Main {
    public static String intToRoman(int num){
        // 100
        
        int [] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4 , 1};
                 
        String [] symboles = {"M", "CM", "D", "CD", "C", "XC", "L","XL", "X", "IX", "V","IV", "I"};

       StringBuilder stb = new StringBuilder();
       
       for(int i = 0; i < values.length; i++ ){
           while(num >= values[i]){
               num -= values[i];
               stb.append(symboles[i]);
           }
       }
       return stb.toString();
    }
    
    public static void main(String[] args) {

     int num = 550;
     
     System.out.print(intToRoman(num));
     

    }
}
