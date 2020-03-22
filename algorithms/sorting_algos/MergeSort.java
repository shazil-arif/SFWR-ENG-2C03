public class MergeSort{
    private static int aux[];
    public static void sort(int a[]){
        aux = new int[a.length];
        sort(a, 0, a.length-1);
    }
    private static void sort(int a[], int lo, int hi){
        if (hi <= lo) return;
        int mid = (hi+lo)/2;
        sort(a,lo,mid);
        sort(a,lo,mid+1);
        merge(a, lo, mid, hi);

    }
    public static void merge(int a[], int lo, int mid, int hi){
        int i = lo;
        int j = hi;
        for(int k = 0; k<=hi; k++){
            aux[k] = a[k];
        }
        for(int k = 0; k <= hi; k++){
            if (i > mid) a[k] = aux[i++];
        }
        

    }
    public static void main(String[] args){
        int a[] = {3,1,0,9,5,2,6};
        PrintArray.print_arr(a);
        sort(a);
        System.out.println("Sorted");
        PrintArray.print_arr(a);
    }
}