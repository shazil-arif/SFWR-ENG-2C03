class BubbleSort{
    public static void main(String[] args){
        int[] keys = {45,12,54,22,90,24,90,100,58,34};
        System.out.println("Unsorted");
        PrintArray.print_arr(keys);
        bubble_sort(keys);
        System.out.println("----------------");
        System.out.println("Sorted");
        PrintArray.print_arr(keys);
    }
    public static void bubble_sort(int[] keys){
        for(int i = 0; i < keys.length; i++){
            for(int j = 0; j < keys.length - 1; j++){
                /* See Less.java for implementation of less function */
                if (!Less.less(keys[j],keys[j+1]))
                    Swap.swap(keys, j+1, j);
            }
        }

    }
}