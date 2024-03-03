package com.company;

import java.util.HashMap;
import java.util.Map;

public class Iterator {
    public static void main(String[] args) {
        int answer = 0;
        int data=578378923;
        //Write your code here
        HashMap<Character,Integer> m = new HashMap<>();
        String s = Integer.toString(data);
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        java.util.Iterator it = m.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry kv = (Map.Entry) it.next();
            int v = (int) kv.getValue();
            if(v>1)
                answer++;
        }
//        return answer;
        System.out.println(answer);
    }
}
