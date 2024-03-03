package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;
public class bufferedStream {

    public static void main(String[] args) throws java.lang.Exception {
        try {
            out = new PrintWriter(new BufferedOutputStream(System.out));
            sc = new FastReader();

            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                long[] a = new long[n];
                long[] b = new long[n];
                for(int i=0;i<n;i++){
                    a[i] = sc.nextLong();
                    b[i]=a[i];
                }

                Arrays.sort(a);
                int flag=0;
                for(int i=0;i<b.length;i++){
                    if(a[i]%2!=b[i]%2){
                        flag=1;
                        break;
                    }
                }
                System.out.println(flag==0? "YES":"NO");
            }
            out.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static FastReader sc;
    public static PrintWriter out;
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer str;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (str == null || !str.hasMoreElements())
            {
                try
                {
                    str = new StringTokenizer(br.readLine());
                }
                catch (IOException  lastMonthOfVacation)
                {
                    lastMonthOfVacation.printStackTrace();
                }
            }
            return str.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException lastMonthOfVacation)
            {
                lastMonthOfVacation.printStackTrace();
            }
            return str;
        }
    }
}
