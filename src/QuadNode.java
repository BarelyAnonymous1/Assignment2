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

    /**
     * remove a specific node from the quadtree
     * 
     * @param root
     *            the starting node
     * @param pair
     *            the pair to be removed
     * @return the node in the list that contains the pair
     */
    public LinkedNode<K, E> remove(QuadNode<K, E> root, KVPair<K, E> pair);

    /**
     * gets the list of elements in the node
     * 
     * @return the linked list of data elements
     */
    public LinkedList<K, E> getElement();

    /**
     * sets the list of elements in the node
     * 
     * @param list
     *            new list to set into the node
     */
    public void setElement(LinkedList<K, E> list);

    /**
     * outputs the value of the node, then recurses to the next node
     * 
     * @param root
     */
    public void dump(String depth);

    /**
     * searches for a specific node, traverses in preorder
     * 
     * @param root
     *            the next node
     * @return the node if it was found
     */
    public LinkedNode<K, E> find(QuadNode<K, E> root);

    /**
     * inserts a new quadnode
     * 
     * @param root
     *            i think?
     */
    public void insert(QuadNode<K, E> root);

    /**
     * not sure yet?
     */
    public void getData();
    
    public int getDepth();
}