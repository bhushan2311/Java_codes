package Mathematics.cp;

// Calculate answer in (10^9 + 7 ) modulo

/*
    (a+b) % n = (a%n + b%n) % n;
    (a*b) % n = (a%n * b%n) % n;
    (a-b) % n = (a%n - b%n + n) % n;
*/


public class Modulo_Arithmetics {
    public static void main(String[] args) {

        int n = 1000000007;
        long a = FastPower(3978432,5,n);
        System.out.println(a);

        // ---------------------------

//        int n = 21;
//        long ans = fact(n);
//        System.out.println(ans);
    }

//    static long fact(int n){
//        long f = 1; int m = 47;
//        for(int i=2;i<=n;i++){
////            f = f*i;
//              f = (f%m * i%m) % m;    // can also write (f*i)%m;
//        }
//        return f;
//    }
    // ------------------------------
    static long FastPower(long a, long b, int n){
        long res = 1;
        while(b>0){
            if((b&1)!=0){
//                res = (res%n * a%n) % n;  // better write (res * a%n) bcz res will be always less than n.
                res = (res*a) % n;
            }
//            a = (a%n * a%n) % n ;
            a = (a*a) % n ;
            b = b>>1;
        }
        return res;
    }

//    ------ Without Modulo FastPower ------

//    static long FastPower(long a, long b){
//
//        long res = 1;
//        while(b>0){
//            if((b&1)!=0){
//                res = res * a;
//            }
//            a = a*a ;
//            b = b>>1;
//        }
//        return res;
//    }
}
