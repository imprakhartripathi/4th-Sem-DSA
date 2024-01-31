public class CircularLinkedList {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int nodedata) {
            data = nodedata;
            next = null;
        }
    }

    void AddLast(int nodedata) {
        Node newnode = new Node(nodedata);
        if(head==null){
            head = newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
}