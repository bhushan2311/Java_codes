package DSA;

/*
 The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct
 position in the sorted part.

 note - consider unsorted array from index 1
*/
public class Insertion_Sort {
    public static void main(String[] args) {
        int[] a = {2,1,6,3,9,4};
        int n = a.length;
        for(int i=1;i<n;i++){
            int temp = a[i];
            int j = i-1;
            while(j>=0 && a[j]>temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }

        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
