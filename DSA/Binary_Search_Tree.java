package DSA;

import java.util.Scanner;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data = data;
    }
}

public class Binary_Search_Tree {
    static Node createNode(){
        System.out.println("Enter data:");
        Scanner sc = new Scanner(System.in);
        Node node = null;
        int data = sc.nextInt();
        if(data == -1)
            return null;
        node = new Node(data);
        System.out.println("Enter left of "+data);
        node.left = createNode();
        System.out.println("Enter right of "+data);
        node.right = createNode();

        return node;
    }

    public static void inOrder(Node node){
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    public static void preOrder(Node node){
        if(node == null) return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void postOrder(Node node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }

    public static int height(Node node){
        if(node == null)
            return 0;
        return Math.max(height(node.left),height(node.right));
    }

    public static void main(String[] args) {

        Node node = createNode();
        System.out.println("IN-ORDER");
        inOrder(node);
        System.out.println();
        System.out.println("PRE-ORDER");
        preOrder(node);
        System.out.println();
        System.out.println("POST-ORDER");
        postOrder(node);
        System.out.println();
    }
}
