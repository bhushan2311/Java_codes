package Mathematics.cp;

public class PowerOf2 {
    static boolean powerOf2(int n){
        return (n & n-1)==0? true:false;
    }
    // also
    static boolean isPowerOfTwo(long n)
    {
        if(n==0)
            return false;

        return (Math.ceil((Math.log(n) / Math.log(2)))) ==
                (Math.floor(((Math.log(n) / Math.log(2)))));
    }

    public static void main(String[] args) {
        int n=64;
        boolean ans = powerOf2(n);
        System.out.println(ans);
    }
}
