/**
 * Node used to implement the SkipList; takes a KVPair and stores it
 * 
 * @author Preston Lattimer (platt), Jonathan DeFreeuw (jondef95)
 * 
 * @param <K>
 *            the generic key value for the KVPair
 * @param <E>
 *            the generic data value for the KVPair
 * @version 1
 *
 */
public interface QuadNode
{
<<<<<<< HEAD
	public void traverse(QuadNode root);
	public LinkedNode remove(QuadNode root);
	public LinkedList getElement();
	public void setElement(LinkedList list);
	public void dump(QuadNode root);
	public LinkedNode find(QuadNode root);
	public void insert(QuadNode root);
	
}
=======

    /**
     * creates a skip list node array that is blank that will point to the next
     * node in the list
     */
    public QuadNode<K, E>[] next;

    /**
     * Data stored into the node
     */
    private KVPair<K, E>    pair;
    
    private QuadNode<K, E> NWChild;
    private QuadNode<K, E> NEChild;
    private boolean internal;
    /**
     * determines the level that the node is actually on
     */
    private int             level;

    /**
     * constructor to make nodes that store a KVPair
     * 
     * @param newPair
     *            pair of values stored as the data in the node
     * @param newLevel
     *            the integer used to store the level of that node
     */

    @SuppressWarnings("unchecked")
    public QuadNode(KVPair<K, E> newPair, QuadNode<K, E> newLeftChild, 
    		QuadNode<K, E> newRightChild, boolean newInternal)
    {
        pair = newPair;
        NWChild = newLeftChild;
        NEChild = newRightChild;
    }

    /**
     * =========================== getters and setters section
     */

    /**
     * key getter
     * 
     * @return key of the node
     */
    public K getKey()
    {
        if (pair != null)
        {
            return pair.key();
        }
        return null;
    }

    /**
     * value getter
     * 
     * @return value of node
     */
    public E getValue()
    {
        if (pair != null)
        {
            return pair.value();
        }
        return null;
    }

    /**
     * level getter
     * 
     * @return level of the current node
     */
    public int getLevel()
    {
        return level;
    }


    /**
     * gets the pair
     * 
     * @return KVPair of the node
     */
    public KVPair<K, E> getPair()
    {
        if (pair != null)
            return pair;
        return null;
    }
}
>>>>>>> branch 'master' of https://github.com/BarelyAnonymous1/Assignment2.git
