import java.util.Scanner;

public class Stack {
    int top;
    int max;
    int[] stack;

    Stack(int stacksize) {
        max = stacksize;
        top = -1;
        stack = new int[max];
    }

    void Push(int stackelement) {
        if (top == max - 1) {
            System.out.println("Overflow");
            return;
        }
        top++;
        stack[top] = stackelement;
    }

    void Pop(int stackelement) {
        if (top == -1) {
            System.out.println("Underflow");
            return;
        }
        System.out.println("The Deleted Element is " + stack[top]);
        top--;
    }

    void PrintStack() {
        if (top == -1) {
            System.out.println("Underflow Empty Stack");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i] + " ");
        }
        System.out.println();
    }

    void Rewrite(int changeelement, int newelement){
        int flag=0;
        for(int i=top;i>=0;i--){
            if (changeelement==stack[i]){
                stack[i]=newelement;
                return;
            }else{
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("Not Found");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter The Size of The Stack : ");
        int size = ip.nextInt();
        Stack stacker = new Stack(size);
        stacker.PrintStack();
        stacker.Push(0);
        stacker.Push(1);
        stacker.Push(2);
        stacker.Push(3);
        stacker.Push(4);
        stacker.PrintStack();
        stacker.Pop(4);
        stacker.PrintStack();
        stacker.Rewrite(1, 69);
        stacker.PrintStack();
    }
}
