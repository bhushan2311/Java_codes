package DSA;

/*
The Merge Sort algorithm is a sorting algorithm that is based on the Divide and Conquer paradigm. In this algorithm,
the array is initially divided into two equal halves and then they are combined in a sorted manner.

Merge Sort Working Process:
    Think of it as a recursive algorithm continuously splits the array in half until it cannot be further divided.
    This means that if the array becomes empty or has only one element left, the dividing will stop, i.e. it is the base case to stop the recursion.
    If the array has multiple elements, split the array into halves and recursively invoke the merge sort on each of the halves.
    Finally, when both halves are sorted, the merge operation is applied. Merge operation is the process of
    taking two smaller sorted arrays and combining them to eventually make a larger one.
*/


public class Merge_Sort {

    public static void merge(int[] a,int l, int mid,int r){
        int[] b = new int[a.length];
        int i=l,j=mid+1; int k = l;
        while(i<=mid && j<=r){
            if(a[i]<a[j]){
                b[k]=a[i];
                i++;
            }else{
                b[k] = a[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=r){
                b[k] = a[j];
                k++;j++;
            }
        }
        else{
            while(i<=mid){
                b[k] = a[i];
                k++;i++;
            }
        }

        for(k=l;k<=r;k++)
            a[k] = b[k];

    }
    public static void mergeSort(int[] a,int l,int r){
        if(l<r){                    // to begin with check if the first index of the array is less than last index
            int mid = (l+r)/2;
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,r);
            merge(a,l,mid,r);
        }
    }
    public static void main(String[] args) {
        int[] a = {2,1,6,3,9,4};
        int n = a.length;
        int l = 0, r=n-1;
        mergeSort(a,l,r);
        for(int i:a)
            System.out.print(i+" ");

    }
}
