import java.util.*;
public class Basic_Arr{
    public static void main(String[] args) { //Assignment 1 Questions
//--------------------------------------------------------------------------------------------------------------------------------------------
        //Q1 Program to initialize an array with given values.
        int[] Arr={0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; 
//--------------------------------------------------------------------------------------------------------------------------------------------
        // Q2 Program to traverse (iterate through) an array and print its elements
        System.out.print("\nThe Array Present in the System is = ");
        for(int i=0; i<Arr.length; i++){
            System.out.print(Arr[i] + " ");
        }
        System.out.println(" \n");
//--------------------------------------------------------------------------------------------------------------------------------------------
        // Q3 Program to find the sum of all elements in an array.
        int sum=0;
        for(int i=0; i<Arr.length; i++){
            sum+=Arr[i];
        }
        System.out.print("The Sum of The Values Of The Array is = " + sum);
        System.out.println(" \n");
//--------------------------------------------------------------------------------------------------------------------------------------------
        //Q4 Program to calculate the average of elements in an array.
        double average=(double) sum/Arr.length;
        System.out.print("Average of The Array Elements is = " + average);
        System.out.println(" \n");
//--------------------------------------------------------------------------------------------------------------------------------------------
        //Q5 Program to find the maximum and minimum values in an array.
//--------------------------------------------------------------------------------------------------------------------------------------------
        // Q6 Program to search for a specific element in an array.
        Scanner uip=new Scanner(System.in);
        System.out.print("Search Element Here : ");
        int Search_E=uip.nextInt(), index=-1;
        for(int i=0; i<Arr.length; i++){
            if(Arr[i]==Search_E){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.print("\nError Item Not Found");
        }else{
            System.out.print("\nThe Searched Element " + Search_E + " Is Present In The Array And At " + index + "th Position");
        }
        System.out.println(" \n");
//--------------------------------------------------------------------------------------------------------------------------------------------
        //Q7 Program to insert an element at a specified position in an array. 
        System.out.print("Enter The Element That You Want To Insert : ");
        int Insert_E=uip.nextInt();
        System.out.print("\nEnter The Position That You Want To Insert It In(Max 10) : ");
        int Pos=uip.nextInt();

        int[] newArr=new int[Arr.length+1];
        for (int i=0, j=0; i<newArr.length; i++) {
            if (i==Pos) {
                newArr[i]=Insert_E;
            } else {
                newArr[i]=Arr[j++];
            }
        }

        System.out.print("\nArray After Insertion of New Element : " + Arrays.toString(newArr));
        System.out.println(" \n");
//--------------------------------------------------------------------------------------------------------------------------------------------
        //Q8 Program to delete an element from a specific position in an array.
        System.out.print("Enter The Position On Which You Want The Element To Be Deleted(Max 9) : ");
        int Del_Pos=uip.nextInt();
        int[] newnewArr=new int[Arr.length-1];
        for (int i=0, j=0; i<newnewArr.length; i++, j++) {
            if (j==Del_Pos) {
                j++;
            }
            newnewArr[i]=Arr[j];
        }

        System.out.print("\nArray After Deletion Of The Element : " + Arrays.toString(newnewArr));
        System.out.println(" \n");
//--------------------------------------------------------------------------------------------------------------------------------------------
        //Q9 Program to reverse the elements of an array.
        int[] revArr=Arr;
        int start=0;
        int end=revArr.length - 1;
        while (start<end) {
            int temp = revArr[start];
            revArr[start] = revArr[end];
            revArr[end] = temp;

            start++;
            end--;
        }

        System.out.print("Array After Reversal : " + Arrays.toString(revArr));
        System.out.println(" \n");
//--------------------------------------------------------------------------------------------------------------------------------------------
        //10 Program to rotate the elements of an array to the left or right by a given number of positions.
//--------------------------------------------------------------------------------------------------------------------------------------------
        //Q11 Program to sort elements in an array (e.g., using bubble sort, insertion sort, or quicksort).
        int[] MixArr={9, 7, 2, 1, 0, 3, 4, 6, 8, 5};
        System.out.print("Unsorted Array : ");
        for (int i=0; i<MixArr.length; i++) {
            System.out.print(MixArr[i] + " ");
        }
        System.out.println(" \n");

        System.out.print("Would You Like To Sort This Array?(Answer In Either 'true' or 'false')  =  ");
        boolean Choice=uip.nextBoolean();
        if(Choice==true){
            int n=MixArr.length;
            for(int i=0; i<n-1; i++){
                for (int j=0; j<n-i-1; j++){
                    if (MixArr[j] > MixArr[j+1]){
                        int temp2 = MixArr[j];
                        MixArr[j] = MixArr[j+1];
                        MixArr[j+1] = temp2;
                    }
                }
            }

            System.out.print("\nSorted Array : ");
            for (int i=0; i<n; i++) {
                System.out.print(MixArr[i] + " ");
            }
        }else{
            System.out.print("\nWrong Input, But I Get It You Want To Skip To The Next Segment Nobody Loves Me :(");
        }
        System.out.println("\n");
//-------------------------------------------------------------------------------------------------------------------------------------------- 
        //Q12 Program to find the intersection of two arrays.
//-------------------------------------------------------------------------------------------------------------------------------------------- 
        //Q13 Program to find the union of two arrays.
//-------------------------------------------------------------------------------------------------------------------------------------------- 
        //Q14 Program to merge two sorted arrays into a single sorted array.
        int[] array1={0, 1, 2, 3, 4};
        int[] array2={5, 6, 7, 8, 9};
        System.out.print("Array 1 : " + Arrays.toString(array1));
        System.out.print("\n\nArray 2 : " + Arrays.toString(array2));

        int[] mergedArray=new int[array1.length + array2.length];
        int i=0, j=0, k=0;

        while(i<array1.length && j<array2.length){
            if(array1[i]<array2[j]){
                mergedArray[k++]=array1[i++];
            }else{
                mergedArray[k++]=array2[j++];
            }
        }

        while(i<array1.length){
            mergedArray[k++]=array1[i++];
        }

        while(j<array2.length){
            mergedArray[k++]=array2[j++];
        }

        System.out.print("\n\nMerged And Sorted Array : " + Arrays.toString(mergedArray));
        System.out.println(" \n");
//-------------------------------------------------------------------------------------------------------------------------------------------- 
        //Q15 Program to find the frequency of each element in an array.
//-------------------------------------------------------------------------------------------------------------------------------------------- 
        //Q16 Program to check if one array is a subset of another.
//-------------------------------------------------------------------------------------------------------------------------------------------- 
        //Q17 Program to transpose a 2D array.
//-------------------------------------------------------------------------------------------------------------------------------------------- 
        //Q18 Program to find and print the unique elements in an array.
//-------------------------------------------------------------------------------------------------------------------------------------------- 
        //Q19 Program to find the product of all elements in an array.
//-------------------------------------------------------------------------------------------------------------------------------------------- 
        //Q20 Program to check if an array is symmetric (palindromic).
//--------------------------------------------------------------------------------------------------------------------------------------------
    //hello
    

    }
}