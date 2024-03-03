package com.company;


//public class leetcode {
//    public static int occurMax(ArrayList<Object>a){
//
//        HashMap<Object,Integer>m = new HashMap<>();
//        for(int i=0;i<a.size();i++){
//            if(m.containsKey(a.get(i)))
//                m.put(a.get(i),m.get(a.get(i))+1);
//            else
//                m.put(a.get(i),1);
//        }
//        Iterator<Map.Entry<Object,Integer>> it = m.entrySet().iterator();
//        int max=0;
//        while(it.hasNext()){
//            int ma = it.next().getValue();
//            if(ma>max)
//                max = ma;
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();  // gt4r22w7e
////        System.out.println(s);
//        ArrayList<Object>d = new ArrayList<>();
//        ArrayList<Object>l = new ArrayList<>();
//        for(int i=0;i<s.length();i++){
//            if(Character.isDigit(s.charAt(i)))
//                d.add(s.charAt(i));
//            else if(s.charAt(i)!=' ')
//                l.add(s.charAt(i));
//        }
//        int digMax = occurMax(d);
//        int letMax = occurMax(l);
////        System.out.println(digMax+" "+letMax);
//        int dif = Math.abs(letMax - digMax);
////        System.out.println(dif);
//        char c = s.charAt(dif);
////        System.out.println(c);
//
//        String str = "";
//        if(c!=' '){
//            ArrayList<Character>a = new ArrayList<>();
//            for(int i=0;i<s.length();i++){
//                a.add(s.charAt(i));
//            }
////            System.out.println(a);
//            a.removeAll(Collections.singleton(c));
////            System.out.println(a);
//            for(int i=0;i<a.size();i++){
//                if(a.get(i)==' ')
//                {
//                    a.set(i,'$');
//                }
//                str+=a.get(i);
//            }
//            System.out.println(str);
//        }
//        else{
//            ArrayList<Character>a = new ArrayList<>();
//            for(int i=0;i<s.length();i++){
//                a.add(s.charAt(i));
//            }
//            for(int i=0;i<a.size();i++){
//                if(a.get(i)==' ')
//                {
//                    a.set(i,'$');
//                }
//                str+=a.get(i);
//            }
//            System.out.println(str);
//        }
//    }
//}

import java.util.*;
public class Solution {

    public static boolean isPal(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int len = sc.nextInt();
        int[] a = new int[len];
        for(int i=0;i<len;i++){
            a[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0;i<a.length;i++){
            int j=0;
            while(j<=s.length()-a[i]){
                if(isPal(s.substring(j,j+a[i]))) {
                    count++;
                }
                j++;
            }
        }
        System.out.println(count);
    }
}


//    int i=0; int j=st.length()-1;
//    int flag=0;
//        while(i<j){
//        if(st.charAt(i)!=st.charAt(j)){
//        flag=1;
//        break;
//        }
//        i++;
//        j--;
//        }
//        return (flag==0? true:false);