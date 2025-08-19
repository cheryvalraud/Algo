class Solution {
    static int [][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
    public int[] maxPoints(int[][] grid, int[] queries) {
        List<Integer> points = new ArrayList<>();
        for(int i = 0; i < queries.length; i++){
           int point = BFS(grid,queries[i]);
            points.add(point);

        }
        int [] ans = new int [points.size()];

         int index = 0;
         for(int num : points){
            ans[index++] = num;
         }        
      return ans;
    }
    public static int BFS(int [][] grid, int x){
        
        int rows = grid.length;
        int cols = grid[0].length;
        boolean [][] visited = new boolean[rows][cols];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        visited[0][0]= true;
        int NCellvisited = 0;
        while(!q.isEmpty()){
          int [] cell = q.poll();
          int r = cell[0];
          int c = cell[1];
          
          if(grid[r][c] >= x) continue;  

            NCellvisited++;
          
          for(int [] dir : directions){
            int nr = r + dir[0];
            int nc = c + dir[1];

            if(nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && !visited[nr][nc] && grid[nr][nc] < x){
                q.offer(new int[]{nr,nc});
                visited[nr][nc] = true;
            }
          }
          
        }
        return NCellvisited; 
    }
}
