package DSA;

import java.util.Arrays;

public class Binary_Search {

    public static int binarySearch(int[] a,int left,int right,int key){
        int l = left,r = right;
        while(l<=r){
            int mid = (l+r)/2;
            if(a[mid] == key)
                return mid;
            else if(key>a[mid])
                l = mid+1;
            else
                r = mid-1;
        }
        return -1;
    }

    // using Recursion

    public static void main(String[] args) {
        int[] a = {1,3,5,8,9,11,15};
        int l = 0;
        int r = a.length-1; int key = 8;
        int res = binarySearch(a,l,r,key);
        System.out.println(res);

        System.out.println(Arrays.binarySearch(a,0,6,10));

    }
}
