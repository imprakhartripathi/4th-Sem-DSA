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
    void sort() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        int c = 0;
        Node last = head;
        while (last != null) {
            last = last.next;
            c++;
        }
        System.out.println("No of nodes " + c);

        int d;
        for (int i = 0; i < c; i++) {
            Node temp = head;
            Node tempnext = temp.next;
            for (int j = 0; j < c - i - 1; j++) {
                if (temp.data > tempnext.data) {
                    d = temp.data;
                    temp.data = tempnext.data;
                    tempnext.data = d;
                }
                temp = tempnext;
                tempnext = tempnext.next;
            }
        }
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