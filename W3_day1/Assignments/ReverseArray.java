
//Week 3 -> day 1 -> Assignment 1
//Reversing the Array

package Assignments;

import java.util.Scanner;

class ReverseArray {

    public static void reverseArray(int P[]){
        int Q = P.length;
        for (int i = Q - 1; i >= 0; i--) {
            System.out.print(P[i]);
        }
    }
    public static void printArray(int P[]){
        for (int i : P) {
            System.out.print(i);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Q :");
        int Q = sc.nextInt();

        int P[] = new int[Q];

        for (int i = 0; i < Q; i++) {
            P[i] = sc.nextInt();
        }

        System.out.println("Original Array :");
       printArray(P);
        
        System.out.println();
        System.out.println("Reversed Array :");
        reverseArray(P);

    }
}

