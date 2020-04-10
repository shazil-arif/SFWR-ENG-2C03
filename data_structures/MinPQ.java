/**
 * @brief Generic Minimum priority queue data structure 
 */
public class MinPQ{

    Double heap[];
    int n;

    /**
     * @brief constructor for MinPQ
     */
    public MinPQ(int s){
        n = 0;
        heap = new Double[s];
    }


    /**
     * @brief check if a given index exists in the priority queue
     * @param i key to check for 
     * @return whether the index is in the priority queue
     */
    public boolean contains(int i){
        return i >= 1 && i <= n;
    }

    /**
     * @brief check if the given pq is empty
     * @return if the priority queue is empty
     */
    public boolean isEmpty(){
        return n==0;
    }
    

    /**
     * @brief insert a key into the heap
     * @param i the index to insert the key at
     * @param key the key to insert at index i
     */
    public void insert(int i , Double key){
        heap[n++] = key;
        heapifyUp(n);
    }

    public Double deleteMin(){
        if(isEmpty()) throw new IndexOutOfBoundsException("Cannot delete on empty priority queue");
        Double min = heap[1];
        n--; //decrement heap size
        swap(1,n); //exchange first with last key
        heapifyDown(1); //then sink down the root node
        return min;
    }

    /**
     * @brief update the key at a specific index
     * @param i the index to update the key for
     * @throws IndexOutOfBoundsException if the 
     */
    public void updateKey(int i, Double key){
        if(!contains(i)) throw new IndexOutOfBoundsException("Illegal Index to updateKey");
        Double oldKey = heap[i];
        heap[i] = key;
        if(key <= oldKey) heapifyUp(i);
        else heapifyDown(i);
    }

    /**
     * @brief private helper method to help adjust location of keys in heap
     * @param k the index of the key to sink down the heap
     */
    private void heapifyDown(int k){
        //as long as child index is within bounds of heap
        while(2*k <= n){
            /**
             * since there are two children we have to compare to each
             * one child is at 2*k and the other is at 2*k + 1
             
             * compare left and right child
             * if right child is greater then the index to swap is the one on 'right' of heap, which is 2*k + 1 so increment j since it current is at 2*k
             */
            int j = 2*k;
            if(j <= n && heap[j+1] > heap[j]) j++;
            if(heap[k] <= heap[j]) break; //the heap ordering is satisfied, break the loop here
            swap(k,j);
            k = j;
        }

    }

    /**
     * @brief private helper method to adjust keys by swimming them up if they are out of order
     * @details parent is at index k/2
     */
    private void heapifyUp(int k){
        /**
         * as long as parent node has a key greater than given key at index k keep moving up 
         * parent is at index k/2 so iteratively keep halving the index k and compare to parent
         */
        while(k > 1 && heap[k/2] <= heap[k]) {
            swap(k/2,k);
            k = k/2;
        }
    }
    

    /**
     * @brief swap two values in the heap
     * @param i
     * @param j
     */
    private void swap(int i, int j){
        Double temp = heap[j];
        heap[j] = heap[i];
        heap[i] = temp;
    }

}