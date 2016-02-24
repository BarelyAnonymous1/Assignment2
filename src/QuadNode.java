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
public interface QuadNode<K extends Comparable<K>, E>
{

    /**
     * move through the quadtree
     * 
     * @param root
     *            starting node
     */
    public void traverse(QuadNode<K, E> root);

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

    public LinkedList<K, E> getElement();

    public void setElement(LinkedList<K, E> list);

    public void dump(QuadNode<K, E> root);

    public LinkedNode<K, E> find(QuadNode<K, E> root);

    public void insert(QuadNode<K, E> root);

    public void getData();

}