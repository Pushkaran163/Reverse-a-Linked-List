import java.util.Stack;

class Node{
    int data;
    Node next;

    Node(int x){
        this.data = x;
        this.next = null;
    }
}

public class Java{

    static Node reverseList(Node head){
        Stack<Node> stack = new Stack<>();
        Node curr = head;
        while(curr != null){
            stack.push(curr);
            curr = curr.next;
        }

        if(!stack.isEmpty()){
            head = stack.pop();
            curr = head;

            while(!stack.isEmpty()){
                curr.next = stack.pop();
                curr = curr.next;
            }
            curr.next = null;
        }
        return head;
    }

    static void printList(Node node){
        while(node != null){
            System.out.print(" "+ node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        head.next.next.next.next.next.next.next = new Node(80);
        head.next.next.next.next.next.next.next.next = new Node(90);
        head.next.next.next.next.next.next.next.next.next = new Node(100);

        System.out.println("Original List: ");
        printList(head);
        
        head = reverseList(head);

        System.out.println("Reversed List: ");
        printList(head);
    }
}