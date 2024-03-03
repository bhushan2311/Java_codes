package com.company;

import java.util.*;

public class Strings_CWH {
    public static void main(String[] args) {
//        String name = new String("Harry");
//        OR
        String name = "Harry";
        StringBuilder name1 = new StringBuilder(name);

        name1.setCharAt(2,'o');
//        System.out.println(name1.replace(name1.charAt(2),'o'));
//        System.out.println(name.replace("ar","lp"));
//        System.out.println(name.substring(0,1));

//        int len = name.length();        // returns length of the string

//        String lc = name.toLowerCase();   // returns lowercase string

//        String uc = name.toUpperCase();   // returns uppercase string

//        String name1 = "     Bhushan      ";
//        System.out.println(name1);          // print Bhushan with spaces
//        String name2 = name1.trim();
//        System.out.println(name2);          // print Bhushan without spaces

//        System.out.println(name.substring(1,4) + " " + name.substring(1));     // Print Substring

//        String replace = name.replace('r','p');   // 'Harry' replaces with 'happy' when 'r' replaces with 'p'.
//        String replace = name.replace("arr","kal"); // also replaces substrings
//        System.out.println(replace);

//        System.out.println(name.startsWith("ha"));     // returns false as case sensitive
//        System.out.println(name.startsWith("Ha"));     // returns true
//        System.out.println(name.endsWith("ry"));       // returns true as it ends with 'ry'

//        System.out.println(name.charAt(1));     // returns character at provided index

//        System.out.println(name.indexOf("ry8"));  // returns -1 if match not found
//        System.out.println(name.indexOf('r',3));   // print that index at which r comes first

//        System.out.println(name.lastIndexOf('y'));  // returns its last index
//          System.out.println(name.lastIndexOf('r',2));
//         System.out.println(name.equals("Harry"));   // returns true if string matches with original else false in case sensitive
//        System.out.println(name.equalsIgnoreCase("HaRry"));   // returns true if string matches with original string. it ignore case sensitive

//        System.out.println("hi my name is wanda \"scarlet witch\""); // escape sequence character

//        int flag=0;
//        String name1 = "nnsws";
////        for(int i=0;i<name1.length();i++)
////        {
//////            System.out.println(name1.charAt(i));
//          }

        // ------- Find which alphabet comes first --------

//        String a = "aBt";
//        String b = "aBt";
//
////        System.out.println(a.compareToIgnoreCase(b));
////        System.out.println(b.compareToIgnoreCase(a));
//
//        if(a.compareToIgnoreCase(b)>b.compareToIgnoreCase(a))
//            System.out.println("GREATER");
//        else if(a.compareToIgnoreCase(b)<b.compareToIgnoreCase(a))
//            System.out.println("SMALLER");
//        else
//            System.out.println("EQUAL");



        // ---------------- StringBuffer-------------------------

//        StringBuffer str = new StringBuffer("If man was meant to stay on ground then god would have given us roots");
//        StringBuffer str11 = new StringBuffer("hello me baburao boltoy");
//        String str1 = String.join(",",str,str11);
//        System.out.println(str1);

//       --------------- Removing white spaces from string ----------------
        //--- method-1 by built in function
//        String s = "If man was meant to stay on ground then god would have given us roots";
//        String noSpace = s.replaceAll("\\s","");
//        System.out.println(noSpace);

        //--- method-2 by using StringBuffer class
//        String s = "If man was meant to stay on ground then god would have given us roots";
//        char[] ch = s.toCharArray();
//        StringBuffer sb = new StringBuffer();
//        for(int i=0;i<ch.length;i++)
//        {
//            if(ch[i]!=' ' && ch[i]!='\t')
//                sb.append(ch[i]);
//        }
////        System.out.println(sb);   // -- this is of type string buffer
//        String s1 = sb.toString();  // made StringBuffer to string
//        System.out.println(s1);     //  --- this is of type String

        // ---------------------- lexicographical ------------------------

        // comparing lexicographically strings
//        String s1 = "bhushan";
//        String s2 = "ambhore";
//        System.out.println(s1.compareTo(s2)); // 1 ... b is one time greater than a
//        System.out.println(s2.compareTo(s1)); // -1 ... a is one time smaller than b

        // comparing lexicographically integers
//        int i1 = 431;
//        int i2 = 123;
//        String s1 = Integer.toString(i1);
//        String s2 = Integer.toString(i2);
//
//        System.out.println(s1.compareTo(s2));  // 3 ... 4 is three time greater than 1
//        System.out.println(s2.compareTo(s1));  // -3 ... 1 is three time smaller than 4


        // ------------------- whether the particular char is present in String ----------------
//        String s = "Piyush";
//        // .contains require charSequence and we are providing single character therefore to convert single character into charSequence we added "".
//        System.out.println(s.contains(""+'u'));  // true if present else false.


        // ------------------- Sorting characters in a string ----------------------

//            String s = "bhushan";
//            char[] c = s.toCharArray();
//            Arrays.sort(c);
//
//            //String s1 = new String(c);
//            //OR
//            String s1 = String.valueOf(c);
//            System.out.println(s1);

        //      ----

//        String a = "0123456789";
//        String b = "abcdefghijklmnopqrstuvwxyz";
//        String c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String d = "!@#$%^&*()-+";
//        String pass = "qwrty1";
//        int count = 0;

        // ----------- Replacing char from particular index in String -----------------

        String s1 = "0059";   // req-> 5009
        int i=2;
        char c = s1.charAt(i);
        System.out.println(s1.substring(i + 1));

        s1 = s1.substring(0, i) + '0' + s1.substring(i + 1);

        System.out.println(s1);  // 0009
        System.out.println(s1.substring(0 + 1));

        s1 =  c + s1.substring(0 + 1);
        System.out.println(s1); // 5009
//           ----------   --------   -----------
//        String str = "Geeks Gor Geeks";
//
//        // Get the index
//        int index = 6;
//
//        // Get the character
//        char ch = 'F';
//
//        // Print the original string
//        System.out.println("Original String = " + str);
//
//        str = str.substring(0, index) + ch
//                + str.substring(index + 1);
//
//        // Print the modified string
//        System.out.println("Modified String = " + str);
//        System.out.println(str.substring(3));


//        StringBuilder sb = new StringBuilder("Apple");
//        sb.delete(0,2);
//        System.out.println(sb);
//
//        String st="12";
//        StringBuilder s = new StringBuilder(st);
//        StringBuilder s4 = new StringBuilder("");
//        s.delete(0,2);
//        System.out.println("s:"+s);
//        System.out.println("s4:"+s4);
//        if(s.length()==0)
//            System.out.println("yes");
//        else
//            System.out.println("NOt");
//        System.out.println(s.length());
    }
}
