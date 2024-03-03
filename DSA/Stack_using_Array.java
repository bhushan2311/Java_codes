package DSA;

import java.util.Scanner;

class StackImplementation
{
    int capacity;
    int top;
    int[] stk;

    public StackImplementation(int cap)
    {
        this.capacity = cap;
        this.top=-1;
        stk = new int[capacity];
    }

    public boolean isEmpty()
    {
         return top==-1;
    }

    public boolean isFull()
    {
        return top==capacity-1;
    }

    public void Push(int val)
    {
        if(isFull())
            System.out.println("Stack Overflow..!");
        else
        {
            top++;
            stk[top]=val;
        }
    }

    public int Pop()
    {
        if(isEmpty()) {
//            System.out.println("Stack Underflow..!");
            return -1;
        }
        else
        {
            int item;
            item=stk[top];
            top--;
//            System.out.println(item+" has been popped!");
            return item;
        }
    }

    public void View_stack()
    {
        if(isEmpty())
            System.out.println("Stack is Empty..!");
        else {
            for(int i=top;i>-1;i--)
            {
                System.out.println(stk[i]);
            }
        }
    }
}

public class Stack_using_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Capacity of the Stack: ");
        int cap = sc.nextInt();
        StackImplementation st = new StackImplementation(cap);
        int ch,val;
        do{
            System.out.println("\n1.Push Item\n2.Pop Item\n3.View Stack\n4.Exit");
            System.out.print("\nEnter Choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.print("Enter Value:");
                    val = sc.nextInt();
                    st.Push(val);
                }
                case 2 -> {
                    int v = st.Pop();
                }
                case 3 -> st.View_stack();
                case 4 -> System.out.println("Exiting the loop...");
                default -> System.out.println("Invalid Choice!");
            }
        }while(ch!=4);
    }
}