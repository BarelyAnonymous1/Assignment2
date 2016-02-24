/**
 * internal node for the quadtree
 * 
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 * @param <K>
 *            key stored in the KVPair
 * @param <E>
 *            value stored in the KVPair
 */
public class QuadInternal<K extends Comparable<K>, E>
        implements QuadNode<K, E>
{

    private int              depth;
    private LinkedList<K, E> data;
    private int              cornerX;
    private int              cornerY;
    private int              width;

    /**
     * default constructor that has no depth or data
     */
    public QuadInternal()
    {
        depth = 0;
        data = null;
    }

    @Override
    public void traverse(QuadNode<K, E> root)
    {
        if (root == null)
            return;
        int i = 0;
        while (i < depth)
            System.out.print("  ");
        root.getData();

    }

    @Override
    public LinkedNode<K, E> remove(QuadNode<K, E> root)
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
        // TODO Auto-generated method stub

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

    public void getData()
    {
        data.dump();
        return;
    }

}
