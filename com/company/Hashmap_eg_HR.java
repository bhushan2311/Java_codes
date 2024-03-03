package com.company;
import java.util.*;

// ----------------------- HackerRank Question -----------------------
//public class Hashmap_eg_HR {
//    public static void main(String[] args) {
//        HashMap<String,Integer> map = new HashMap<>();
//        Scanner sc = new Scanner(System.in);
//
//        boolean isContain = true;
//        int n = sc.nextInt();
//
//        sc.nextLine();
//        for(int i=0;i<n;i++)
//        {
//            String name = sc.nextLine();
//            int no = sc.nextInt();
//            map.put(name,no);
//            sc.nextLine();
//        }
//
//        while(sc.hasNext())
//        {
//            String name = sc.nextLine();
//            if(map.containsKey(name)==isContain)
//                System.out.println(name+"="+map.get(name));
//            else
//                System.out.println("Not found");
//        }
//    }
//}



// -------------- Adding multiple values in single key (IMP) -------------------

class Dept
{
    public int id;
    public String name;
    Dept(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}

public class Hashmap_eg_HR {
    public static void main(String[] args) {
       HashMap<Integer,Dept> m = new HashMap<>();
       Dept d = new Dept(13,"Bhushan Ambhore");
       Dept d1 = new Dept(14,"Divya Deshmukh");

       m.put(101,d);
       m.put(102,d1);

//        System.out.println(m.entrySet());   //  :(

        for(Map.Entry<Integer,Dept> s: m.entrySet())
        {
            int key = s.getKey();
            Dept val = s.getValue();
            System.out.println(key+" " + val.id + " " + val.name);
        }
    }

}