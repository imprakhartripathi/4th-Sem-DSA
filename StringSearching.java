import java.util.Scanner;

public class StringSearching {
    static void linearSearch(String[] temp, String key) {
        int flag = 0, index = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].compareTo(key) == 0) {
                flag = 1;
                index = i;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("The Element Found At Index " + (index + 1));
        } else {
            System.out.println("The Element Not Found");
        }
    }

    public static void main(String[] args) {
        String[] strarr = {"prakhar", "shashank", "krishna", "bob", "john", "kristen", "julia"};
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter The Key : ");
        String search = ip.next();
        linearSearch(strarr, search);
    }
}
