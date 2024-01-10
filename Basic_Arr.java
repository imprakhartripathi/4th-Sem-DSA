import java.util.*;
public class Basic_Arr{
    public static void main(String[] args) {
        int[] Arr={0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //Q1 Program to initialize an array with given values.

        System.out.print("\nThe Array Present in the System is = ");// Q2 Program to traverse (iterate through) an array and print its elements
        for(int i=0; i<Arr.length; i++){
            System.out.print(Arr[i] + " ");
        }
        System.out.println(" \n");
        int sum=0;// Q3 Program to find the sum of all elements in an array.
        for(int i=0; i<Arr.length; i++){
            sum+=Arr[i];
        }
        System.out.print("The Sum of The Values Of The Array is = " + sum);
        System.out.println(" \n");

        double average=(double) sum/Arr.length;//Q4 Program to calculate the average of elements in an array.
        System.out.print("Average of The Array Elements is = " + average);
        System.out.println(" \n");
    }
}