package Mathematics.cp;

import java.util.Scanner;

public class prefix_sum {
    public static void main(String[] args) {
        int[] a = {2,4,12,7,3,8};
        int[] pre_sum = new int[a.length];
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            pre_sum[i] = sum;
        }
        for(int i:pre_sum)
            System.out.print(i+" ");
        System.out.println();
        int q=3;
        while(q-->0){
            Scanner sc = new Scanner(System.in);
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l>0){
                System.out.println(pre_sum[r]-pre_sum[l-1]);
            }
            else System.out.println(pre_sum[r]-pre_sum[l]);
        }
    }
}
