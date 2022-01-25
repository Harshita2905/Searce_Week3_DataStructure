package Practice;

import java.util.Scanner;

class Stack{
    int top;
    int maxsize = 10;
    int[] arr = new int[maxsize];


    boolean isEmpty(){
        return(top<0);
    }

    Stack(){
        top=-1;
    }

    boolean push(int val){
        if(top == maxsize-1){
            System.out.println("Overflow!!");
            return false;
        }else{
            System.out.println("Enter value :");
           
            top++;
            arr[top]=val;
            System.out.println("Item pushed on top of stack");
            System.out.println("Top :"+top);
            return true;
        }
        
    }

    boolean pop(){
        if(top==-1){
            System.out.println("Underflow!!");
            return false;
        }else{
            top--;
            System.out.println("Item popped from top of stack");
            System.out.println("Top :"+ top);
            return true;
        }

    }

    void display(){
        System.out.println("Printing Stack :");
        for(int i=top;i>=0;i--){
            System.out.println("|"+arr[i]+"|");
            System.out.println("----");
        }
    }
    
}
public class ArrayStack {
        public static void main(String[] args) {
            int ch =0;
            Scanner sc = new Scanner(System.in);

            Stack s = new Stack();

            System.out.println("---------Stack Operations using Array-----------");
            System.out.println("------------------------------------------------");
            while(ch != 4){
                System.out.println("Choose One From Below :");
                System.out.println("\n 1.Push\n 2.Pop \n 3.Show\n4.Exit\n");
                System.out.println("Enter Your choice :");
                ch=sc.nextInt();
                switch(ch){
                    case 1:
                            System.out.println("Enter Item to be Pushed :");
                            int val = sc.nextInt();
                            s.push(val);
                            break;
                    case 2:
                            s.pop();
                            break;
                    case 3:
                            s.display();
                            break;
                    case 4:
                            System.out.println("Exiting...");
                            System.exit(0);
                            break;
                    default:
                            System.out.println("Enter valid Choice!");


                }
            };
        }
}
