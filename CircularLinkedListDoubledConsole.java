class CircularLinkedListDoubled {
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
            head.next = head;
            head.previous = head;
            return;
        }
        newnode.next = head;
        newnode.previous = head.previous;
        newnode.previous.next = newnode;
        head = newnode;
        return;

    }

    void AddLast(int nodedata) {
        Node newnode = new Node(nodedata);
        if (head == null) {
            head = newnode;
            head.next = head;
            head.previous = head;
            return;
        }
        newnode.next = head;
        newnode.previous = head.previous;
        newnode.previous.next = newnode;
        head.previous = newnode;
        return;
    }

    void DeleteFirst() {
        if (head == null) {
            System.out.println("List's empty bro what 'First Element' you tryna delete");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            head.previous.next = head.next;
            head.next.previous = head.previous;
            head = head.next;
        }
    }

    void DeleteLast() {
        if (head == null) {
            System.out.println("List's empty bro what 'Last Element' you tryna delete");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            head.previous.previous.next = head;
            head.previous = head.previous.previous;
        }
    }

    void DeleteByData(int nodedata) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node last = head;
        do {
            if (last.data == nodedata) {
                last.next.previous = last.previous;
                last.previous.next = last.next;
                return;
            }
            last = last.next;
        } while (last != head);
        System.out.println("Node with data " + nodedata + " not found");
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

public class CircularLinkedListDoubledConsole {
    public static void main(String[] args) {
        System.out.println("This Is Main");
        CircularLinkedListDoubled list = new CircularLinkedListDoubled();
        list.AddFirst(5);
        list.AddFirst(4);
        list.AddFirst(3);
        list.AddFirst(2);
        list.AddFirst(1);
        list.PrintList();
        list.AddLast(6);
        list.AddFirst(0);
        list.PrintList();
        list.DeleteFirst();
        list.DeleteLast();
        list.PrintList();
        list.DeleteByData(3);
        list.PrintList();
    }
}
