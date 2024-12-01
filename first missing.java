import java.util.*;

class Main {
    public static void main(String[] args) {
        
                int[] nums = {1, 2, 0, 4, 5};
                
    List<Integer> missingNumber = findMissingNumbers(nums);
    
     System.out.println("Missing numbers: " + missingNumber);
        
    }
    
    
    public static List<Integer> findMissingNumbers(int[]nums){
           int n = nums.length;
        List<Integer> missingNumbers = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            
            if(nums[i] <= 0 || nums[i] > n){
                nums[i] = n + 1;
            }
        }
        
        for(int i = 0; i < n ; i++){
            int val = Math.abs(nums[i]);
            if(val <= n){
            nums[val - 1] = -Math.abs(nums[val - 1]); 
            }
        }
        
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > 0){
                missingNumbers.add(i + 1);
            }
        }
        
        return missingNumbers;
    }
}
