
//Week 3 -> day 1 -> Assignment 2
// Singly LinkedList
package Assignments;

public class LinkedList {
    class Node {
        int data;
        Node next;

        //Creating Node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    //Adding Node
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    //Displaying LinkedList
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("LinkedList is Empty...");
            return;
        }

        System.out.println("LinkedList is :");
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(35);
        ll.add(45);
        ll.add(55);
        ll.add(65);
        ll.add(75);
        ll.display();

    }
}
