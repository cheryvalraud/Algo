// Given an array of integers, find the maximum sum of any contiguous subarray of size k.

import java.util.*;

class Main {
    public static void main(String[] args) {
       
        
        int [] a =  {1, 2, 3, 4, 5}; int k = 3;
        if(a.length < k) System.out.println(0); 
        int windowSum = 0; int maxSum = 0; 
         
         for(int i = 0; i < k ; i++){
             //System.out.print(a[i] + " ");
            windowSum += a[i];
        }
        maxSum = windowSum;
        
        for(int i  = k; i < a.length; i++){
            windowSum  += a[i] - a[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
         //System.out.println(windowSum);
         System.out.println(maxSum);
    }
}
