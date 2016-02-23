/**
 * nodes to build a linked list of points
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 *
 */
public class LinkedNode<K extends Comparable<K>, E>
{
    /**
     * next node in the list
     */
    private LinkedNode<K, E> next;
    /**
     * point data contained in the node
     */
    private KVPair<K, E> data;
    
    /**
     * 
     * @param newValue
     */
    public LinkedNode(KVPair<K, E> newValue)
    {
        data = newValue;
        next = null;
    }
    
    public void setNext(LinkedNode<K, E> newNext)
    {
        next = newNext;
    }
    
    public LinkedNode<K, E> getNext()
    {
        return next;
    }
    
    public void setNext(KVPair<K, e> newData)
    {
        data = newData;
    }
    
    public KVPair<K, E> getData()
    {
        return data;
    }
}
