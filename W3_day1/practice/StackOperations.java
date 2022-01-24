package practice;

import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        stk.push(45);
        stk.push(55);
        stk.push(65);
        stk.push(75);
        
        System.out.println(stk.pop());
        System.out.println(stk.pop());

       // System.out.println(stk.search(75));

    }
}
