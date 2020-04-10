/**
 * @brief Generic Minimum priority queue data structure 
 */
public class MinPQ<T>{

    Object heap[];
    int n;

    /**
     * @brief constructor for MinPQ
     */
    public MinPQ(int s){
        heap = new Object[s];
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

    }
}