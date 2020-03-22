class InsertionSort{
    public static void main(String[] args){
        
        int[] keys = {0,7,3,4,1};
        System.out.println("Unsorted");
        PrintArray.print_arr(keys);
        insertion_sort(keys);
        System.out.println("-----------------");
        System.out.println("Sorted");
        PrintArray.print_arr(keys);

    }
    public static void insertion_sort(int[] keys){
        /*Intuition:

        Pick an array element.
        compare to its left neighbours, swap if less than. Keep swapping is less than

        Start from index (1) to do comparisons becuase first entry has nothing to its left
        */

        //pointer to element to compare against left neighbours
        for(int i = 1; i < keys.length; i++){
            //starting from element to compare, which is i, keep swapping as long as a left neighbor is smaller than current
            for(int j = i; j > 0 && keys[j] < keys[j-1]; j--){
                Swap.swap(keys,j,j-1);
            }
        }
    }
}