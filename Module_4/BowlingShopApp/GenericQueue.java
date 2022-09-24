/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. Bollman 2022
 */

import java.util.LinkedList;

public class GenericQueue<E> {
    // Encapsulated LinkedList of generic type E.
    private LinkedList<E> list = new LinkedList<E>();

    /** 
     * @param item - Add item to queue.
     */
    public void enqueue(E item) {
        list.addFirst(item);
    }

    /** 
     * @return E - Pop item.
     */
    public E dequeue() {
        return list.removeFirst();
    }

    /** 
     * @return int - Get the size of the queue.
     */
    public int size() {
        return list.size();
    }
}
