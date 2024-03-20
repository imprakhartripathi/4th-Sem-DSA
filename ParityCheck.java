import java.util.Scanner;

public class ParityCheck {
    static void paritychecknoncontinious(String binarystring) {
        int countone = 0, countzero = 0;
        for (int i = 0; i < binarystring.length(); i++) {
            if (binarystring.charAt(i) == '1') {
                countone++;
            }
            if (binarystring.charAt(i) == '0') {
                countzero++;
            }
        }
        if (countone >= 7 && countzero < 7) {
            System.out.println("yes");
        } else if (countzero >= 7 && countone < 7) {
            System.out.println("yes");
        } else if (countone >= 7 && countzero >= 7) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    static void paritycheckcontinious(String binaryString) {
        int countone_c = 0;
        int countzero_c = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                countone_c++;
                countzero_c = 0;
                if (countone_c == 7) {
                    System.out.println("yes");
                    return;
                }
            } else {
                countzero_c++;
                countone_c = 0; 
                if (countzero_c == 7) {
                    System.out.println("yes");
                    return;
                }
            }
        }
        System.out.println("no");
    }

    static void paritycheckcontinioususingdefaultfunction(String binaryString){

        if (binaryString.contains("1111111") || binaryString.contains("0000000")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        while(true){
            System.out.println("1. Parity Check 7 ('0' and '1') Not Continious\n2. Parity Check 7 ('0' and '1') Continious\n3. Parity Check 7 ('0' and '1') Continious with Default Function");
            System.out.print("Enter tour Choice : ");
            int choice = ip.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter A Binary String : ");
                    String str = ip.next();
                    paritychecknoncontinious(str);
                    break;
                
                case 2:
                    System.out.print("Enter A Binary String : ");
                    String str2 = ip.next();
                    paritycheckcontinious(str2);
                    break;

                case 3:
                    System.out.print("Enter A Binary String : ");
                    String str3 = ip.next();
                    paritycheckcontinioususingdefaultfunction(str3);
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;
            }
        }
        
        
    }
}
