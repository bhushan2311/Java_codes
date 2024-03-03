package Mathematics.cp;

/*
    This algorithm is used to find if the element appears more than N/2 times in the array. (N-> size of array)

    Time: O(n)
    Space: O(1)
*/

public class MooresVoting_algo {
    public static void main(String[] args) {
        int[] a = {1,2,2,5,2,5,2};
        int n = a.length;
        int elem = a[0],freq=1;
        for(int i=1;i<n;i++){
            if(elem==a[i]) freq++;
            else {
                if(freq>0) freq--;
                else{
                    elem = a[i];
                    freq=1;
                }
            }
        }
        freq=0;
        for(int i=0;i<n;i++){
            if(elem==a[i])
                freq++;
        }
        // Printing element if it occurs more than n/2 times in array else -1
        System.out.println(freq>(n/2)? elem:-1);
    }
}
