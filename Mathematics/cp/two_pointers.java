package Mathematics.cp;

import java.util.Arrays;

public class two_pointers {
    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        int t = 26; int flag = 0;
        Arrays.sort(a);
        int i =0,j= a.length-1;
        while(i<j){
            int sum = a[j]+a[i];
            if(sum>t)
                j--;
            else if(sum<t)
                i++;
            else {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println(true+" "+a[i] +" "+ a[j]);
        else System.out.println(false);
    }
}
