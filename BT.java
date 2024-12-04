import java.util.*;
/*      1
       / \
      2   3
     / \   \
    4   5   6
*/    
class Node{
 int val;
 Node left;
 Node right;
    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}


class BinaryTree{
    
    Node root;
    
public void preOrderTraversal(Node node){
    if(node != null){
        System.out.print(node.val + " -> ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    
} 

public void inOrderTraversal(Node node){
    if(node != null){
        inOrderTraversal(node.left);
        System.out.print(node.val + " -> ");
       inOrderTraversal(node.right);
    }
    
} 

public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.val + " -> ");
        }
    }


}

class Main {
    
   
    public static void main(String[] args) {
        
  BinaryTree tree = new BinaryTree();
        
  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.left.left = new Node(4);
  tree.root.left.right = new Node(5);
  tree.root.right = new Node(3);
  tree.root.right.right = new Node(6);
  
  System.out.println("preOrderTraversal: ");
         tree.preOrderTraversal(tree.root);
       
  System.out.println("\ninOrderTraversal: ");
         tree.inOrderTraversal(tree.root);
         
  System.out.println("\npostOrderTraversal: ");
         tree.postOrderTraversal(tree.root);      
    }
}
