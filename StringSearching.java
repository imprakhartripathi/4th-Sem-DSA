import java.util.Arrays;
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

    static void binarySearchString(String[] temp, String key) {
        int lowerbound = 0, upperbound = temp.length - 1, mid, flag = 0, index = -1;
        System.out.println("The Predefined Array Is : " + Arrays.toString(temp));
        Arrays.sort(temp);
        while (lowerbound <= upperbound) {
            mid = (lowerbound + upperbound) / 2;
            if (temp[mid].compareTo(key) == 0) {
                flag = 1;
                index = mid;
                break;
            } else if (temp[mid].compareTo(key) > 0) {
                upperbound = mid - 1;
            } else {
                lowerbound = mid + 1;
            }
        }
        if (flag == 1) {
            System.out.println(
                    "Element Found at " + (index + 1) + " Position of the Sorted Array " + Arrays.toString(temp));
        } else {
            System.out.println("Element Not Found");
        }
    }

    public static void main(String[] args) {
        String[] strarr = { "prakhar", "shashank", "krishna", "bob", "john", "kristen", "julia" };
        Scanner ip = new Scanner(System.in);
        System.out.println("Choose search method:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.print("Enter your choice: ");
        int choice = ip.nextInt();
        System.out.print("Enter The Key : ");
        String search = ip.next();
        switch (choice) {
            case 1:
                linearSearch(strarr, search);
                break;
            case 2:
                binarySearchString(strarr, search);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
