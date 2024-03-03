package com.company;

import java.util.PriorityQueue;
import java.util.*;
import java.util.Comparator;

class HuffmanNode{
    char c;
    int data;

    HuffmanNode left;
    HuffmanNode right;
}


class Huffman_coding {

    public static void printCode(HuffmanNode root, String s){

        if(root.right==null && root.left==null && root.c!='-'){
            System.out.println(root.c+" : "+s);
            return;
        }

        printCode(root.left,s + "0");
        printCode(root.right, s+"1");
    }

    public static void main(String[] args) {

        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charfreq = { 5, 9, 12, 13, 16, 45 };

        PriorityQueue<HuffmanNode>p = new PriorityQueue<>(new Comparator<HuffmanNode>(){
            public int compare(HuffmanNode x, HuffmanNode y){
                return x.data - y.data;
            }
        });

        for(int i=0;i<charArray.length;i++){
            HuffmanNode n = new HuffmanNode();
            n.c = charArray[i];
            n.data = charfreq[i];

            n.left = null;
            n.right = null;

            p.add(n);
        }
        HuffmanNode root = null;
        while(p.size()>1){
            HuffmanNode x = p.peek();
            p.poll();

            HuffmanNode y = p.peek();
            p.poll();

            HuffmanNode f = new HuffmanNode();
            f.data = x.data + y.data;
            f.c = '-';

            f.left = x;
            f.right = y;

            root = f;
            p.add(f);
        }

        printCode(root, "");

    }
}
