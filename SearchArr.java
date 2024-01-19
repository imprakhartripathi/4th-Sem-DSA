import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SearchArr {
    public static void main(String[] args) {
        Scanner uip = new Scanner(System.in);
        int[] ArrInt = { 77, 90, 5, 69, 12, 42, 0, 2, 8, 100 };
        System.out.println("The Integer Array Is : " + Arrays.toString(ArrInt));
        System.out.print("Enter The Element You Want To Search : ");
        int Search_E, flag = 0, index = 0;
        try {
            Search_E = uip.nextInt();
        } catch (InputMismatchException IME) {
            System.out.println("Invalid Input Please Enter Integer Value");
            return;
        }
        for (int i = 0; i < ArrInt.length; i++) {
            if (ArrInt[i] == Search_E) {
                flag = 1;
                index = i;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("The Searched Element " + Search_E + " Is Present At The Index " + index);
        } else {
            System.out.println("Searched Element Not Found In The Array");
        }

        // String Search

        String Str = "String";
        System.out.println("The String Is : " + Str);
        System.out.print("Enter The Character To Be Searched (Case Sensetive) : ");
        char Search_C;
        int flagS=0, indexS=0;
        try{
            Search_C=uip.next().charAt(0);
        }catch(NoSuchElementException NSEE){
            System.out.println("Invalid Input No Such Element Exists In The Dictionary");
            return;
        }
        for(int j=0; j<Str.length(); j++){
            if(Str.charAt(j)==Search_C){
                flagS=1;
                indexS=j;
                break;
            }
        }
        if (flagS == 1) {
            System.out.println("The Searched Element '" + Search_C + "' Is Present At The Index " + indexS);
        } else {
            System.out.println("Searched Element Not Found In The String");
        }

    }
}