package com.company;

import java.util.HashMap;
import java.util.Map;

// ---- 1. Key must be unique, if we try to add duplicate key then it will replace original key -----

public class HashMap_basics {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"harry");
        map.put(102,"jerry");
        map.put(103,"wanda");
        map.put(104,"lily");
        map.put(105,"nancy");

//        System.out.println(map);
//        OR
//        System.out.println(map.entrySet());
//
//        for(Map.Entry a: map.entrySet())
//        {
//            System.out.println(a);
//        }
//        OR
//       map.entrySet().forEach(System.out::println);

//        System.out.println(map.containsKey(103));  // returns true if present else returns false
//        System.out.println(map.containsValue("lily"));

//        System.out.println(map.get(101));          //returns 'value' of provided 'key'

        // as the name suggest, it put the key if its not present in hashmap otherwise the key replace with original one
//        map.putIfAbsent(106,"lucas");
//        System.out.println(map);

//        System.out.println(map.remove(105));
//        System.out.println(map);

//        map.clear();   // clear the hashmap
//        System.out.println(map);

//        System.out.println(map.keySet());   // returns set of keys



    }
}
