class SelectionSort{
    public static void main(String[] args){
        //main function for testing only

        /* test recursive version*/
        int[] keys = {45,12,54,22,90,24,90,100,58,34};
        System.out.println("Unsorted");
        PrintArray.print_arr(keys);
        selection_sort_recursive(0,keys);
        System.out.println("Sorted");
        PrintArray.print_arr(keys);

        /*itertive version*/
        int[] keys_two = {45,12,54,22,90,24,90,100,58,34};
        System.out.println("Unsorted");
        PrintArray.print_arr(keys_two);
        selection_sort(keys_two);
        System.out.println("Sorted");
        PrintArray.print_arr(keys_two);
    }
    /*  iterative selection sort
    @param keys The values to be sorted */
    public static void selection_sort(int keys[]){
        int min_index;
        for(int pointer = 0; pointer < keys.length; pointer++){
            min_index = pointer;
            //start from pointer + 1 because first position is already in min_index
            for(int i = pointer + 1; i < keys.length; i++){
                if(keys[i] < keys[min_index]){
                    min_index = i;
                }
            }
            /* check if first element of sub array was already the minimum to minimize number of swaps */
            if(min_index != pointer){ 
                Swap.swap(keys, min_index, pointer);
            }
        }
    }
    /* recursive implementation of selection sort
    @param pointer The starting index of the sub array to sort
    @param keys int values to sort */
    public static void selection_sort_recursive(int pointer,int keys[]){
        if(pointer >= keys.length) return;
        int min_index = pointer;
        for(int i = pointer; i < keys.length; i++){
            if(keys[i] < keys[min_index] ){
                min_index = i;
            }
        }
        Swap.swap(keys, min_index, pointer);
        selection_sort_recursive(pointer + 1, keys);
    }
}