package com.company;

/*
int n = sc.nextInt();
int[] a = new int[n];
for(int i=0;i<n;i++){
a[i] = sc.nextInt();
}
*/

import java.util.*;
import java.util.Iterator;

public class Codeforces {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0) {
                int n = sc.nextInt();
                String s = sc.next();
                int i =0; int fir = 0;
                while(i<n){
                    if(s.charAt(i)=='B'){
                        fir = i;
                        break;
                    }
                    i++;
                }
                int j=n
                 int last = 0;
                while(j>=0){
                    if(s.charAt(j)=='B'){
                        last = j;
                        break;
                    }
                    j--;
                }
                System.out.println(last-fir+1);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}






















//        try{
//            Scanner sc = new Scanner(System.in);
//            int t = sc.nextInt();
//            while(t-->0) {
//                int a = sc.nextInt();
//                int b = sc.nextInt();
//                int c = sc.nextInt();
//                long r = a+b+c;
//                if(r%2!=0) {
//                    if(a>=b)
//                        System.out.println("First");
//                    else System.out.println("Second");
//                }
//                else{
//                    if(b>=a)
//                        System.out.println("Second");
//                    else System.out.println("First");
//                }
//            }
//        }
//        catch (Exception e) {
//            System.out.println(e);
//        }

//        HashMap<String,String>doctorDetailsMap = new HashMap<>();
//        doctorDetailsMap.put("HAR101","N");
//        doctorDetailsMap.put("HAR102","en");
//        doctorDetailsMap.put("HAR103","D");
//        doctorDetailsMap.put("HAR104","C");
//        doctorDetailsMap.put("HAR105","en");

//        System.out.println(fspe("HAR104"));

//        String s1 = a[0].toLowerCase();
//        String s2 = a[1].toLowerCase();
//
//        map.put(s1,s2);

//
//        if(doctorDetailsMap.containsKey(doctorId)){
//            return doctorDetailsMap.get(doctorId);
//        }
//        else return null;



//        String specialization = "N";

//        specialization = specialization.toLowerCase();
//        Iterator it = doctorDetailsMap.entrySet().iterator();
//
//        List<String >l = new ArrayList<>();
//        while(it.hasNext()){
//            Map.Entry kv = (Map.Entry) it.next();
//            String v = (String) kv.getValue();
//            if(v.equals(specialization)) {
//                String id = (String) kv.getKey();
//                l.add(id.toUpperCase());
//            }
//        }
//        if(l!=null && l.size()>=1)
//            System.out.println(l);
//        else System.out.println("no doctor");
//        return null;

//        if(fspe("s"))


//        List<String>l = fdoc("e");
//        System.out.println("Linal".equalsIgnoreCase("LInal"));


//
//    String[][] a = new String[8][8];
//    String ans = "";
//               for(int i=0;i<2;i++){
//        for(int j=0;j<2;j++){
//        String s = sc.next();
//        if(s!=".")
//        ans+=s;
//        }
//        }
//        System.out.println(ans);