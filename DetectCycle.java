import java.util.*;

class DetectCycle{

private static int [] parent ;
private static int [] rank;

public DetectCycle(int size){
	  parent = new int [size];
	  rank = new int [size];

	  for(int i = 0 ; i < size; i++){
	  	parent[i] = i;
	  	rank[i] = 1;
	  }
}

public int find(int x){
   if(parent[x] != x){
   	parent[x] = find(parent[x]);
    }
    return parent[x];

   }

   public boolean union(int x , int y){
    int rootX = find(x);
    int rootY = find(y);
    
        if(rootX ==  rootY){
        	return true;
        }
     
       if(rank[rootX] > rank[rootY]){
           parent[rootY] = rootX;
       }else if(rank[rootX] < rank[rootY]){
       	  parent[rootX] = rootY;
       }
      else{
     	parent[rootY] = rootX;
     	rank[rootX]++;
     }
     return false;
   }		


  public boolean isConnected(int x, int y){
  	return find(x) == find(y);
  }

  public static boolean hasCycle(int n, int [][] edges){

    DetectCycle dc = new DetectCycle(n);
 
  System.out.println(Arrays.toString(parent));

    for(int [] edge : edges){
    	if(dc.union(edge[0],edge[1])){
    		return true;
    	}
    	System.out.println("Updated : "+ Arrays.toString(parent));

    }

    return false;
  }



public static void main(String [] args){
    
int n = 4;
int [][]edges = {{1,2},{2,3},{1,3}};
 
System.out.println(hasCycle(n,edges));




     

}

}