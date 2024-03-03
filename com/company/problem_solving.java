package com.company;

//import java.io.*;
//import java.util.*;
//import java.util.LinkedList;
//import java.util.Scanner;
//import java.util.stream.Stream;
//
//import static java.util.stream.Collectors.toList;

//class Result {
//
//    /*
//     * Complete the 'compareTriplets' function below.
//     *
//     * The function is expected to return an INTEGER_ARRAY.
//     * The function accepts following parameters:
//     *  1. INTEGER_ARRAY a
//     *  2. INTEGER_ARRAY b
//     */
//
//    public static int[] compareTriplets(int a[],int b[]) {
//        // Write your code here
//        int pa=0,pb=0;
//        for(int i=0;i<a.length;i++){
//            if(a[i]>b[i])
//                pa++;
//            else if(a[i]<b[i])
//                pb++;
//            else
//                continue;
//        }
//        // int res[] = {pa,pb};
//        return new int[] {pa,pb};
//    }
//
//}
//
//public class problem_solving {
//    public static void main(String[] args) {
//        Result r = new Result();
//        Scanner sc = new Scanner(System.in);
//        int a[] = new int[3];
//        int b[] = new int[3];
//        for(int i=0;i<a.length;i++)
//        {
//            a[i]=sc.nextInt();
//        }
//        for(int i=0;i<b.length;i++)
//        {
//            b[i]=sc.nextInt();
//        }
//        int s[] = r.compareTriplets(a,b);
//        System.out.print(Arrays.toString(s));
//    }
//}
// ------------------------ Pattern ----------------------------------

//class Result
//{
////    public void staircase(int n)
////    {
////        for(int i=1;i<=n;i++)
////        {
////            for(int j=1;j<=i;j++) {
////                System.out.print("*");
////            }
////            System.out.println();
////        }
//        public void staircase(int n)
//        {
//            int n1=n;
//            for(int i=1;i<=n;i++)
//            {
//                for(int j=1;j<=n1-1;j++)
//                    System.out.print(" ");
//                for(int k=1;k<=i;k++)
//                    System.out.print("#");
//                System.out.println();
//                n1--;
//            }
//        }
//}
//public class problem_solving {
//        public static void main (String[]args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//            int n = Integer.parseInt(bufferedReader.readLine().trim());
//            Result r = new Result();
//            r.staircase(n);
//            bufferedReader.close();
//        }
//    }
//-------------------------- Apple Oranges ---------------------------

//class Result {
//
//    /*
//     * Complete the 'countApplesAndOranges' function below.
//     *
//     * The function accepts following parameters:
//     *  1. INTEGER s
//     *  2. INTEGER t
//     *  3. INTEGER a
//     *  4. INTEGER b
//     *  5. INTEGER_ARRAY apples
//     *  6. INTEGER_ARRAY oranges
//     */
//
//    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
//        // Write your code here
////         ArrayList<Integer> ap = new ArrayList<>();
////         ArrayList<Integer> or = new ArrayList<>();
//        int n1,n2;
//        n1=0; n2=0;
//        for(Integer o:apples){
//            int c=o+a;
//            if(c>=s && c<=t)
//                n1++;
////             ap.add(o+a);
//        }
//        for(Integer o:oranges){
//            int c=o+b;
//            if(c>=s && c<=t)
//                n2++;
////             or.add(o+b);
//        }
////         for(int i=0;i<ap.size();i++)
////         {
////             if(ap.get(i)>=s && ap.get(i)<=t)
////                 n1++;
////         }
////         for(int i=0;i<or.size();i++)
////         {
////             if(or.get(i)>=s && or.get(i)<=t)
////                 n2++;
////         }
//        System.out.println(n1);
//        System.out.println(n2);
//
//
//    }
//
//}
//
//public class problem_solving {
//    public static void main(String[] args) throws IOException{
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int s = Integer.parseInt(firstMultipleInput[0]);
//
//        int t = Integer.parseInt(firstMultipleInput[1]);
//
//        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int a = Integer.parseInt(secondMultipleInput[0]);
//
//        int b = Integer.parseInt(secondMultipleInput[1]);
//
//        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int m = Integer.parseInt(thirdMultipleInput[0]);
//
//        int n = Integer.parseInt(thirdMultipleInput[1]);
//
//        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        Result.countApplesAndOranges(s, t, a, b, apples, oranges);
//
//        bufferedReader.close();
//    }
//}

// --------------------- Cut the Sticks --------------------------------
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//class Result {
//
//    /*
//     * Complete the 'cutTheSticks' function below.
//     *
//     * The function is expected to return an INTEGER_ARRAY.
//     * The function accepts INTEGER_ARRAY arr as parameter.
//     */
//
//    public static List<Integer> cutTheSticks(List<Integer> arr) {
//        // Write your code here
//        List<Integer> l1 = new ArrayList<>();
//
//        Iterator<Integer>it=null;
//
//        it=arr.listIterator();
//
//        while(it.hasNext())
//        {
//            int count=0;
//            int min = Collections.min(arr);
//            for(int i=0;i<arr.size();i++)
//            {
//                int v=arr.get(i)-min;
//                arr.set(i,v);
//                count++;
//            }
//            l1.add(count);
//            arr.removeAll(Collections.singleton(0));
//        }
//        return l1;
//    }
//
//}
//
//public class problem_solving {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        List<Integer> result = Result.cutTheSticks(arr);
//
//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
// ----------------------- plus minus --------------------------
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//class Result {
//
//    /*
//     * Complete the 'plusMinus' function below.
//     *
//     * The function accepts INTEGER_ARRAY arr as parameter.
//     */
//
//    public static void plusMinus(List<Integer> arr) {
//        // Write your code here
//        int p=0; int n=0; int z=0;
//        for(Integer i:arr)
//        {
//            if(i>0)
//                p++;
//            else if(i<0)
//                n--;
//            else
//                z++;
//        }
//        System.out.format("%.6f",(double)p/arr.size());
//        System.out.println();
//        System.out.format("%.6f",(double)n/arr.size());
//        System.out.println();
//        System.out.format("%.6f",(double)z/arr.size());
//    }
//
//}
//
//public class problem_solving {
//    public static void main(String[] args) {
////        Result r = new Result();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        List<Integer> l = new ArrayList<>();
//        for(int i=0;i<n;i++)
//        {
//            int v = sc.nextInt();
//            l.add(v);
//        }
//        Result.plusMinus(l);
//        sc.close();
//    }
//}

// ----------------------- bill division -------------
import java.util.*;

//class Result {
//
//    /*
//     * Complete the 'bonAppetit' function below.
//     *
//     * The function accepts following parameters:
//     *  1. INTEGER_ARRAY bill
//     *  2. INTEGER k
//     *  3. INTEGER b
//     */
//
//    public static void bonAppetit(List<Integer> bill, int k, int b) {
//        // Write your code here
//        int sum=0;
//        for(Integer i:bill)
//        {
//            if(bill.get(k) != i)
//                sum = sum + i;
//        }
//
//        int a=sum/2;
////
////        if(b==a)
////            System.out.println("Bon Appetit");
////        else
////            System.out.println(b-a);
//        System.out.println(b==a?"Bon Appetit":b-a);
//    }
//
//}
//
//public class problem_solving {
//    public static void main(String[] args) {
//        List<Integer> l = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        int n,b,k;
//        n=sc.nextInt();
//        k=sc.nextInt();
//        for(int i=0;i<n;i++){
//            int v=sc.nextInt();
//            l.add(v);
//        }
//        b= sc.nextInt();
//        Result.bonAppetit(l,k,b);
//    }
//}
//         ---------------

//class Result {
//
//    /*
//     * Complete the 'migratoryBirds' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts INTEGER_ARRAY arr as parameter.
//     */
//
//    public static void migratoryBirds(List<Integer> arr) {
//        // Write your code here
//        List<Integer>l=new ArrayList<>();
//        for(int i=0;i<arr.size();i++)
//        {
//            if(i==0)
//                l.add(Collections.frequency(arr,arr.get(i)));
//           else if(arr.subList(0,i).contains(arr.get(i)))
//                continue;
//            else
//                l.add(Collections.frequency(arr,arr.get(i)));
//        }
//        System.out.println(l);
//
//
//    }
//
//}
//
//public class problem_solving{
//    public static void main(String[] args){
//       Scanner sc = new Scanner(System.in);
//        List<Integer>l=new ArrayList<>();
//        int n = sc.nextInt();
//        for(int i=0;i<n;i++)
//        {
//            int v=sc.nextInt();
//            l.add(v);
//        }
//        Result.migratoryBirds(l);
//    }
//}

// --------------- HR Append and delete nahi aya --------------------
//import java.lang.Math;
//public class problem_solving {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s,t;
//        s = sc.next();
//        t = sc.next();
//        int k = sc.nextInt();
//        int count = 0;
//
//        int max = Math.max(s.length(),t.length());
//        int min = Math.min(s.length(),t.length());
//        count = count+(max-min);
//
//        for(int i=0;i<t.length();i++)
//        {
//            if(s.charAt(i) != t.charAt(i)){
//                char new1 = t.charAt(i);
//                char old1 = s.charAt(i);
//                s.replace(old1,new1);
//                count+=2;
//            }
//        }
//        System.out.println(count<=k? "Yes":"No");
//    }
//}
// ---------------------PDF Viewer ----------------------

//public class problem_solving {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        HashMap<Object,Integer> m = new HashMap<>();
//        for(char c='a'; c<='z' ; c++)
//        {
//            int i = sc.nextInt();
//            m.put(c,i);
//        }
//
//        String s = sc.next();
//        ArrayList<Object>l2 = new ArrayList<>();
//        for(int i=0;i<s.length();i++)
//        {
//            l2.add(s.charAt(i));
//        }
//
//        ArrayList<Integer>l3 = new ArrayList<>();
//        for(int i=0;i<s.length();i++)
//        {
//            Object o = l2.get(i);
//            l3.add(m.get(o));
//        }
//
//        int max_height = Collections.max(l3);
//        System.out.println(l3.size() * max_height);
//    }
//}
//--------------------- Halloween Sale -------------------------------

//public class problem_solving {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int p,d,m,s;
//        p = sc.nextInt();
//        d = sc.nextInt();
//        m = sc.nextInt();
//        s = sc.nextInt();

//        List<Integer>l1 = new ArrayList<>();
//        int sum = 0;
//        while(p>=m){
//            l1.add(p);
//            p=p-d;
//        }
//
//        int toys =0;
//        for(int i=0;i<l1.size();i++){
//            sum+=l1.get(i);
//        }
//
//        if(sum==s)
//            toys = l1.size();
//        else if(sum<s)
//        {
//            while(sum < s)
//            {
//                sum=0;
//                p = p + (m-p);
//                l1.add(p);
//                for(Integer i:l1){
//                    sum+=i;
//                }
//            }
//            toys = l1.size()-1;
//        }
//        else{
//            sum=0;
//            for(int i=0;i<l1.size();i++){
//                sum+=l1.get(i);
//                if(sum>s) {
//                    toys=i;
//                    break;
//                }
//            }
//        }
//        System.out.println(toys);
        //------ OR -------
//        int game = 0;
//        while(s>=p){
//            game++;
//            s=s-p;
//            p = Math.max(p-d,m);
//        }
//        System.out.println(game);
//
//      ----------------- Service Lane -----------------------
//        public class problem_solving {
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//                int n = sc.nextInt();
//                int t = sc.nextInt();
//                ArrayList<Integer>l = new ArrayList<>();
//                for(int i=0;i<n;i++){
//                    int v = sc.nextInt();
//                    l.add(v);
//                }
//                while(t-->0)
//                {
//                    int a = sc.nextInt();
//                    int b = sc.nextInt();
//                    System.out.println(Collections.min(l.subList(a,b+1)));
//                }
//            }
//        }
// ----------------- Diagonal difference ----------------------
//public class problem_solving {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] a = new int[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++)
//                System.out.print(a[i][j]+" ");
//            System.out.println();
//        }
//        int d1=0,d2=0; int n1 = n;
//        for(int i=0;i<n;i++)
//        {
//            n1 = n1-1;
//
//            d1 = d1 + a[i][i];
//
//            d2 = d2 + a[i][n1];
//        }
//
//        System.out.println(Math.abs(d1-d2));
//    }
//}
//--------------------
//// wclwfoznbmyycxvaxagjhtexdkwjqhlojykopldsxesbbnezqmixfpujbssrbfhlgubvfhpfliimvmnny
//public class problem_solving {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = "wclwfoznbmyycxvaxagjhtexdkwjqhlojykopldsxesbbnezqmixfpujbssrbfhlgubvfhpfliimvmnny";
//
//        String s1 = s.replaceAll("\\s","");
//        int row1 = (int)Math.floor(Math.sqrt(s1.length()));
//        int column1 = (int)Math.ceil(Math.sqrt(s1.length()));
//
//        int row,column;
//        if(row1*column1>=s1.length()){
//            row = row1; column=column1;
//        }
//        else{
//            int max = Math.max(row1,column1);
//            row=column=max;
//        }
//
//        Object[][] a = new Object[row][column];
//        int count = 0;
//        outerloop:
//        for(int i=0;i<row;i++){
//            for(int j=0;j<column;j++){
//                if(count<s1.length())
//                {
//                    a[i][j] = s1.charAt(count);
//                    count++;
//                }
//                else
//                    break outerloop;
//            }
//        }
//        for(int i=0;i<row;i++) {
//            for (int j = 0; j < column; j++) {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
//        String r="";
//        for(int i=0;i<column;i++)
//        {
//            for(int j=0;j<row;j++){
//                if(a[j][i]==null)
//                    r = r+"1";
//                else
//                    r = r+a[j][i];
//            }
//            r = r+" ";
//        }
//        String res = r.replaceAll("1","");
//        System.out.println(res);
//
////        String s1 = s.replaceAll("\\s","");
////        System.out.println(s1);
////        System.out.println(s1.length());
////        double sqrt = Math.sqrt(s1.length());
////        System.out.println(sqrt);
////        int row1 = (int)Math.floor(sqrt);
////        int column1 = (int)Math.ceil(sqrt);
////        System.out.println(row1+" "+column1);
////
////        int row=0,column=0;
////        if(row1*column1>=s1.length()) {
////            row = row1;
////            column=column1;
////        }
////        else{
////            int max = Math.max(row1,column1);
////            row=column=max;
////        }
////
////        String[][] a = new String[row][column];
////        int count=0;
////        outerloop:
////        for(int i=0;i<row;i++){
////            for(int j=0;j<column;j++){
////                if(count<s1.length()) {
////                    a[i][j] = String.valueOf(s1.charAt(count));
////                    count++;
////                }
////                else
////                    break outerloop;
////            }
////        }
////        for(int i=0;i<row;i++){
////            for(int j=0;j<column;j++){
////                System.out.print(a[i][j]+" ");
////            }
////            System.out.println();
////        }
////
////        for(int i=0;i<column;i++)
////        {
////            for(int j=0;j<row;j++)
////                System.out.print(a[j][i]);
////            System.out.print(" ");
////        }
//    }
//}
////if man was meant to stay on ground god would have given us roots

// ------------------ SubArray division---------------------
//public class problem_solving {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<Integer>l = new ArrayList<>();
//        for(int i=0;i<n;i++)
//        {
//            int v = sc.nextInt();
//            l.add(v);
//        }
//        int d = sc.nextInt(); int m = sc.nextInt();
//        int count=0; int m1 = m-1;
//        for(int i=0;i<l.size();i++)
//        {
//            int sum=0;
//            if(i+m1<=l.size()-1)
//                {
//                    for (int j = i; j <= i + m1; j++) {
//                        sum = sum + l.get(j);
//                    }
//                    if(sum==d)
//                        count++;
//                }
//        }
//
//        System.out.println(count);
//    }
//}
// ------------------------ FlatLand Space Station ---------------------------
//public class problem_solving {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();   // no. of space stations
//
//        ArrayList<Integer>l = new ArrayList<>();  // list of space stations
//        for(int i=0;i<m;i++){
//            int v = sc.nextInt();
//            l.add(v);
//        }
////        System.out.println("l: "+l);
//        ArrayList<Integer>l1 = new ArrayList<>();  // list of cities
//        for(int i=0;i<n;i++){
//            l1.add(i);
//        }
////        System.out.println("l1: "+l1);
//        ArrayList<Integer>res = new ArrayList<>();
//
//        for(int i=0;i<n;i++)  //loop for cities
//        {
//            ArrayList<Integer>mini=new ArrayList<>();
//            for(int j=0;j<m;j++)  // loop for space stations
//            {
//                if(l.get(j)==l1.get(i))
//                    mini.add(0);
//                else{
//                    mini.add(Math.abs(l.get(j)-l1.get(i)));
//                }
//            }
//            res.add(Collections.min(mini));
//        }
//        System.out.println(Collections.max(res));
//        // ~~~~~~~~~~hr~~~~~~~~~
////        ArrayList<Integer>l1 = new ArrayList<>();  // list of cities
////        for(int i=0;i<n;i++){
////            l1.add(i);
////        }
//////        System.out.println("l1: "+l1);
////        ArrayList<Integer>res = new ArrayList<>();
////
////        for(int i=0;i<n;i++)  //loop for cities
////        {
////            ArrayList<Integer>mini=new ArrayList<>();
////            for(int j=0;j<c.length;j++)  // loop for space stations
////            {
////                if(c[j]==l1.get(i))
////                    mini.add(0);
////                else{
////                    mini.add(Math.abs(c[j]-l1.get(i)));
////                }
////            }
////            res.add(Collections.min(mini));
////        }
////        // System.out.println(Collections.max(res));
////        return Collections.max(res);
//
//    }
//}
//--------------------- Migratory Bird -----------------------------
//public class problem_solving {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<Integer>l = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            int v = sc.nextInt();
//            l.add(v);
//        }
//
//        HashMap<Integer,Integer>m = new HashMap<>();
//        for(int i=0;i<n;i++){
//            if(m.containsKey(l.get(i))){
//                m.put(l.get(i),m.get(l.get(i))+1);
//            }
//            else {
//                m.put(l.get(i),1);
//            }
//        }
//
//        Iterator it = m.entrySet().iterator();
//        int max = 0;
//        while(it.hasNext()){
//            Map.Entry e = (Map.Entry)it.next();
//            int count = (int) e.getValue();
//            if(count>max){
//                max = count;
//            }
//        }
////        System.out.println(max);
//        Iterator i = m.entrySet().iterator();
//        ArrayList<Integer>l1 = new ArrayList<>();
//        while(i.hasNext()){
//            Map.Entry e = (Map.Entry) i.next();
////            System.out.println(" "+e.getValue());
//            if((int)e.getValue()==max)
//                l1.add((int)e.getKey());
//        }
//        System.out.println(Collections.min(l1));
//    }
//}
// ------------------------ Picking Numbers -------------------------
//public class problem_solving {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<Integer>l = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            int v = sc.nextInt();
//            l.add(v);
//        }
//        ArrayList<Integer>l2 = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            int num = l.get(i);
//            int t1 = Collections.frequency(l,num) + Collections.frequency(l,num+1);
//            int t2 = Collections.frequency(l,num) + Collections.frequency(l,num-1);
//            l2.add(t1);
//            l2.add(t2);
//        }
////        System.out.println(l2);
//        System.out.println(Collections.max(l2));
//    }
//}
// -------------------- Counting Valleys(Pending) ------------------
//public class problem_solving {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String s = sc.next();
//        ArrayList<Character>l = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            l.add(s.charAt(i));
//        }
//        int count=0;
//        for(int i=1;i<n;i++){
//            if(l.get(i)=='D')
//            {
//                int u = Collections.frequency(l.subList(0, i + 1), 'U');
//                int d = Collections.frequency(l.subList(0, i + 1), 'D');
////            System.out.println(u+" "+d);
//                if (u == d) {
//                    count = u;
//                    break;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}
// ----------------------------- Append And Delete(Pending) -------------------------------
//public class problem_solving {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        String t = sc.next();
//        int k = sc.nextInt();
//
//        int cnt = 0; int count = 0;
//        if(s.equals(t))
//            System.out.println("Yes");
//        else{
//            int sl = s.length();
//            int tl = t.length();
////            System.out.println("sl:"+sl+" tl:"+tl);
//            int min = Math.min(sl,tl);
////            System.out.println("min:"+min);
//            for(int i=0;i<min;i++){
//                if(t.charAt(i)!=s.charAt(i)){
//                    cnt = sl-i + tl-i;
//                    break;
//                }
//                else
//                   count++;
//            }
////            System.out.println("count:"+count);
//            if(count==min){
//                int ans = Math.max(sl,tl) - min;
//                cnt = ans;
//            }
//            System.out.println(cnt<=k? "Yes":"No");
//        }
//    }
//}
//---------------------- Repeated String ----------------------
//public class problem_solving {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        long n = sc.nextLong();
//        ArrayList<Character>l = new ArrayList<>();
//        for(int i=0;i<s.length();i++){
//            l.add(s.charAt(i));
//        }
//        int a = Collections.frequency(l,'a');
//
//        double d = (double) n/s.length();
//        double c = Math.ceil(d);
//        System.out.println((long)c); // ------
//        long total_a = a * (long)c;
//        System.out.println(total_a); // ----------
//        long total_len = (long)c * s.length();
//        System.out.println(total_len); // ---------
//        long remain = total_len - n;
//        System.out.println(remain);  // -------
//        int r_a = 0;
//        int i = s.length()-1;
//        int j = 0;
//        while(j!=remain){
//            if(s.charAt(i)=='a')
//                r_a++;
//            j++;
//            i--;
//        }
//        long ans = total_a - r_a;
//        System.out.println(ans);
//    }
//}
// ---------------------------Lisa's Workbook ----------------------------------------
//public class problem_solving {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[]a = new int[n];
//        for(int i=0;i<n;i++){
//            a[i] = sc.nextInt();
//        }
//        int count=0; int pg = 1; int flag=1;
//        for(int i=0;i<n;i++){
//            int k1 = 1;
//            for(int j=1;j<=a[i];j++){
//                flag=1;
//                if(k1%k!=0){
//                    if(pg==j)
//                        count++;
//                }
//                else{
//                    if(pg==j)
//                        count++;
//                    pg++;
//                    flag=0;
//                }
//                k1++;
//            }
//            if(flag!=0) pg++;
//        }
//        System.out.println(count);
//    }
//}
public class problem_solving {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                String s = sc.next();
                int i = 0;
                int j = n-1;
                int count=0;
                while(i<j){
                    if(s.charAt(i)!=s.charAt(j)) {
                        System.out.println("i:"+i+" j:"+j);
                        count++;
                    }
                    i++;
                    j--;
                }
                System.out.println("Outside loop");
                System.out.println("i:"+i+" j:"+j);
                System.out.println(count+" "+k);
                if(k%2==1){
                    if(count<=k)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }

                else
                {
                    if ((k % 2 == 0 && count % 2 == 0 || k % 2 == 1 && count % 2 == 1) && count <= k)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
            }
            }  catch(Exception e){
                return;
            }

    }
}