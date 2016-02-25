/**
 * 
 * nodes to build a linked list of points
 * 
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 * @version 1
 * @param <K>
 *            key for the KVPair
 * @param <E>
 *            value for the KVPair
 */
public class LinkedNode
{
    /**
     * next node in the list
     */
    private LinkedNode<K, E> next;
    /**
     * point data contained in the node
     */
    private KVPair<K, E>     data;

    /**
     * creates a node that contains data and no next node
     * 
     * @param newValue
     *            the value stored in the node
     */
    public LinkedNode(KVPair<K, E> newValue)
    {
        data = newValue;
        next = null;
    }

    /**
     * sets the value of the next node
     * 
     * @param newNext
     *            the node next to this one
     */
    public void setNext(LinkedNode<K, E> newNext)
    {
        next = newNext;
    }

    /**
     * get the next node
     * 
     * @return the node next to this one
     */
    public LinkedNode<K, E> getNext()
    {
        return next;
    }

    /**
     * sets the value of the node
     * 
     * @param newData
     *            data to be stored in the node
     */
    public void setData(KVPair<K, E> newData)
    {
        data = newData;
    }

    /**
     * returns the private KVPair stored in the node
     * 
     * @return the pair in the node
     */
    public KVPair<K, E> getData()
    {
        return data;
    }
}
