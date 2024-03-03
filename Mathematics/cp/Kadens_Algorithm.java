package Mathematics.cp;


// --------------- To find the maximum sum of sub-array ------------------

// Time Complexity = O(N)
// Space Complexity = O(1)

public class Kadens_Algorithm {
    public static void main(String[] args) {
        int[] a = {2, -1, 3, 0, -6, 10, -1};   // -> resultant subArray is {4,6,-3,4}
        int max_sum = 0;
        int current_sum = 0;
        for(int i=0;i<a.length;i++){
            current_sum+=a[i];
            if(current_sum>max_sum)
            {
                max_sum = current_sum;
            }
            if(current_sum<0)
            {
                current_sum = 0;
            }
        }
        System.out.println(max_sum);
    }
}

/*
    * Brute-force(Naive) Solution is to take every possible sub-array sum and check which sum is greater.
        T -> O(N^2) , S -> O(1)

    * Here order matters so, we can't use sorting technique.

    * Can't use any other algo that requires space.

  */