package Mathematics.cp;

public class nCr {

    static int nCr(int n, int r)
    {
        return fact(n) / (fact(r) * fact(n - r));
    }
    //Method to calculate the factorial of the number
    static int fact(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }

    public static void main(String[] args) {

    }
}
