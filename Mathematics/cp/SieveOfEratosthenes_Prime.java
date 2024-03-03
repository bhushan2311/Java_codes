package Mathematics.cp;

import java.util.Arrays;

// -------- Finding all prime numbers upto given limit ---------

public class SieveOfEratosthenes_Prime {
    public static void main(String[] args) {
        int n = 29;   // to check no. of prime numbers upto 32
        boolean[] a = isPrime(n);
        int count = 0;
        for(int i=0;i<a.length;i++){
            System.out.println(i+" "+a[i]);
            if(a[i])
                count++;
        }
        System.out.println("Total prime numbers are: "+count);
    }

    public static boolean[] isPrime(int n){

        boolean[] a = new boolean[n+1]; // putting 0 at index 1 that is why n+1
        Arrays.fill(a,true);
        a[0] = false;
        a[1] = false;
        for(int i=2;i*i<=n;i++){
            if(a[i]){           // if a[i] == true                  // was not before this condition
                for (int j = i * i; j <= n; j += i) {               // j = i * i instead of j = 2 * i
                    a[j] = false;
                }
            }
        }
        return a;
    }
}
