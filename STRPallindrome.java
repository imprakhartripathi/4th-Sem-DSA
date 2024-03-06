import java.util.Scanner;

class StackSTR {
    int top;
    int max;
    char[] stack;

    StackSTR(int stacksize) {
        max = stacksize;
        top = -1;
        stack = new char[max];
    }

    void Push(char stackelement) {
        if (top == max - 1) {
            System.out.println("Overflow");
            return;
        }
        top++;
        stack[top] = stackelement;
    }

    char Pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return '\0';
        }
        char poppedElement = stack[top];
        top--;
        return poppedElement;
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class STRPallindrome {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        while(true){
            System.out.print("Enter a string: ");
            String str = ip.next();

            StackSTR stacker = new StackSTR(str.length());

            for (int i = 0; i < str.length(); i++) {
                stacker.Push(str.charAt(i));
            }

            boolean isPalindrome = true;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != stacker.Pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
}
