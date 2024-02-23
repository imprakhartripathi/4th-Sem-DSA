import java.util.Scanner;

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
        Scanner ip = new Scanner(System.in);
        System.out.println("\nMenue:");
        System.out.println("1. AddFirst\n2. Addlast\n3. Delete\n4. sort\n5. Print\n6. Exit");
        int choice;
        do {
            System.out.print("Enter Your Choice : ");
            choice = ip.nextInt();
                switch (choice) {
                    case 1:
                    System.out.println("Enter the element : ");
                        int a = ip.nextInt();
                        list.Addfirst(a);
                        break;
                    case 2:
                    System.out.println("Enter The Element : ");
                        int b = ip.nextInt();
                        list.Addlast(b);
                        break;
                    case 5:
                        list.printlist();
                        break;
                    default:
                        System.out.println("Wrong Input Enter Again ");
                }
        } while (choice != 6);
    }
}