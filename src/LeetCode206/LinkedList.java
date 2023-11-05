package LeetCode206;
public class LinkedList {
    Node head;
    static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
           // this.next = next;
        }
    }
    public void iterativReverseList (Node node){
        Node current = head, prev = null;
        while (current!=null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        head = prev;
    }
  Node recursiveReverseList(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node newHead = recursiveReverseList(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }
    public void printLinkedList (Node node){
        while (node!=null){
            System.out.print(node.val +" ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.head = new LinkedList.Node(1);
    list.head.next = new LinkedList.Node(2);
    list.head.next.next = new LinkedList.Node(3);
    list.head.next.next.next = new LinkedList.Node(4);
    list.head.next.next.next.next = new LinkedList.Node(5);

    LinkedList list2 = new LinkedList();
    list2.head = new LinkedList.Node(1);
    list2.head.next = new LinkedList.Node(2);


        System.out.println("Original lists:");
        list.printLinkedList(list.head);
        System.out.println();
        list2.printLinkedList(list2.head);
        System.out.println();

        System.out.println("Iterative turn: ");
        list.iterativReverseList(list.head);
        list2.iterativReverseList(list2.head);
        list.printLinkedList(list.head);
        System.out.println();
        list2.printLinkedList(list2.head);
        System.out.println();

        System.out.println("recursive turn: ");
        list.head = list.recursiveReverseList(list.head);
        list.printLinkedList(list.head);
        System.out.println();
        list2.head = list2.recursiveReverseList(list2.head);
        list2.printLinkedList(list2.head);

}
        }

