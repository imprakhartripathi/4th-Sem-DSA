import java.util.*;
public class Basic_Arr{
    public static void main(String[] args) {
        int[] Arr={0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //Q1 Program to initialize an array with given values.
//--------------------------------------------------------------------------------------------------------------------------------------------
        System.out.print("\nThe Array Present in the System is = ");// Q2 Program to traverse (iterate through) an array and print its elements
        for(int i=0; i<Arr.length; i++){
            System.out.print(Arr[i] + " ");
        }
//--------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println(" \n");
        int sum=0;// Q3 Program to find the sum of all elements in an array.
        for(int i=0; i<Arr.length; i++){
            sum+=Arr[i];
        }
        System.out.print("The Sum of The Values Of The Array is = " + sum);
        System.out.println(" \n");
//--------------------------------------------------------------------------------------------------------------------------------------------
        double average=(double) sum/Arr.length;//Q4 Program to calculate the average of elements in an array.
        System.out.print("Average of The Array Elements is = " + average);
        System.out.println(" \n");
//--------------------------------------------------------------------------------------------------------------------------------------------
//Q5 Program to find the maximum and minimum values in an array.
//--------------------------------------------------------------------------------------------------------------------------------------------
        Scanner uip=new Scanner(System.in);// Q6 Program to search for a specific element in an array.
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
        System.out.print("Enter The Element That You Want To Insert : ");//Q7 Program to insert an element at a specified position in an array. 
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
        System.out.print("Enter The Position On Which You Want The Element To Be Deleted(Max 9) : ");//Q8 Program to delete an element from a specific position in an array.
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
        int[] revArr=Arr;//Q9 Program to reverse the elements of an array.
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
    }
}