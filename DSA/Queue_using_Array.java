package DSA;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

class QueueImplementation
{
    int front,rear,size,capacity;
    int[] queue;
    public QueueImplementation(int cap)
    {
        queue = new int [cap];
        capacity=cap;
        front=0;
        rear=-1;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size()==0;
    }

    public boolean isFull()
    {
        return size()==capacity;
    }

    public void EnQueue(int val)
    {
        if(isFull())
            System.out.println("Queue is Full..!!");
        else
        {
            rear = (rear+1) % capacity;
            queue[rear] = val;
            System.out.println(val+" has been added!");
            size++;
        }
    }

    public int DeQueue()                // made changes to implement Stack using queue
    {
        if(isEmpty()) {
//            System.out.println("Queue is Empty..!!");
            return -1;
        }
        else
        {
            int item;
            item = queue[front];
//            System.out.println(item+" Deleted!!");
            front = (front+1) % capacity;
            size--;
            return item;
        }
    }

    public void view_queue()
    {
        if(isEmpty())
            System.out.println("No Elements to show as Queue is Empty..!");
        else
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(queue[i]+" ");
            }
        }
    }

    public void peek()
    {
        if(isEmpty())
            System.out.println("Queue is Empty..!!");
        else
        {
            System.out.println(queue[front]);
        }
    }
}

public class Queue_using_Array {
    public static void main(String[] args) {
        QueueImplementation q = new QueueImplementation(4);
        Scanner sc = new Scanner(System.in);
        int ch,val;
        do{
            System.out.println("\n1.Insert\n2.Delete\n3.View\n4.View Peek value\n5.Exit");
            System.out.print("Enter choice from above: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.print("Enter value being inserted: ");
                    val = sc.nextInt();
                    q.EnQueue(val);
                }
                case 2 -> {
                    int item = q.DeQueue();
                }
                case 3 -> q.view_queue();
                case 4 -> q.peek();
                case 5 -> System.out.println("Exiting the Loop..");
                default -> System.out.println("Enter Valid Choice!!");
            }
        }while(ch!=5);
    }
}
