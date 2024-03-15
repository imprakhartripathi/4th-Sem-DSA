import java.util.Arrays;

public class SelectionSort {
    static void SelectionSorter(int[] temparr) {
        int minimum, temp, i, j;
        for(i=0; i < temparr.length; i++){
            minimum=i;
            for(j=i+1; j<temparr.length; j++){
                if (temparr[j]<temparr[minimum]){
                    minimum=j;
                }
                temp=temparr[i];
                temparr[i]=temparr[minimum];
                temparr[minimum]=temp;
            }
        }
        System.out.println("Array After Selection Sorting is : " + Arrays.toString(temparr));
    }

    public static void main(String[] args) {
        int[] arrmain={4, 1, 3, 2, 6, 5, 0, 8, 7, 9};
        System.out.println("The Predefined Array In Main is : " + Arrays.toString(arrmain));
        SelectionSorter(arrmain);
    }
}
