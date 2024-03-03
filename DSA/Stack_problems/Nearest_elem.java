package DSA.Stack_problems;

/*
    nearest smallest element from left,right
    nearest largest element from left,right
*/

import java.util.*;

public class Nearest_elem {

    // nearest smallest element from left
    public static int[] smallestFromLeft(int[] a){
        int[] b = new int[a.length];
        Stack<Integer>s = new Stack<>();
        for(int i=0;i< a.length;i++){
            while(!s.isEmpty() && s.peek()>=a[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                b[i] = s.peek();
            }
            else {
                b[i] = -1;
            }
            s.push(a[i]);

        }
        return b;
    }

    // nearest largest element from left
    public static int[] largestFromLeft(int[] a){
        int[] b = new int[a.length];
        Stack<Integer>s = new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty() && s.peek()<a[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                b[i] = s.peek();
            }
            else b[i] = -1;
            s.push(a[i]);
        }
        return b;
    }
    public static void main(String[] args) {
        int[] a = {4,10,5,8,20,15,3,12};
//        int[] a = {1,2,3,4};
//        int[] res = smallestFromLeft(a);
        int[] res = largestFromLeft(a);

        for (int j:res)
            System.out.print(j+" ");
        System.out.println();
    }
}
