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
    private LinkedNode next;
    /**
     * point data contained in the node
     */
    private Point    data;

    /**
     * creates a node that contains data and no next node
     * 
     * @param newValue
     *            the value stored in the node
     */
    public LinkedNode(Point newValue)
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
    public void setNext(LinkedNode newNext)
    {
        next = newNext;
    }

    /**
     * get the next node
     * 
     * @return the node next to this one
     */
    public LinkedNode getNext()
    {
        return next;
    }

    /**
     * sets the value of the node
     * 
     * @param newData
     *            data to be stored in the node
     */
    public void setData(Point newData)
    {
        data = newData;
    }

    /**
     * returns the private KVPair stored in the node
     * 
     * @return the pair in the node
     */
    public Point getData()
    {
        return data;
    }
}
