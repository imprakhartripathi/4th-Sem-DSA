public class LinkedListDouble {
    Node head;

    class Node {
        int data;
        Node next;
        Node previous;

        Node(int nodedata) {
            data = nodedata;
            next = null;
            previous = null;
        }
    }

    void AddFirst(int nodedata) {
        Node newnode = new Node(nodedata);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head.previous = newnode;
        head = newnode;
    }

    void AddLast(int nodedata) {
        Node newnode = new Node(nodedata);
        if (head == null) {
            head = newnode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newnode;
        newnode.previous = last;
    }

    void DelFirst() {
        if (head == null) {
            System.out.println("The List is Empty dude!!");
            return;
        }
        if (head.next == null) {
            head = null;
        }
        head = head.next;
        head.previous = null;
    }

    void DelLast() {
        if (head == null) {
            System.out.println("The List is Empty dude!!");
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last = last.previous;
        last.next = null;
    }

    void PrintList() {
        if (head == null) {
            System.out.println("The List is Empty dude!!");
            return;
        }
        Node last = head;
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.next;
        }
        System.out.println();
    }

    void PrintListReverse() {
        if (head == null) {
            System.out.println("The List is Empty dude!!");
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.previous;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListDouble list = new LinkedListDouble();
        list.PrintList();
        list.AddFirst(1);
        list.AddLast(2);
        list.AddLast(3);
        list.AddLast(4);
        list.AddFirst(0);
        list.PrintList();
        list.PrintListReverse();
        list.DelFirst();
        list.DelLast();
        list.PrintList();
        list.PrintListReverse();
    }

}
