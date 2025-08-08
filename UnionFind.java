import java.util.*;


public class UnionFind{

 private static int [] parent;
 private static int [] rank ;


public UnionFind(int size){
	parent = new int[size];
	rank = new int[size];

	for(int i = 0; i < size; i++){
		   parent[i] = i;
	       rank[i] = 1;
	}

	System.out.println("Previous :" + Arrays.toString(parent));
	System.out.println("Previous :" +Arrays.toString(rank));
   

    
    
}

public int find(int x){
	if(parent[x] != x){
		parent[x] = find(parent[x]);
	}
	return parent[x];
}

public void union(int x , int y){
	int rootX = find(x);
	int rootY = find(y);
  /* 2 and 7  
  
  */

	if(rootX != rootY){
		if(rank[rootX] > rank[rootY]){
			parent[rootY] = rootX;
		}else if(rank[rootX] < rank[rootY]){
			parent[rootX] = rootY;
		}else{
			parent[rootY] = rootX;
			rank[rootX] += 1;
		}
	}
}

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }

    public static void main(String[] args) {
        UnionFind uf = new UnionFind(10);

        uf.union(0, 1);
        uf.union(1,2);
        uf.union(2,7);
        uf.union(9,7);
        
        System.out.println(uf.connected(0,1));

        System.out.println();
        System.out.println("After :" +Arrays.toString(parent));
        System.out.println("After :" +Arrays.toString(rank));

        

    }



}
