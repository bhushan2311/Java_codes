package com.company;

import java.util.*;
import java.util.Iterator;

public class usolved_mystery {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();   // 98512371
////        String s = Integer.toString(n);
////        char[] o = s.toCharArray();
////        ArrayList<Integer> l=new ArrayList<>();
////        for(int i=0;i<o.length;i++){
////            l.add(Integer.parseInt(String.valueOf(o[i])));
////        }
////        System.out.println(l);
////        int low_ind = l.indexOf(1);
////                    System.out.println(l.get(low_ind));
//
//        ArrayList<Integer>l = new ArrayList<>();
//        l.add(9);
//        l.add(8);
//        l.add(5);
//        l.add(1);
//        l.add(2);
//        l.add(3);
////        System.out.println("Before setting");
////        System.out.println(l);
//        int low_ind = l.indexOf(1);
////      l.set(3,9);
////      l.set(0,1);
////        System.out.println("After setting");
////      System.out.println(l);
//
//        // low_ind=3    l.get(0)=9   l.get(low_ind)=1
////        System.out.println("After setting");
////        int low_val = l.get(low_ind);
////        l.set(low_ind, l.get(0) );      // array changed here
////        System.out.println(l);   //printing changed array
////        System.out.println("--------------");
////        l.set(0, low_val);    // will not consider first array, it prints output considering changed array
////        System.out.println(l);
////        int i = 123;
////        String s = "123";
////        if(i==s)
////            System.out.println();
//
//
////                    System.out.println(low_ind);
////                    long z;
////                    int e = 1;
////                    int low=0;
////                    for(int i=0;i<e;i++){
////                        int min = Collections.min(l);
////                        int low_ind = l.indexOf(min);
////                        l.set(low,min);
////                        l.set(low_ind,l.get(low));
////                    }
////                    System.out.println(l);
//
////        ArrayList<Integer>e = new ArrayList<>();
////        e.add(2);
////        e.add(0);
////        e.add(1);
////        int max = Collections.max(e);
////        int min = Collections.min(e);
////        System.out.println("max:"+max+" min:"+min);
////        System.out.println(e);
////        e.remove(Integer.valueOf(max));
////        System.out.println(e);
//////        e.remove(min);
//////        System.out.println(e);
//
//
////        String s = "100110";
////        System.out.println(s.contains("11"));
//
////        double d1 = (double)10/3;
////        double d = Math.ceil(d1);
////        System.out.println((int)d);
//
//
//
//
////        int result = (int)(Math.log(7488) / Math.log(2));
////        int r = (int)(Math.log(56) / Math.log(2));
////        System.out.println(r);
//
////          int n = 4; int k=1; int dif=2; int in_k = k;
////          for(int i=1;i<=n;i++){
////              if(i%2==0){
////                  k+=dif;
////                  dif+=4;
////              }
////              else if(i!=1 && i%2!=0){
////                  k+=1;
////              }
////              in_k = k;
////              for(int j=1;j<=i;j++){
////                  System.out.print(k + " ");
////                  if(i%2==0) {
////                      k--;
////                  }
////                  else {
////                      k++;
////                  }
////                  if(i!=j){
////                      System.out.print("*"+" ");
////                  }
////              }
////              k = in_k;
////              System.out.println();
////          }
//
////        String parent = "bhushanpandurangbhushan";
////        String sub = "bhushan";
////
////        int j = sub.length();
////        int answer=0;
////
////        int i=0;
////        while(j<=parent.length()){
////            if(parent.substring(i,j).equals(sub))
////                answer++;
////            i++;j++;
////        }
////
////
////        System.out.println(answer);
////
////        double q= 100000000;
//
////        long n = 198;
////        String s = String.valueOf(n);
////        int[] a = new int[s.length()];
////
////        for(int i=0;i<s.length();i++){
////            int j = Integer.parseInt(s.charAt(i)+"");
////            a[i] = j;
////        }
////        Arrays.sort(a);
////        String res = "";
////        String ans = "";
////        int flag=0;
////        for(int i=0;i<a.length;i++){
////            char c = Character.forDigit(a[i],10);
////            if(c=='0')
////                flag=1;
////            res+=c;
////        }
////        if(flag==1){
////            ans += res.charAt(1);
////            ans+='0';
////            ans+=res.substring(2);
////        }
////        else ans=res;
////        System.out.println(ans);
//
//
//    }

    public static boolean con(char c){
        return c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U' ;
    }

//    public static int calc(char[] c){
//        int answer=0;
//        for(int i=0;i<c.length;i++){
//            if(!con(c[i]))
//                answer++;
//        }
//        return answer;
//    }

    static void dummy(int flag){
        flag=1;
    }
    static void dummy1(ArrayList<Integer>l){
        l.add(2);
        l.add(2);
        l.add(2);
    }
    public static void main(String[] args) {
//        char[] a = {'v','k','l','i','a'};
//        int ans = calc(a);
//        System.out.println(ans);

//        String s  = "abacdac";
//        HashMap<Character,Integer>m  = new HashMap<>();
//        for(int i=0;i<s.length();i++){
//            char c = s.charAt(i);
//
////            m.put(c,m.getOrDefault(c,0)+1);
//
//            if(m.containsKey(c))
//                m.put(c,m.get(c)+1);
//            else
//                m.put(c,1);
//
//        }
//        String res = "";
//        Iterator it = m.entrySet().iterator();
//        while(it.hasNext()){
//            Map.Entry kv = (Map.Entry) it.next();
//            char k =(char) kv.getKey();
//            int v = (int)kv.getValue();
//            if(v>1)
//                res+=k;
//            System.out.println(k+" "+v);
//        }
//        System.out.println(res);
//
//        System.out.println(m);


//        int[] a = {3,4,5,5,6,8,8,9,10,10};
//        int n = 10;
//        int k = 5;
//        Arrays.sort(a);
//        int ans = a[n-1]-a[0];
//        for(int i=0;i<n-1;i++){
//            int max = Math.max(a[i]+k,a[n-1]-k);
//            int min = Math.min(a[0]+k,a[i+1]-k);
//            if(min<0) continue;
//            System.out.println("max:"+max+" "+"min:"+min);
//            int m = max - min;
//            ans = Math.min(ans,m);
//            System.out.println(ans);
//        }
//        System.out.println("final:"+ans);
//
//
//        System.out.println("-------------------------");
//
//        ans = a[n-1]-a[0];
//        for(int i=1;i<n;i++){
//            int max = Math.max(a[i-1]+k,a[n-1]-k);
//            int min = Math.min(a[0]+k,a[i]-k);
//            if(min<0) continue;
//            System.out.println("max:"+max+" "+"min:"+min);
//            int m = max - min;
//            ans = Math.min(ans,m);
//            System.out.println(ans);
//        }
//        System.out.println("final:"+ans);

        Scanner sc = new Scanner(System.in);
//        long k = sc.nextLong();

        PriorityQueue<Integer>q = new PriorityQueue<>();
        q.add(3);
        System.out.println(q);
        for(int i=0;i<2;i++){
            q.add(sc.nextInt());
            System.out.println(q);
        }
    }
}
