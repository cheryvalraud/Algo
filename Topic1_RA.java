
/**
 * This program calculates the area of a regular, n-sided polygon
 * Author: Valraud Chery
 * Date: 2025-14-02
 * Course:CSC-239-200
 * Instructor: Ali Azhari
 * Topic 1 Reading Assignment
 */

 import java.util.*;

 class Topic1_RA {
     public static void main(String[] args) {
         // Create an instance of Scanner
         Scanner input = new Scanner(System.in);
         int n;
         // prompt the  user to enter the number of sides of the polygon 
         do{
             System.out.print("Enter the number of side of the polygon: ");
             n  = input.nextInt();
             if(n <= 2){
                 System.out.println("Sorry,The number of side must be great than '2'");
             }
         }while(n <= 2);
         
           double s;
           // prompt the  user to enter the number of the side length
         do{
             System.out.print("Enter the side of the length: ");
             s = input.nextDouble();
             if(s <= 0){
                 System.out.println("Sorry,The number of side must be great than '0'");
             }
         }while(s <= 0);
         
         
         // executing the formula
         double area = (n * Math.pow(s,2)) / (4 * Math.tan(Math.PI/ n)); 
         
         //printing the area while using "printf & %.2f" so we can round it to 2 decimal
         
         System.out.printf("The area of the rectangular polygon is : %.2f\n", area);
         
         input.close();
     }
 }
 
