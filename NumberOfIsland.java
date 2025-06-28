import java.io.*;
import java.util.*;
import java.math.*;



public class Contest{
     
public static class ListNode{
   int val ;
   ListNode next;
   ListNode(int val, ListNode next){
      this.val = val;
      this.next = next;
   }
}
  
	
 public static void main(String [] args){
   /*************************** Input & Ouput System********************************/
         try {
            FileInputStream fis = new FileInputStream("input.txt");
            System.setIn(fis);

            FileOutputStream fos = new FileOutputStream("output.txt");
            System.setOut(new PrintStream(fos));


        } catch (FileNotFoundException e) {
            e.printStackTrace(); // or System.out.println("input.txt not found");
        }
  /*********************************************************************************/      
    

char[][] grid = {
    {'0', '1', '1', '1', '0'},
    {'0', '1', '0', '1', '0'},
    {'1', '1', '0', '0', '0'},
    {'0', '0', '0', '0', '0'}
};

// Output: 1

     int ans = 0;
   int rows = grid.length;
   int cols = grid[0].length;

 
 for(int r = 0; r < rows; r++){
       for(int c = 0; c < cols; c++){

         if(grid[r][c] == '1'){
            dfs(grid,r,c);
            ans++;
         }
       }
   } 


  System.out.println(ans);
  System.out.flush();

}

private static void dfs(char [][] grid, int r, int c){
     
       if( r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0') return;

         grid[r][c] = '0';


      dfs(grid, r + 1, c);
      dfs(grid, r - 1, c);
      dfs(grid, r, c + 1);
      dfs(grid, r, c - 1);

      

}


}   
    
