package com.company;

import java.util.Scanner;

public class anagram_count_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a.contains(b));
    }
}
