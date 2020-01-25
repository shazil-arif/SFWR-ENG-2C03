class SelectionSort{
    public static void main(String[] args){
        int[] keys = {45,12,54,22,90,24,90,100,58,34};
        System.out.println("Unsorted");
        PrintArray.print_arr(keys);
        selection_sort(keys);
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
    public static void print_arr(int keys[]){
        
        for(int i = 0; i < keys.length; i++){
            System.out.println(keys[i]);
        }
    }

}