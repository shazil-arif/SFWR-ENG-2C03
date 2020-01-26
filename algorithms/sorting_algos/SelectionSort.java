class SelectionSort{
    public static void main(String[] args){
        int[] keys = {45,12,54,22,90,24,90,100,58,34};
        System.out.println("Unsorted");
        PrintArray.print_arr(keys);
        selection_sort_recursive(0,keys);
        System.out.println("Sorted");
        PrintArray.print_arr(keys);
    }
    /* @param keys The values to be sorted */
    public static void selection_sort(int keys[]){
        int pointer = 0;
        int min = keys[0];
        for(int i = 0; i < keys.length; i++){
            if(keys[i] < min){
                min = keys[i];
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
    public static void print_arr(int keys[]){
        
        for(int i = 0; i < keys.length; i++){
            System.out.println(keys[i]);
        }
    }

}