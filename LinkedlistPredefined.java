import java.util.LinkedList;

public class LinkedlistPredefined {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(0);
        list.add(2);
        list.addLast(3);
        System.out.println(list.get(1));
    }
}
