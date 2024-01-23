public class Linkedlist {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    void Addfirst(int d){
        Node newnode = new Node(d);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    void printlist(){
        if(head==null){
            System.out.println("List is Empty dude!");
            return;
        }
        Node last=head;
        while(last!=null){
            System.out.print(last.data+" ");
            last=last.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Linkedlist list= new Linkedlist();
        list.printlist();
        list.Addfirst(1);
        list.Addfirst(2);
        list.printlist();
        list.Addfirst(3);
        list.Addfirst(4);
        list.Addfirst(5);
        list.printlist();
    }
}