class Node {
    int data;     // stores the value
    Node next;    // reference to next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Main {
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);

        first.next = second;

        System.out.println(first.data);        // 10
        System.out.println(first.next.data); 
System.out.println(second.next.next.data);  		// 20
    }
}