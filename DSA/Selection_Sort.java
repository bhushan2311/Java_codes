package DSA;

/*
    The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from
    unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
    The subarray which is already sorted.
    Remaining subarray which is unsorted.

    In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray
    is picked and moved to the sorted subarray.

    note - consider unsorted array from index 0
*/

public class Selection_Sort {
    public static void main(String[] args) {
        int[] a = {2,1,6,3,9,4};
        int n = a.length;
        for(int i=0;i<n-1;i++){
            int min_ind = i;

            for(int j=i+1;j<n;j++){
                if(a[j]<a[min_ind])
                    min_ind = j;
            }

            if(min_ind!=i){
                int temp = a[min_ind];
                a[min_ind] = a[i];
                a[i] = temp;
            }
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
