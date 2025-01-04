import java.util.*;


class Main {
    public static List<List<Integer>>findSubsetsThatSumToTarget(int[]nums,int target){
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(nums,0,target,new ArrayList<>(),result);
        return result;
        
    }
    
    public static void  findSubsets(int []nums,int index, int target,List<Integer> current,List<List<Integer>>result){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        
        if(target < 0 || index == nums.length){
            return;
        }
        current.add(nums[index]);
        findSubsets(nums,index,target - nums[index],current,result);
        current.remove(current.size()- 1);
        findSubsets(nums,index + 1,target,current,result);
    }
    
    
  

public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        int target = 7;
   List<List<Integer>> result = findSubsetsThatSumToTarget(nums, target);   
   
       for (List<Integer> subset : result) {
            System.out.println(subset);
        }



    }
}
