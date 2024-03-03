package DSA.Binary_Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Create_tree {
    static class Node{
        int data;
        Node left=null;
        Node right=null;
        Node(int d){
            this.data = d;
        }
    }

    static class BinaryTree{
        int idx = -1;
        public Node createBinaryTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            else{
                Node newNode = new Node(nodes[idx]);
                newNode.left = createBinaryTree(nodes);
                newNode.right = createBinaryTree(nodes);
                return newNode;
            }
        }
    }

    public static void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

    public static void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }

    public static void levelOrder(Node node){
        Queue<Node>q = new LinkedList<>();
        q.add(node);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                if(q.isEmpty())
                    break;
                System.out.println();
                q.add(null);
            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
        }
    }

    public static int countNodes(Node node){
        if(node == null)
            return 0;
        else{
            int leftSubTree = countNodes(node.left);
            int rightSubTree = countNodes(node.right);
            return leftSubTree + rightSubTree + 1;
        }
    }

    public static int sumOfNodes(Node node){
        if(node == null)
            return 0;
        else{
            int leftSubTree = sumOfNodes(node.left);
            int rightSubTree = sumOfNodes(node.right);
            return leftSubTree + rightSubTree + node.data;
        }
    }

    public static int heightofBt(Node node){
        if(node == null){
            return 0;
        }
        else{
            int leftSubTree = heightofBt(node.left);
            int rightSubTree = heightofBt(node.right);

            int maxHeight = Math.max(leftSubTree,rightSubTree)+1;

            return maxHeight;
        }
    }

    /* ---------------------------------------------------------------------
        Diameter of a binary tree: Longest distance between any two nodes
        * The longest distance can be in
            - left subtree or
            - right subtree or
            - from left subtree to right subtree through root

        Approach: for every node there will be 3 cases
            - diameter of left subtree of a node
            - diameter of right subtree of a node
            - left subtree height + right subtree height + 1(root node itself)
        * The maximum of above 3 cases will be the diameter of a tree
       ----------------------------------------------------------------------
    */

    // ---------------------- Finding diameter of a tree in O(N^2) time -----------------------
    public static int diameter(Node node){
        if(node == null)
            return 0;
        else{
            int leftSubtreeDiam = diameter(node.left);
            int rightSubtreeDiam = diameter(node.right);
            int height = heightofBt(node.left)+heightofBt(node.right)+1;

            int myDiam = Math.max(height,Math.max(leftSubtreeDiam,rightSubtreeDiam));

            return myDiam;

        }
    }

    // ---------------------- Finding diameter of a tree in O(N) time -----------------------

    static class treeInfo{
        int hei;
        int diam;

        treeInfo(int h,int d){
            this.diam = d;
            this.hei = h;
        }
    }

    public static treeInfo diameterON(Node node){
        if(node == null){
            return new treeInfo(0,0);
        }
        else{
            treeInfo leftSubTree = diameterON(node.left);
            treeInfo rightSubTree = diameterON(node.right);
            int height = Math.max(leftSubTree.hei,rightSubTree.hei) + 1;

            int diam1 = leftSubTree.diam;
            int diam2 = rightSubTree.diam;
            int diam3 = leftSubTree.hei+rightSubTree.hei+1;

            int mydiam = Math.max(diam3,Math.max(diam1,diam2));

            return new treeInfo(height,mydiam);

        }
    }

    // ----------------------- LEFT VIEW OF A BINARY TREE --------------------------------
    public static void leftView(Node root,ArrayList<Integer>l,int level){
        if(root == null){
            return;
        }
        else{
            if(l.size() == level)
                l.add(root.data);
            leftView(root.left,l,level+1);
            leftView(root.right,l,level+1);
        }
    }

    // ---------------------- RIGHT VIEW OF A BINARY TREE ---------------------------------

    public static void rightView(Node root,ArrayList<Integer>l,int level){
        if(root == null){
            return;
        }
        else{
            if(l.size() == level)
                l.add(root.data);
            rightView(root.right,l,level+1);
            rightView(root.left,l,level+1);
        }
    }

    //  ---------------------- ZIG ZAG TRAVERSAL ---------------------------

    public static ArrayList<Integer> zigzagTraversal(Node root){
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        int flag=0;
        ArrayList<Integer>ans = new ArrayList<>();
        while(!q.isEmpty()){
            ArrayList<Integer>temp = new ArrayList<>();
            int size = q.size();
            while(size-->0){
                Node curr = q.remove();
                temp.add(curr.data);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            if(flag==0){
                for(int i = 0;i<temp.size();i++)
                    ans.add(temp.get(i));
                flag=1;
                System.out.println("0 "+ans);
            }
            else{
//                for(Integer i:temp)
//                    ans.add(i);
                for(int i = temp.size()-1;i>=0;i--)
                    ans.add(temp.get(i));
                flag=0;
                System.out.println("1 "+ans);
            }
        }
        return ans;
    }

    //  ---------------------- CHECK BALANCED TREE ---------------------------

    static int flag;
    public static int isBalanced(Node root){
        if(root == null)
            return 0;
        else{
            int lh = isBalanced(root.left);
            int rh = isBalanced(root.right);

            if(Math.abs(lh-rh)>1)
                flag=1;
            int hei = Math.max(lh,rh)+1;
            return hei;
        }
    }

    // ------------------ REVERSE LEVEL ORDER TRAVERSAL -----------------------
    static public ArrayList<Integer> reverseLevelOrder(Node node)
    {
        // similar as level order traversal but difference is adding right child first in queue
        ArrayList<Integer>l = new ArrayList<>();
        Queue<Node>q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node curr = q.remove();
            l.add(curr.data);
            if(curr.right!=null)
                q.add(curr.right);
            if(curr.left!=null)
                q.add(curr.left);
        }
        Collections.reverse(l);
        return l;
    }

    // ------------------ LCA (Lowest common ancestor) of a tree -------------------
    /*
        There will be 4 cases:
        1. lst = null & rst = null then return null
        2. lst != null & rst != null then return root
        3. lst != null & rst = null then return lst
        4. lst = null & rst != null then return rst
    */

    public static Node LCA(Node root, int n1,int n2){
        if(root == null)
            return null;
        else{
            if(root.data == n1) return root;
            if(root.data == n2) return root;

            Node lst = LCA(root.left,n1,n2);
            Node rst = LCA(root.right,n1,n2);

            if(lst!=null && rst!=null) return root;
            else if(lst==null && rst!=null) return rst;
            else if(lst!=null && rst==null) return lst;
            else return null;
        }
    }

    public static boolean checkBST(Node root, int lb, int ub){

        if(root.data>lb && root.data<ub){
            System.out.println("me:"+root.data);
            if(root.left!=null) {
                ub = root.data;
                return checkBST(root.left, lb, ub);
            }
            if(root.right!=null) {
                lb = root.data;
                return checkBST(root.right, lb, ub);
            }
            return true;
        }
        else{
//            System.out.println("ALO");
            return false;
        }
    }

    public static void main(String[] args) {

        int[] tnodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree btree = new BinaryTree();
        Node rootNode = btree.createBinaryTree(tnodes);
//        System.out.println(rootNode.data+" "+rootNode.left.data+" "+rootNode.right.data);
//        System.out.println(rootNode.data);

        inOrder(rootNode);

//        System.out.println();
//        preOrder(rootNode);

//        System.out.println();
//        postOrder(rootNode);

//        System.out.println();
//        levelOrder(rootNode);

//        System.out.println(countNodes(rootNode));

//        System.out.println(sumOfNodes(rootNode));

//        System.out.println(heightofBt(rootNode));

//        System.out.println(diameter(rootNode));

//        System.out.println(diameterON(rootNode).diam);

//        ArrayList<Integer>l = new ArrayList<>();
////        leftView(rootNode,l,0);
//        rightView(rootNode,l,0);
//        System.out.println(l);

//        System.out.println(zigzagTraversal(rootNode));

//        flag = 0;
//        int hei = isBalanced(rootNode);
//        System.out.println(hei);
//        System.out.println(flag);
//        System.out.println(flag==0? true:false);
//        System.out.println(reverseLevelOrder(rootNode));

//        Node n = LCA(rootNode,7,9);
//        System.out.println(n);

        int lb = Integer.MIN_VALUE;
        int ub = Integer.MAX_VALUE;
        System.out.println(checkBST(rootNode,lb,ub));

    }
}
