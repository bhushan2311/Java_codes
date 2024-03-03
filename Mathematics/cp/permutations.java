package Mathematics.cp;

import java.util.Scanner;


/*
    n*(n-1)/2   also for permutation / combination
*/

public class permutations {
    static int nCr(int n, int r)
    {
        return fact(n) / (fact(r) *
                fact(n - r));
    }

    // Returns factorial of n
    static int fact(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int ans = nCr(n,2);
        System.out.println(ans);
    }
}
