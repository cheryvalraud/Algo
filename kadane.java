import java.util.*;


public class comp{
	public static void main(String []args){
       
       // Kadane Algorithm 
     int [] nums =  {-2, 1, -3, 4, -1, 2, 1, -5, 4};

     int sum = 0;
     int max = nums[0];

     for(int i = 0; i < nums.length; i++){
         sum += nums[i];
        
         if(sum > max){
          max = sum;
       
         }

         if(sum < 0){
           sum = 0; 
   
         }
     }

   System.out.println(max);
	}
}
