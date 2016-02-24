/**
 * Database that will contain the data structures used for a point-region
 * problem
 * 
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 * @version 1
 * @param <K>
 *            key for the KVPairs in the lists
 * @param <E>
 *            value for the KVPairs in the lists
 */
public class Database<K extends Comparable<K>, E>
{

    /**
     * creates the skipList for the database
     */
    private SkipList<K, E> list;
    /**
     * declares the quadtree for the database
     */
    private QuadTree<K, E> tree;

    /**
     * initializes the SkipList and QuadTree for the Database
     */
    public Database()
    {
        list = new SkipList<K, E>();
        tree = new QuadTree<K, E>();
    }

    /**
     * insert a KVPair into the data structures of the database
     * 
     * @param pair
     *            is the value to be inserted
     */
    public void insert(KVPair<K, E> pair)
    {
        /**
         * not yet implemented
         * 
         */
    }

    /**
     * 
     * remove a value from the database based on the key
     * 
     * @param key
     *            is the key to be searched
     * @return the value in the SkipList and quadtree
     */
    public E removeKey(K key)
    {
        return null;
    }

    /**
     * remove a value from the database based on the value
     * 
     * @param val
     *            is the value to be found
     * @return the value in the SkipList and quadtree
     */
    public E removeValue(E val)
    {
        return null;
    }

    /**
     * find all duplicate points in the quad tree
     */
    public void duplicates()
    {
        // not yet implemented
    }

    /**
     * outputs the data using the quad tree
     */
    public void dump()
    {
        tree.dump();
    }

    /**
     * searches for a specific key value
     * 
     * @param key
     *            the key that is being searched for
     * @return the node in the SkipList that contains that specific key
     */
    public SkipNode<K, E> search(K key)
    {
        return null;
    }

    /**
     * find all points within a specific region in the quadtree
     * 
     * @param region
     *            the region that is being used to search for points in the
     *            quadtree
     */
    public void regionSearch(E region)
    {
    }
}
