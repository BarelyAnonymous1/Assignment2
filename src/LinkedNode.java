/**
 * nodes to build a linked list of points
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 *
 */
public class LinkedNode<E>
{
    /**
     * next node in the list
     */
    private LinkedNode<E> next;
    /**
     * point data contained in the node
     */
    private E data;
    
    /**
     * 
     * @param newValue
     */
    public LinkedNode(E newValue)
    {
        data = newValue;
        next = null;
    }
    
    public void setNext(LinkedNode<E> newNext)
    {
        next = newNext;
    }
    
    public LinkedNode<E> getNext()
    {
        return next;
    }
    
    public void setNext(E newData)
    {
        data = newData;
    }
    
    public Point2 getData()
    {
        return data;
    }
}
