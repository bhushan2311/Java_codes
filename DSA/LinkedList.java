package DSA;


class Node_{
    int data;
    Node_ next;
    Node_(int d){
        this.data = d;
        this.next = null;
    }
}


public class LinkedList {

    static Node_ head = null;
    public static void traverse(){
        if(head==null)
            System.out.println("Linked list is empty");
        else
        {
            Node_ cur = head;
            while (cur != null) {
                System.out.print(cur.data + " ");
                cur = cur.next;
            }
            System.out.println();
        }
    }

    public static void insertAtPos(int pos,int data){
        Node_ toAdd = new Node_(data);
        if(head == null){
            head = toAdd;
        }
        else if(pos == 0){
            toAdd.next = head;
            head = toAdd;
        }
        else{
            Node_ cur = head;
            for(int i=0;i<pos-1;i++){
                cur = cur.next;
            }
            toAdd.next = cur.next;
            cur.next = toAdd;
        }
    }

    public static void insertAtEnd(int val){
        Node_ toAdd = new Node_(8);
        Node_ cur = head;
        while(cur.next!=null){
            cur = cur.next;
        }
        cur.next = toAdd;
    }

    public static void deleteAtPos(int pos){
        if(pos == 0){
            head = head.next;
        }
        else{
            Node_ cur = head;
            for(int i=0;i<pos-1;i++){
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
    }

    public static void deleteEnd(){
        if(head == null)
            System.out.println("Cannot delete bcz linked list is empty");
        else if(head.next == null)
            head = null;
        else
        {
            Node_ cur = head;
            while (cur.next.next != null)
                cur = cur.next;

            cur.next = null;
        }
    }

    public static void insertBegin(int v){
        Node_ n = new Node_(v);
        n.next = head;
        head = n;
    }

    public static void main(String[] args) {
        Node_ n1 = new Node_(3);
        Node_ n2 = new Node_(4);
        Node_ n3 = new Node_(6);

        head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;

        traverse();

        insertAtPos(0,7);
        traverse();

        insertAtEnd(8);
        traverse();

        deleteAtPos(0);
        traverse();

        deleteEnd();
        traverse();

        deleteEnd();
        traverse();

        deleteEnd();
        traverse();

        deleteEnd();
        traverse();

        deleteEnd();

        insertBegin(44);
        traverse();

    }
}
