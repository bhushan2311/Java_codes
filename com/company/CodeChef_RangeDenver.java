package com.company;

import java.lang.*;
import java.util.*;
import java.io.*;

public class CodeChef_RangeDenver {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            int count=0;
            while(t!=0)
            {
                int l,r,d;
                l=Integer.parseInt(br.readLine());
                r= Integer.parseInt(br.readLine());
                d = r-l+1;
                for(int i=l;i<=r;i++)
                {
                    if(i<d)
                        continue;
                    else if (i==d)
                        count++;
                    else if (i>10 && i%d==0)
                        count++;
                }
                System.out.println(count);
                t--;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
