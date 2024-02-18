import java.util.Scanner;

public class SimpleQueue {
    int front;
    int rear;
    int max;
    int[] queue;

    SimpleQueue(int queuesize) {
        front = rear = -1;
        max = queuesize;
        queue = new int[max];
    }

    void insert(int queuedata) {
        if (rear == max - 1) {
            System.out.println("The Queue Is Full, Data Insertion Failed\n");
            return;
        }
        if (front == -1) {
            front = rear = 0;
            queue[rear] = queuedata;
            System.out.println("Insertion Successful - " + queue[rear] + "\n");
            return;
        }
        rear++;
        queue[rear] = queuedata;
        System.out.println("Insertion Successful - " + queue[rear] + "\n");
    }

    void delete() {
        if (front == -1) {
            System.out.println("The Queue is Empty, Data Deletion Failed\n");
            return;
        }
        if (front == rear) {
            System.out.println("Deletion Successful of The Only Element " + queue[rear] + "\n");
            front = rear = -1;
            return;
        }
        front++;
        System.out.println("Deletion Successful - " + queue[front - 1] + "\n");
    }

    void print() {
        if (front == -1) {
            System.out.println("The Queue is Empty\n");
            return;
        }
        System.out.print("The Element(s) in The Queue is/are :  ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Queue Size: ");
        int queuesizemain = ip.nextInt();
        System.out.println();
        SimpleQueue q = new SimpleQueue(queuesizemain);
        ip.close();

        q.print();
        q.delete();
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.print();
        q.delete();
        q.print();
        q.delete();
        q.print();
        q.delete();
        q.print();
    }
} 
