import java.util.*;

class Main {
    
    public static List<Integer> findMissingNumbers(int[] arr){
    
    
    
    
    int min = Integer.MAX_VALUE; // 2147483647
    int max = Integer.MIN_VALUE; // - 2147483647
    
    for(int num : arr){
        min = Math.min(min,num);
        max = Math.max(max,num);
        
    }
    
    Set <Integer> elements  = new HashSet<>();
    
    for(int num : arr){
        elements.add(num);
    }
    
    List<Integer> missing = new ArrayList<>();
    
    for(int i = min ; i <= max; i++){
        if(!elements.contains(i)){
            missing.add(i);
        }
    }
     return missing;        
    }
    
    
    public static void main(String[] args) {
        
          int[] arr = {10, 20, 5, 15, 30}; 
          
          List<Integer> missingNumbers = findMissingNumbers(arr);
          
          System.out.print(missingNumbers);
    }
}
