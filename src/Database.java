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
    private QuadTree<K, E> tree;

    public Database()
    {
        list = new SkipList<K, E>();
        tree = new QuadTree<K, E>();
    }

    /**
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
     * not yet implemented
     * 
     * @param key
     *            is the key to be searched
     */
    public E removeKey(K key)
    {
        return null;
    }

    /**
     * 
     * @param val
     *            is the value to be found
     */
    public E removeValue(E val)
    {
        return null;
    }

    /**
     * not implemented
     */
    public void duplicates()
    {
        // not yet implemented
    }

    /**
     * not implemented
     */
    public void dump()
    {
        list.dump();
        tree.dump();
    }

    /**
     * not implemented
     */
    public SkipNode<K, E> search(K key)
    {
        return null;
    }

    /**
     * not implemented
     */
    public void regionSearch(E region)
    {
    };
}
