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
public class QuadInternalNode<K extends Comparable<K>, E>
{

    /**
     * creates a skip list node array that is blank that will point to the next
     * node in the list
     */
    public QuadInternalNode<K, E>[] next;

    /**
     * Data stored into the node
     */
    private KVPair<K, E>    pair;
    
    private int x;
    private int y;
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
    public QuadInternalNode(KVPair<K, E> newPair, int newX, 
    		int newY, int newLevel)
    {
        level = newLevel;
        pair = newPair;
        x = newX;
        y = newY;
        next = (QuadInternalNode<K, E>[]) new QuadInternalNode[newLevel + 1];
        for (int i = 0; i < level; i++)
        {
            next[i] = null;
        }
    }
    
    public void traverse()
    {
    	System.out.println("Node at ", );
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
    
    public int getX()
    {
    	return 
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
