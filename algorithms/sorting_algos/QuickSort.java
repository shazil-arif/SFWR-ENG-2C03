class QuickSort{
    public static void main(String[] args){
        int[] keys = {45,12,54,22,90,24,90,100,58,34};
        System.out.println("Unsorted");
        PrintArray.print_arr(keys);
        qsort(keys,0,keys.length-1);
        System.out.println("----------------");
        System.out.println("Sorted");
        PrintArray.print_arr(keys);

    }
    public static void qsort(int keys[], int lo, int hi){

        int i = lo;
        int j = hi;
        int pivot = lo + (hi-lo)/2;

        while(i<=j){
            while(keys[i] <= keys[pivot]) i++;
            while(keys[j] > keys[pivot]) j--;
            if(i<=j){
                Swap.swap(keys, i, j);
                i++;
                j--;
            }
        }
        qsort(keys,lo,pivot);
        qsort(keys, pivot + 1, hi);
    }
}