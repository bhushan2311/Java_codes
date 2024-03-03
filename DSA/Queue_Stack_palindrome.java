package DSA;

import java.util.*;

public class Queue_Stack_palindrome {
    // Write your code here.

//    //for stack
//    static int top=-1,st_cap=15;
////    top=-1; st_cap=15;
//    static char[] s_a = new char[st_cap];
//    static public void pushCharacter(char c)
//    {
//        top++;
//        s_a[top]=c;
//    }
//
//    static public char popCharacter()
//    {
//        char item;
//        item=s_a[top];
////        System.out.println(item);
//        top--;
//        return item;
//    }
//
//    //for queue
//    static int front=0,rear=-1,q_cap=15,size;
////    static front=0; rear=-1; q_cap=15;
//    static char[] q_a = new char[q_cap];
//    static public void enqueueCharacter(char c)
//    {
//        rear = (rear+1) % q_cap;
//        q_a[rear]=c;
//    }
//
//    static public char dequeueCharacter()
//    {
//        char item;
//        item=q_a[front];
//        front = (front+1) % q_cap;
////        System.out.println(item);
//        return item;
//    }


    static Stack <Character> st=new Stack<>();
    static Queue <Character> q=new PriorityQueue<>();

    static void pushCharacter(char c)
    {
        st.push(c);
    }

    static void enqueueCharacter(char c)
    {
        q.add(c);
    }

    static char popCharacter()
    {
        return st.pop();
    }

    static char dequeueCharacter()
    {
        return q.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Queue_Stack_palindrome object:
        Queue_Stack_palindrome p = new Queue_Stack_palindrome();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
