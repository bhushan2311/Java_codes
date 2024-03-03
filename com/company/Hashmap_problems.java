package com.company;

import java.util.HashMap;

public class Hashmap_problems {

    public static void main(String[] args) {

// ----------------- to find number of distinct elements in every sub-array of size 4 -----------------
//        int[] a = {1,1,2,3,2,2,1,3};
//        int[] a = {1,2,2,1,3,1,1,3};           // anuj bhaiyya example
//        HashMap<Integer,Integer>m = new HashMap<>();
//        int k=4;

        // ---------- By Anuj Bhaiyya ----------

//        for(int i=0;i<k;i++){
//            m.put(a[i],m.getOrDefault(a[i],0)+1);
//        }
//        System.out.println(m);
//        System.out.println(m.size());
//        for(int i=k;i<a.length;i++){
//            int num = a[i-k];
//            if(m.get(num)==1){
//                m.remove(num);
//            }
//            else{
//                m.put(num,m.get(num)-1);
//            }
//            m.put(a[i],m.getOrDefault(a[i],0)+1);
//
//            System.out.println(m);
//            System.out.println(m.size());
//        }

        // -------- By myself ----------
//        for(int i=0;i<a.length;i++)
//        {
//            if(i<k) {
//                m.put(a[i], m.getOrDefault(a[i], 0) + 1);
//                if(i==k-1){
//                    System.out.println(m);
//                    System.out.println(m.size());
//                }
//            }
//            else{
//                int ch = a[i-k];
//                if(m.get(ch)==1)
//                    m.remove(ch);
//                else{
//                    m.put(ch,m.get(ch)-1);
//                }
//                m.put(a[i],m.getOrDefault(a[i],0)+1);
//                System.out.println(m);
//                System.out.println(m.size());
//            }
//        }


//  --------------------- To find given sum lie in which sub-array -----------------------

//        int[] b = {10,15,-5,15,-10,5};
//        int s = 5;            // find sub-array gives this sum.
//
//        HashMap<Integer,Integer>map = new HashMap<>();
//        int subArrSum=0; int start=0,end=0;
//        for(int i=0;i<a.length;i++){
//            subArrSum+=b[i];
//            if(subArrSum-s == 0){
//                end=i;
//                break;
//            }
//            else if(map.containsKey(subArrSum-s)){
//                start = map.get(subArrSum-s)+1;
//                end = i;
//                break;
//            }
//            map.put(subArrSum,i);
//        }
//        System.out.println(start+" "+end);
//        System.out.println(map);


//  ----------------- To find number of sub-arrays which yields given xor -----------------------

        int[] a = {5,6,7,8,9};
        int b = 5;              // required xor
        HashMap<Integer,Integer>m = new HashMap<>();
        m.put(0,1);
        int xor = 0; int count=0;
        for(int i=0;i<a.length;i++){
            xor^=a[i];
            int isKeyinMap = xor^b;
            if(m.containsKey(isKeyinMap)){
                count+=m.get(isKeyinMap);
            }
            m.put(xor,m.getOrDefault(xor,0)+1);
        }
        System.out.println(count);
        System.out.println(m);
    }
}
