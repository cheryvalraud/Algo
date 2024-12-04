class Node{
    int val;
    Node next;
    Node(int val){
    this.val = val;
    this.next = null;
    }
}

class Removing{
    
    Node head;
    public  Node removingNode(Node head, int value){
        if(head == null) return null;
        if(head != null && head.val == value){
            return head.next;
        }
        
        Node current = head;
        while(current != null && current.next != null){
            if(current.next.val == value){
            current.next = current.next.next;
            break;
            }
            
            current = current.next;
        }
        return head;
    }
}

class Main {
    
    public static void printList(Node head){
    
    Node current = head;
    while(current != null){
        System.out.print(current.val + " -> ");
    
        current = current.next;
    }
    System.out.println();
    }
    public static void main(String[] args) {
       Removing removing = new Removing();
       
         Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
       
       int value = 3;
     head  = removing.removingNode(head, 3);
       
       printList(head);

    }
}
