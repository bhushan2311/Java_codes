package DSA;

public class Quick_Sort {

    public static int partition(int[] a,int l, int r){
        int pivot = a[l];               // considering first element as pivot
        int i=l,j=r;
        while(i<j){
            while (i<a.length && pivot>=a[i]) {
                i++;
            }
            while(pivot<a[j]){
                j--;
            }
            if(i<j){
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp = a[j];
        a[j]=a[l];
        a[l]=temp;

        return j;
    }

    public static void QuickSort(int[]a,int l,int r){
        if(l<r){
            int pivot = partition(a,l,r);
            QuickSort(a,l,pivot-1);
            QuickSort(a,pivot+1,r);
        }
    }
    public static void main(String[] args) {
        int[] a = {9,1,6,3,2,4};
        int n = a.length;
        int l = 0;
        int r = n-1;
        QuickSort(a,l,r);
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
    }
}
