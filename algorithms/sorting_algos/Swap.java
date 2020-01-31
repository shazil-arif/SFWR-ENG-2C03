/* @class Swap to swap array elements. remove the need for repeated code in each sort algorithm*/
class Swap{
    public static void swap(int keys[], int i, int j){
        int temp = keys[i];
        keys[i] = keys[j];
        keys[j] = temp;
    }
}