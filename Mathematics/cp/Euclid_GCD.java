package Mathematics.cp;

/*     --- Note ---
    a*b = GCD * LCM
          OR
    LCM = (a*b)/GCD
 */

public class Euclid_GCD {
    public static void main(String[] args) {

        int gcd = GCD(9,6);
        System.out.println(gcd);
    }

    public static int GCD(int a,int b){
        if(b==0)
            return a;
        else
            return GCD(b,a%b);        // recursion
    }
}
