package com.company;

import java.util.Scanner;

class Node
{
    private int data;
    private Node next;
    public Node()
    {
        data=0;
        next=null;
    }
    public Node(int d,Node n)
    {
        this.data = d;
        this.next = n;
    }
    public void setData(int d)
    {
        data=d;
    }
    public void setNext(Node n)
    {
        next=n;
    }
    public int getData()
    {
        return data;
    }
    public Node getNext()
    {
        return next;
    }
}

class LinkedList
{
    private int size;
    private Node start;
    public int size()
    {
        return size;
    }
    public LinkedList()
    {
        size=0;
        start=null;
    }

    public void insertAtBegin(int val)
    {
        Node n,t;
        n = new Node();
        n.setData(val);
        n.setNext(null);
        if(start==null)
            start=n;
        else{
            t=start;
            n.setNext(t);
            start=n;
        }
        size++;
    }

    public void insertAtEnd(int val)
    {
        Node n,t;
        n=new Node();
        if(start==null)
        {
            insertAtBegin(val);
        }
        else{
            n.setData(val);
            t=start;
            while(t.getNext()!=null)
            {
                t=t.getNext();
            }
            t.setNext(n);
            size++;
        }
    }

    public void insertAtPosition(int val,int pos)
    {
        Node n,t,t1;
        n=new Node();
        if(pos==1){
            insertAtBegin(val);
        }
        else if(pos==size+1){
            insertAtEnd(val);
        }
        else if(pos>1 && pos<=size)
        {
            n.setData(val);
            t=start;
            t1=t.getNext();
            for(int i=1;i<size-1;i++)
            {
                t=t.getNext();
            }
            n.setNext(t1);
            t.setNext(n);
            size++;
        }
        else
            System.out.println("\nPlease Enter Valid Position!!!");
    }

    public void delete_begin()
    {
        if(start==null)
        {
            System.out.println("List is already Empty");
        }
        else{
            start=start.getNext();
            size--;
        }
    }

    public void delete_end()
    {
        if(start==null)
        {
            System.out.println("List is already Empty");
        }
        else{
            Node t=start;
            for(int i=1;i<size-1;i++){
                t=t.getNext();
            }
            t.setNext(null);
            size--;
        }
    }

    public void delete_pos(int pos)
    {
        if(start==null)
        {
            System.out.println("List is already Empty");
        }
        else if(pos==1)
        {
            delete_begin();
        }
        else if(pos==size)
        {
            delete_end();
        }
        else if(pos>1 && pos<size)
        {
            Node t,t1;
            t=start;
            t1=t.getNext();
            for(int i=1;i<pos-1;i++){
                t=t.getNext();
            }
            t.setNext(t1.getNext());
            size--;
        }
    }

    public void view_list() {
        if (start == null)
            System.out.println("List is Empty..");
        else {
            Node t;
            t = start;
            for(int i=1;i<=size;i++)
            {
                System.out.print(t.getData()+" ");
                t=t.getNext();
            }
        }
    }
}

public class Linked_List_detail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("\n 1.Insert at Begin\n2.Insert at End\n3.Insert at Position\n4.Delete from First" +
                "\n5.Delete from Last\n6.Delete from Position\n7.View List\n8.Exit");
        int ch,pos,val;
        do {
            System.out.print("\nEnter your choice: ");
            ch = sc.nextInt();
            switch (ch) {               // Enhanced Switch
                case 1 -> {
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    list.insertAtBegin(val);
                    System.out.println("Inserted at begin..");
                }
                case 2 -> {
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    list.insertAtEnd(val);
                    System.out.println("Inserted at End..");
                }
                case 3 -> {
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    System.out.print("Enter Position: ");
                    pos = sc.nextInt();
                    list.insertAtPosition(val, pos);
                    System.out.println("Inserted at position " + pos + "..");
                }
                case 4 -> {
                    list.delete_begin();
                }
                case 5 -> {
                    list.delete_end();
                }
                case 6 -> {
                    System.out.print("Enter position you want to delete element: ");
                    pos = sc.nextInt();
                    list.delete_pos(pos);
                }
                case 7 -> {
                    list.view_list();
                }
            }
        }while (ch!=8);
    }
}