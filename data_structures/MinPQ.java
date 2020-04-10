/**
 * @brief Generic Minimum priority queue data structure 
 */
public class MinPQ<T extends Comparable<T>>{

    T heap[];
    int n;

    /**
     * @brief constructor for MinPQ
     */
    public MinPQ(int s){
        heap = (T[]) new Comparable[s];
    }


    /**
     * @brief check if a given key exists in the priority queue
     * @param the key to check for 
     * @return 
     */
    public boolean contains(T key){
        return true;
    }

    /**
     * @brief check if the given pq is empty
     * @return if the priority queue is empty
     */
    public boolean isEmpty(){
        return n==0;
    }
    

    /**
     * @brief 
     * @param
     * @return
     */
    public void insert(T key){
        heap[n++] = key;
        heapifyUp(key);

    }

    public T deleteMin(){
        return;
    }

    /**
     * @brief private helper method to help adjust location of keys in heap
     */
    private void heapifyDown(int k){

    }

    /**
     * @brief private helper method to adjust keys by swimming them up if they are out of order
     * @details parent is at index k/2
     */
    private void heapifyUp(int k){
        while(k > 1 && isLess(k/2,k)) {
            swap(k/2,k);
            k = k/2;

        }

    }

    private void swap(int i, int j){
        T temp = heap[j];
        heap[j] = heap[i];
        heap[i] = heap[j];

    }

    /**
     * @brief compare two keys
     * @param i the first key's index
     * @param j second key's index
     * @return if key at index i is less than key at index j
     */
    private boolean isLess(int i, int j){
        return heap[i].compareTo(heap[j]) < 0;
    }

    
}