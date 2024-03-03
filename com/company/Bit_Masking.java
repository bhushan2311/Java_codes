package com.company;

public class Bit_Masking {
    public static void main(String[] args) {

        // --------- To find i'th bit in a binary number from right. Perform AND(&) operation ----------
//
//        // find 6th bit of a given binary string
//        int n = 100110101;
//        int mask = (1<<5);       // It becomes 1000000
//        System.out.println("1<<5: "+mask);
//        int s = (n & mask);
//        System.out.println(s==0? 0:1);                 // why 0 for 5th bit despite 1??????

        // --------- To set i'th bit. Perform OR(|) operation ----------------
//        int mask = 1<<3;   // 1 left shift by 3. It becomes 1000. Check:- Integer.toBinaryString(mask)
//        int n = a | Integer.parseInt(Integer.toBinaryString(mask));
//        int n1 = 1010010101 | 1000;
//        System.out.println(n1);




        // --------------------- Right most 'set' bit -----------------------

        int n1 = 6;        // 100110 . Rightmost 1 bit and next to it 0's is the answer which is 10
        int n2 = ~n1+1;     // 2's complement of n1
//        System.out.println(n2);
        System.out.println(Integer.toBinaryString(n1 & n2));  // also work for->(n1 & -n1) . -The 2's complement of n1 is -n1

    }
}
