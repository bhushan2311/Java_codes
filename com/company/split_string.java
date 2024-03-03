package com.company;

import java.util.Scanner;

public class split_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "bhushan,ambhore@is! good -?boy+";
        String[] a = s.split("[ ?!,@+-]+");
        for (String w:a) {
            System.out.print(w+" ");
        }
        System.out.println("\n"+s);

    }
}
