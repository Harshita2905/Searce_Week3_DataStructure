package Practice;

import java.util.Scanner;

class Queue {
    private int maxsize = 10;
    private int[] QArray = new int[maxsize];
    private int front;
    private int rear;
    private int current;

    Queue() {
        front = 0;
        rear = -1;
        current = 0;
    }

    public void enqueue(int val) {
        if (isQueueFull()) {
            System.out.println("Queue is full!!");
            return;
        }
        if (rear == maxsize - 1) {
            rear = -1;
        }

        QArray[++rear] = val;
        current++;
        System.out.println("Item Added into Queue..." + val);
        System.out.println("Current :" + current);
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is Empty!!");
        }
        int temp = QArray[front++];
        if (front == maxsize) {
            front = 0;
        }
        current--;
        System.out.println(temp + "Item deleted");

    }

    public boolean isQueueFull() {
        return (maxsize == current);
    }

    public boolean isQueueEmpty() {
        return (current == 0);
    }

    void display() {
        System.out.println("Printing Queue :");
        for (int i = rear; i >= 0; i--) {
            System.out.print("->" + QArray[i]);

        }
        System.out.println();

    }
}

public class ArrayQueue {
    public static void main(String[] args) {
        int ch = 0;
        Scanner sc = new Scanner(System.in);

        Queue q = new Queue();

        System.out.println("---------Queue Operations using Array-----------");
        System.out.println("------------------------------------------------");
        while (ch != 4) {
            System.out.println("Choose One From Below :");
            System.out.println("\n 1.Enqueue\n 2.Dequeue \n 3.Show\n4.Exit");
            System.out.println("Enter Your choice :");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter item to be added in Queue:");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Enter valid choice!!");

            }
        }
        ;
    }
}
