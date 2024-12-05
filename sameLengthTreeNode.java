import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
      this.val = val;
      this.left = null;
      this.right = null;
        
    }
}
    class Solution{
       TreeNode node;   
         int length1 = 0;
         int length2 = 0;
        List<TreeNode> list = new ArrayList<>();
        
    public void traverseFirstTree(TreeNode p){
        if(p == null){
            return;
        }
    
          length1++;
          list.add(p.val);
        traverseFirstTree(p.left);
        traverseFirstTree(p.right);
          
    }
    
     public void traverseSecondTree(TreeNode q){
         
            if(q == null){
                return;
            }
     
         length2++;
         list.add(p.val);
        traverseSecondTree(q.left);
        traverseSecondTree(q.right);
          
    }
    
    public  void print(){
    if(length1 == length2){
        System.out.print("They have same length");
    }else{
        System.out.print("They don't have same length");
    }
    
    }
    
    public boolean sameTree(TreeNode p, TreeNode q){
        
    }
    
    }
    

class Main {
    
    
    
    public static void main(String[] args) {
      
      TreeNode p = new TreeNode(1);
      TreeNode q = new TreeNode(1);
     
       p.left = new TreeNode(2);
       p.right = new TreeNode(3);

       q.left = new TreeNode(2);
       q.right = new TreeNode(3);
        
        Solution solution = new Solution();
        
        solution.traverseFirstTree(p);
        solution.traverseSecondTree(q);
        
        solution.print();
    }
}
