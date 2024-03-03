package DSA;

/*
    Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order.
*/

public class Bubble_Sort {
//    public static void swap(int[] a,int s1,int s2){
//        int temp = s1;
//        s1 = s2;
//        s2 = temp;
//    }
    public static void main(String[] args) {
//        int[] a = {2,1,6,3,9,4};
        int[] a = {1,2,3,4,5,6};
        int n = a.length;
        for(int i=0;i<n-1;i++){
            boolean isSorted = true;
            for(int j=0;j<n-i-1;j++){
                if(a[j+1]<a[j]){
                    isSorted = false;
//                    swap(a,a[j],a[j+1]);
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            if(isSorted) {                          // if isSorted remain true then this becomes best case
                System.out.println("Best Case O(n)");
                break;
            }
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
