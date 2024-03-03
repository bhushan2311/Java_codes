package DSA.Binary_Trees;

import java.util.ArrayList;

public class BinarySearchTree {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node createBST(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        else{
            if(data<root.data)
                root.left = createBST(root.left,data);
            else {
                root.right = createBST(root.right,data);
            }
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    // ---------------- Searching node ----------------
    public static boolean searchNode(Node root,int data){
        if(root == null)
            return false;
        else if(data<root.data)
            return searchNode(root.left, data);
        else if(data>root.data)
            return searchNode(root.right,data);
        else
            return true;
    }


    // ------------------- Delete a Node by Apna college ------------------

//    public static Node delete(Node root, int val){
//        if(val<root.data){
//            root.left = delete(root.left,val);
//        }
//        else if(val>root.data)
//            root.right = delete(root.right,val);
//        else{
//            if(root.right == null && root.left == null)
//                return null;
//            else if(root.left == null)
//                return root.right;
//            else if(root.right == null)
//                return root.left;
//            else{
//                Node IOS = inOrderSuccessor(root.right);
//                root.data = IOS.data;
//                root.right = delete(root.right, IOS.data);
//            }
//        }
//        return root;
//    }
//
//    public static Node inOrderSuccessor(Node root){
//        while(root.left!=null){
//            root = root.left;
//        }
//        return root;
//    }

    // -------------- Print in range --------------
    public static void printInRange(Node root,int x, int y){
        if(root == null)
            return;
        else if(x<=root.data && root.data<=y){
            printInRange(root.left,x,y);
            System.out.print(root.data+" ");
            printInRange(root.right,x,y);
        }
        else if(root.data<x){
            printInRange(root.right,x,y);
        }
        else{
            printInRange(root.left,x,y);
        }
    }

    // -------------- All paths to leaf nodes ------------
    public static void printAllPaths(Node root,ArrayList<Integer>l){
        if(root == null)
            return;
        else{
            l.add(root.data);
            printAllPaths(root.left,l);
            printAllPaths(root.right,l);
            if(root.left == null && root.right == null)
                printPath(l);
            l.remove(l.size()-1);
        }
    }
    public static void printPath(ArrayList<Integer>l){
        for(Integer i:l)
            System.out.print(i+" ");
        System.out.println();
    }

    // ----------------- Check for BST ------------------------
    public static boolean checkBST(Node root,int lb,int ub){
        if(root == null)
            return true;
        else if(root.data<lb || root.data>ub)
            return false;
        else{
            System.out.println(lb+" "+root.data+" "+ub);
            return checkBST(root.left,lb, root.data) && checkBST(root.right, root.data, ub);
        }
    }

    public static void main(String[] args) {
         int[] a = {2,2,2};
         Node root = null;
         for(int i=0;i<a.length;i++){
             root = createBST(root,a[i]);
//             System.out.println("ithe:"+ root.data);          // 5 everytime
         }
        System.out.println("InOrder:");
         inOrder(root);                 // it is always sorted
        System.out.println();
//        System.out.println("is present? : "+searchNode(root,5));

        // ------------ deletion by apna college -------
//        delete(root,9);
//        inOrder(root);

        // ----------- Print Range ----------
//        printInRange(root,5,15);

        // ------------ All Paths to leaf nodes ------------
//        ArrayList<Integer>l = new ArrayList<>();
//        printAllPaths(root,l);

        // ------------- Check for BST ---------------
        int lb = Integer.MIN_VALUE;
        int ub = Integer.MAX_VALUE;
        System.out.println(checkBST(root,lb,ub));
    }
}
