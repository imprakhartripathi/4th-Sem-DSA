class CircularLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val, Node node) {
            this.data = val;
            this.next = node;
        }

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }
    CircularLinkedList(){
        this.head=null;
    }

    void AddFirst(int nodedata) {
        Node newnode = new Node(nodedata);
        if (head == null) {
            head = newnode;
            head.next = head;
            return;
        }
        if (head.next == head) {
            newnode.next = head;
            head.next = newnode;
            head = newnode;
            return;
        }
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }
        newnode.next = head;
        last.next = newnode;
        head = newnode;
    }

    void AddLast(int nodedata) {
        Node newnode = new Node(nodedata);
        if (head == null) {
            head = newnode;
            newnode.next=newnode;
            return;
        }
        if (head.next == head) {
            newnode.next = head;
            head.next = newnode;
            return;
        }
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }

        last.next = newnode;
        newnode.next = head;
    }

    void DelFirst() {
        if (head == null) {
            System.out.println("List's empty bro what 'First Element' you tryna delete");
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }

        head = head.next;
        last.next = head;

    }

    void DelLast() {
        if (head == null) {
            System.out.println("List's empty bro what 'Last Element' you tryna delete");
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }
        Node last = head;
        Node previous = head;
        while (last.next != head) {
            previous = last;
            last = last.next;
        }

        previous.next = head;
    }

    void PrintList() {
        if (head == null) {
            System.out.println("List's empty bro what you tryna print");
            return;
        }
        Node last = head;
        while (last.next != head) {
            System.out.print(last.data + " ");
            last = last.next;
        }
        System.out.print(last.data + " ");
        System.out.println();
    }

}

public class CircularLinkedListConsole {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.AddFirst(1);
        list.AddLast(2);
        list.AddLast(3);
        list.AddLast(4);
        list.AddFirst(0);
        list.PrintList();
        list.DelFirst();
        list.DelLast();
        list.PrintList();
    }
}