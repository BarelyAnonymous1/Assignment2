/**
 * internal node for the quadtree
 * 
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 * @version 1
 * @param <K>
 *            key stored in the KVPair
 * @param <E>
 *            value stored in the KVPair
 */
public class QuadInternal<K extends Comparable<K>, E>
        implements QuadNode<K, E>
{
    private int            depth;
    private int x;
    private int y;
    private int width;
    private QuadNode<K, E> northWest;
    private QuadNode<K, E> northEast;
    private QuadNode<K, E> southWest;
    private QuadNode<K, E> southEast;

    /**
     * default constructor that has no depth or data
     * 
     * @param newDepth
     *            the depth of the internal node
     */
    public QuadInternal(int newDepth)
    {
        depth = newDepth;
        // northWest = flyweight;
        // northEast = flyweight;
        // southWest = flyweight;
        // southEast = flyweight;
    }

    @Override
    public LinkedNode<K, E> remove(QuadNode<K, E> root, KVPair<K, E> pair)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LinkedList<K, E> getElement()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setElement(LinkedList<K, E> list)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void dump(QuadNode<K, E> root)
    {
        if (root == null) return;
        System.out.println("Node at " + x + ", " + y + ", " + width + 
        		": Internal");
        dump(northWest);
        dump(northEast);
        dump(southWest);
        dump(southEast);
    }

    @Override
    public LinkedNode<K, E> find(QuadNode<K, E> root)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(QuadNode<K, E> root)
    {
        // TODO Auto-generated method stub 

    }

    /**
     * outputs the value of the LinkedList in the node
     */
    public void getData()
    {
    	return;
    }

}
