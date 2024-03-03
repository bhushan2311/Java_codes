package Mathematics.cp;


/*            --- Kernighan's algorithm --
       -> To calculate set bits in a binary number
*/
public class Kernighans_Algorithm {
    public static void main(String[] args) {

        int n1 = 52;

//        int n2 = ~n1+1;    // ~n1+1 is 2's complement of n1 or n2=-n1 as -n1 is 2's complement of n1 as well

//        String res = Integer.toBinaryString(n1 & n2);
//        System.out.println(res);        // it results rightmost set bit

        String n1_binary = Integer.toBinaryString(n1);
        System.out.println(n1_binary);
        int count=0;
        while(n1!=0){
            int rmsb = n1 & -n1;     // r.m.s.b = right most set bit
            n1-=rmsb;
            count++;
        }
        System.out.println(count);
    }
}
