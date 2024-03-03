package DSA;


import java.util.Scanner;

/*
1. Until q1 !empty, push values to q2
2. add value to q1
3. Until q2 !empty, push values to q1
*/

class Stack_2_Queue extends QueueImplementation{
    Stack_2_Queue(int n){
        super(n);
    }
}

public class stack_using_queue {
    static int n = 5;
    static Stack_2_Queue q1 = new Stack_2_Queue(n);
    static Stack_2_Queue q2 = new Stack_2_Queue(n);
    public static void push(int v){
        while(!q1.isEmpty()){
            System.out.print("q2 -> ");
            q2.EnQueue(q1.DeQueue());
        }
        System.out.print("q1 -> ");
        q1.EnQueue(v);
        while(!q2.isEmpty()){
            System.out.print("q1 -> ");
            q1.EnQueue(q2.DeQueue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        push(7);
        push(3);
        push(4);
        push(1);
        while(!q1.isEmpty()){
            System.out.println(q1.DeQueue());
        }

    }
}
