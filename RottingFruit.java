import java.io.*;
import java.util.*;
import java.math.*;



public class Contest{

public static class TreeNode{
   int val;
   TreeNode left, right;
   TreeNode(int val, TreeNode left, TreeNode right){
      this.val = val;
      this.left = null;
      this.right = null;
   }
}   
     
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
    
    int [][]  grid = {{1,1,0},{0,1,1},{0,1,2}};
    
    // Output : 4
       int Rows = grid.length;
         int Cols = grid[0].length;
           Queue<int[]> q = new LinkedList<>();
           int fresh = 0;

      
        for(int r =0; r < Rows; r++){
            for(int c = 0; c < Cols; c++){
               if(grid[r][c]== 2){
                  q.offer(new int[]{r,c});
                
               }else if(grid[r][c] == 1){
                     fresh++; 
               }
            }
        }
          int minutes = 0;
         int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()  && fresh > 0){
            int n = q.size();

            for(int i = 0; i < n ; i++){
               int [] cell = q.poll();
               int r = cell[0]; int c = cell[1];

               for(int [] dir : direction){
                  int nr = r + dir[0];
                  int nc = c + dir[1];

                  if (nr >= 0 && nr < Rows && nc >= 0 && nc < Cols && grid[nr][nc] == 1){
                       grid[nr][nc] = 2;
                       fresh--;
                       q.offer(new int[]{nr,nc});
                    }
               }   
            }

            minutes++;
         }


         // System.out.println(Arrays.deepToString(grid));
          if(fres == 0){
            System.out.println(minutes);
          }else{
            System.out.println(-1);
          }

        }

        

}


    
