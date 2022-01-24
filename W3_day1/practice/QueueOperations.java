package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        System.out.println("Add elements in Queue");
        q.add(sc.nextInt());
        q.add(sc.nextInt());
        q.add(sc.nextInt());
        q.add(sc.nextInt());
        q.add(sc.nextInt());

        System.out.println("element at top");
        System.out.println(q.peek());

        System.out.println("Dequeued Elements");
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
