package com.company;

public class abcdABCD {
    void uppercaseAlphabets()
    {

        // uppercase
        for (int c = 65; c <= 90; ++c) {
            char a = (char) c;
            System.out.print(" " + a);
        }

        System.out.print("\n");
    }
    void lowercaseAlphabets()
    {

        // lowercase
        for (int c = 97; c <= 122; ++c) {
            char a = (char) c;
            System.out.print(" " + a);

        }
    }

    // Driver program
    public static void main(String[] args)
    {
        int ch;
        System.out.println("Uppercase Alphabets");
        abcdABCD ob = new abcdABCD();
        ob.uppercaseAlphabets();

        System.out.println("Lowercase Alphabets ");
        ob.lowercaseAlphabets();
    }
}
