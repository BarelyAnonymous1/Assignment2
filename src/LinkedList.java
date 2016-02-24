/**
 * basic generic linked list implementation; based on storing KVPairs
 * 
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 * @version 1
 * @param <K>
 *            key stored in the KVPair
 * @param <E>
 *            value stored in the KVPair
 */
public class LinkedList<K extends Comparable<K>, E>
{
    private LinkedNode<K, E> head;
    private int              size;

    /**
     * default constructor for the LinkedList
     */
    public LinkedList()
    {
        head = null;
        size = 0;
    }

    /**
     * creates a LinkedList based on a single node
     * 
     * @param startHead
     *            the node that will start the list
     */
    public LinkedList(LinkedNode<K, E> startHead)
    {
        head = startHead;
        size = 1;
    }

    /**
     * inserts a specific KVPair into the list
     * 
     * @param newPair
     *            the pair that will be added to the node
     */
    public void insert(KVPair<K, E> newPair)
    {
        LinkedNode<K, E> newNode = new LinkedNode<K, E>(newPair);
        if (head == null)
        {
            head = newNode;
            size++;
        }
        else
        {
            LinkedNode<K, E> curr = head;
            while (curr.getNext() != null)
                curr.setNext(curr.getNext());
            curr.setNext(newNode);
            size++;
        }
    }

    /**
     * displays the toStrig values for each node in the list
     */
    public void dump()
    {
        // TODO not yet implemented
        // should print in form "Node at 0, 0, 1024: Internal"
    }

}