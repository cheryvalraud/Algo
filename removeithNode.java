class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class Removing {
    Node head;

    public Node removeNthFromBack(Node head, int n) {
        if (head == null) return null;

        // First Pass: Calculate the length of the list
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Calculate the position to remove from the front
        int target = length - n;

        // If the target is 0, remove the head
        if (target == 0) {
            return head.next;
        }

        // Second Pass: Traverse to the node before the target
        current = head;
        for (int i = 1; i < target; i++) {
            current = current.next;
        }

        // Remove the target node
        if (current != null && current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }
}

class Main {
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Removing removing = new Removing();

        // Create linked list: 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original List:");
        printList(head);

        // Remove the 2nd node from the back
        head = removing.removeNthFromBack(head, 2);

        System.out.println("Updated List:");
        printList(head);
    }
}
