package com.company;

import java.util.*;

//public class most_occurence_inList {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        List<Integer> l = new ArrayList<>();
//        int n = sc.nextInt();
////        for(int i=0;i<n;i++){
////            int v = sc.nextInt();
////            l.add(v);
////        }
////        int size = l.size();
////        HashSet<Integer>h = new HashSet<>(l);
////        Object[] h1 = h.toArray();
////        int max1 = 0; int loc=0;
////        for(int i=0;i<h1.length;i++){
////            int count = Collections.frequency(l,h1[i]);
////            if(count>max1) {
////                max1 = count;
////                loc = i;
////            }
////        }
////        int max = (int)h1[loc];
//
//        List<Integer>arr = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            int v = sc.nextInt();
//            arr.add(v);
//        }
//        int res = 0;
//        int count = 1;
//        for(int i = 1; i < n; i++) {
//            if(arr.get(i) == arr.get(res)) {
//                count++;
//            } else {
//                count--;
//            }
//
//            if(count == 0) {
//                res = i;
//                count = 1;
//            }
//
//        }
//        int num = arr.get(res);
//        int max = Collections.frequency(arr,num);
//
//        System.out.println(max);
//    }
//}

// ------------- [using moore's voting algorithm] works only when occurring element is equal or greater than (sizeofArray/2) -----------------
import java.io.*;
//class most_occurence_inList
//{
//    static int maxFreq(int []arr, int n)
//    {
//        int res = 0;
//        int count = 1;
//        for(int i = 1; i < n; i++) {
//            if(arr[i] == arr[res]) {
//                count++;
//            } else {
//                count--;
//            }
//
//            if(count == 0) {
//                res = i;
//                count = 1;
//            }
//        }
//        return arr[res];
//    }
//
//    // Driver code
//    public static void main (String[] args) {
//        int arr[] = {12,12,3,4,4,5,12,6};
//        int n = arr.length;
//        int freq =  maxFreq(arr , n);
//        int count = 0;
//        for(int i = 0; i < n; i++) {
//            if(arr[i] == freq) {
//                count++;
//            }
//        }
//        System.out.println("Element " +maxFreq(arr , n) +" occurs "  +count +" times" );
//    }
//}
// -------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class most_occurence_inList {
//    public void maxRepeatingElementUsingMap(int [] arrA){
//        //Will store each character and it's count
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i <arrA.length; i++) {
//            if(map.containsKey(arrA[i])){
//                map.put(arrA[i],map.get(arrA[i])+1);
//            }else{
//                map.put(arrA[i], 1);
//            }
//        }
//
////        System.out.println(map);
//        //traverse the map and track the element which has max count
//        Iterator entries = map.entrySet().iterator();
//        int maxCount = 0;
//        int element =arrA[0];
//        while(entries.hasNext()){
//            Map.Entry entry = (Map.Entry) entries.next();
//            int count = (Integer)entry.getValue();
//            if(maxCount<count){
//                maxCount = count;
//                element = (int) entry.getKey();
//            }
//        }
//        System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCount);
//    }
    public static void main(String[] args) {
//        int [] arrA = {1,2,1,1,3,4,5,1,7};
//        most_occurence_inList m = new most_occurence_inList();
//        m.maxRepeatingElementUsingMap(arrA);
//           ----------------------
        int[] arr = new int[]{2,1,3,3,1,2,5,6,1,7,8,3,2,2,1};
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i< arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
        Iterator it = map.entrySet().iterator();
        int max = 0;

        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            int count = (int) e.getValue();
            if(count>max)
                max=count;
        }
        System.out.println(max);


//       ------------------- Using XOR to find lowest occurring element --------------------

//         works only for the elements repeating twice
//        int[] a = {1,2,1,3,4,5,4,2,5};
//        int res = 0;
//        for(int i=0;i<a.length;i++){
//            res = res^a[i];                     // 0 ^ anyNO. = anyNO ..  anyNO ^ anyNO = 0
//        }
//        System.out.println(res);
    }
}