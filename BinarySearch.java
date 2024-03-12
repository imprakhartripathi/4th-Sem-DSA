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

    /*static void binarySearchManualWithDuplication(int[] temparr, int countelement) {
        int count = 0;
        int occurrence = -1;
        Arrays.sort(temparr);
        int lowerbound = 0, upperbound = temparr.length - 1, mid;
        while (lowerbound <= upperbound) {
            mid = lowerbound + (upperbound - lowerbound) / 2;
            if (temparr[mid] == countelement) {
                count++;
                if (occurrence == -1) {
                    occurrence = mid;
                }
                upperbound = mid - 1;
            } else if (temparr[mid] > countelement) {
                upperbound = mid - 1;
            } else {
                lowerbound = mid + 1;
            }
        }
        if (count > 0) {
            System.out.println(
                    "The Element " + countelement + " is duplicated " + count + " times. The first occurrence of " +
                            countelement + " is at position " + occurrence + " in the sorted array.\n"
                            + Arrays.toString(temparr) +
                            "\nDone by manual binary search with duplication count.");
        } else {
            System.out.println("Element not found.");
        }
    }*/

    static void duplicationCount(int[] temparr, int countelement) {
        Arrays.sort(temparr);
        int counter=0;
        for (int i = 0; i < temparr.length; i++) {
            if (temparr[i]==countelement){
                counter++;
            }
        }
        int[] indexes = new int[counter];
        int iterator=0;
        for (int i = 0; i < temparr.length; i++) {
            if (temparr[i]==countelement && iterator<=counter){
                indexes[iterator]=i+1;
                iterator++;
            }
        }
        System.out.println("The Element " + countelement + " is Duplicted " + counter + " Times and is on the respective positions : ");
        System.out.println(Arrays.toString(indexes));
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

        int[] DuplicateArr = { 1, 11, 2, 4, 2, 4, 6, 7, 8, 9, 1, 8, 4, 9, 0, 11, 12, 4, 33, 3, 0 };
        System.out.println("The Predefined Array with Duplicates is " + Arrays.toString(DuplicateArr));
        System.out.print("Enter the Element To Check Its Duplication : ");
        int countelementinput = ip.nextInt();
        duplicationCount(DuplicateArr, countelementinput);
    }
}
