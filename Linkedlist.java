public class Linkedlist {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void Addfirst(int d) {
        Node newnode = new Node(d);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    void Addlast(int d) {
        Node newnode = new Node(d);
        if (head == null) {
            head = newnode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newnode;
    }

    void Delfirst() {
        if (head == null) {
            System.out.println("DelList is Empty dude!!");
            return;
        }
        if (head.next == null) {
            head = null;
        }
        head = head.next;
    }

    void printlist() {
        if (head == null) {
            System.out.println("List is Empty dude!");
            return;
        }
        Node last = head;
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.printlist();
        list.Addfirst(1);
        list.Addlast(2);
        list.Addlast(3);
        list.printlist();
        list.Addfirst(0);
        list.printlist();
        list.Delfirst();
        list.printlist();
    }
}