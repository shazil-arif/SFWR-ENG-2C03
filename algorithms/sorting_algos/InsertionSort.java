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
        for(int i = 1; i < keys.length; i++){
            for(int j = i; j > 0 && keys[j] < keys[j-1]; j--){
                Swap.swap(keys,j,j-1);
            }
        }
        

    }
}