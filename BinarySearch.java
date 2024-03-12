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

    static void binarySearchPredefined(int[] temparr, int key) {
        int result = Arrays.binarySearch(temparr, key);
        Arrays.sort(temparr);
        if (result >= 0) {
            System.out.println(
                    "Element Found at " + (result + 1) + " Position of the Sorted Array " + Arrays.toString(temparr)
                            + "\nDone By Predefined Method");
        } else {
            System.out.println("Element Not Found");
        }
    }

    static int binarySearchRecursion(int temparr[], int lowerbound, int upperbound, int key) {

        if (lowerbound <= upperbound) {
            int mid = (lowerbound + upperbound) / 2;
            if (temparr[mid] == key) {
                return mid;
            }
            if (temparr[mid] > key)

                return binarySearchRecursion(temparr, lowerbound, mid - 1, key);

            else
                return binarySearchRecursion(temparr, mid + 1, upperbound, key);
        }
        return -1;

    }
    
    static void binarySearchManualWithDuplication(int[] temparr, int countelement) {
        int count = 0;
        int occurance = -1;
        Arrays.sort(temparr);
        int lowerbound = 0, upperbound = temparr.length - 1, mid;
        while (lowerbound <= upperbound) {
            mid = (lowerbound + upperbound) / 2;
            if (temparr[mid] == countelement) {
                count++;
                if (occurance == -1) {
                    occurance = mid + 1;
                }
                upperbound = mid - 1;
            } else if (temparr[mid] > countelement) {
                upperbound = mid - 1;
            } else {
                lowerbound = mid + 1;
            }
        }
        if (count > 0) {
            System.out.println("The Element " + countelement + " is Duplicated " + count + " times and the first selected "
                    + countelement + " was at position " + occurance + " of the Sorted Array \n" + Arrays.toString(temparr) + "\nDone By Manual Binary Search With Duplication Count");
        } else {
            System.out.println("Element Not Found");
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int[] arr = { 4, 3, 5, 0, 7, 1, 9, 2, 6, 8 };
        System.out.println("The Predefined Array in Main is " + Arrays.toString(arr));
        System.out.print("Enter Element to Search : ");
        int searchelement = ip.nextInt();


        binarySearchManual(arr, searchelement);

        binarySearchPredefined(arr, searchelement);


        int indexvariable = binarySearchRecursion(arr, 0, arr.length, searchelement);
        if (indexvariable >= 0) {
            Arrays.sort(arr);
            System.out.println("Element Found at " + (indexvariable + 1) + " Position of the Sorted Array "
                    + Arrays.toString(arr) + "\nDone By Recursion Method");
        } else {
            System.out.println("Element Not Found");
        }

        
        int[] DuplicateArr = {1, 11, 2, 4, 2, 4, 6, 7, 8, 9, 1, 8, 4, 9, 0, 11, 12, 4, 33, 3, 0};
        System.out.println("The Predefined Array with Duplicates is " + Arrays.toString(DuplicateArr));
        System.out.print("Enter the Element To Check Its Duplication : ");
        int countelementinput = ip.nextInt();
        binarySearchManualWithDuplication(DuplicateArr, countelementinput);
    }
}
