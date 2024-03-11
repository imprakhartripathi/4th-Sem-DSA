import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static void binarySearchManual(int[] temparr, int key) {
        int lowerbound = 0, upperbound = temparr.length - 1, mid, flag = 0, index = -1;
        Arrays.sort(temparr);
        while (lowerbound <= upperbound) {
            mid = (lowerbound + upperbound) / 2;
            if (temparr[mid] == key) {
                flag = 1;
                index = mid;
                break;
            } else if (temparr[mid] > key) {
                upperbound = mid - 1;
            } else {
                lowerbound = mid + 1;
            }
        }
        if (flag == 1) {
            System.out.println(
                    "Element Found at " + (index + 1) + " Position of the Sorted Array " + Arrays.toString(temparr)
                            + "\nDone By Manual Method");
        } else {
            System.out.println("Element Not Found");
        }
    }

    static void binarySearchPredefinefd(int[] temparr, int key) {
        int result = Arrays.binarySearch(temparr, key);
        Arrays.sort(temparr);
        if (result >= 0) {
            System.out.println(
                    "Element Found at " + (result + 1) + " Position of the Sorted Array " + Arrays.toString(temparr)
                            + "\nDone By Predefined Method");
        } else {
            System.out.println("Elemennt Not Found");
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int[] arr = { 4, 3, 5, 0, 7, 1, 9, 2, 6, 8 };
        System.out.println("The Predefined Array in Main is " + Arrays.toString(arr));
        System.out.print("Enter Element to Search : ");
        int searchelement = ip.nextInt();
        binarySearchManual(arr, searchelement);
        binarySearchPredefinefd(arr, searchelement);
    }
}
