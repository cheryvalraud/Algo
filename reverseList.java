class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}



class Main {
    
    public static void printList(Node root){
        Node current = root;
        
        while(current != null){
            if(current.next == null){
                System.out.print(current.data);
            }else{
                System.out.print(current.data + " -> ");
            }
            current = current.next;
        }
    }
    
    
    public static Node reverse(Node root){
        Node prev = null;
        Node current = root;
        Node next = null;
        
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
        
        
        public static void main(String[] args) {
     
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
     Node reverseHead  = reverse(a);
     printList(reverseHead);
    }
}
