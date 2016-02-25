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

public class QuadInternal implements QuadNode
{
    private int      depth;
    private int      x;
    private int      y;
    private int      width;
    private QuadNode northEast;
    private QuadNode southEast;
    private QuadNode southWest;
    private QuadNode northWest;

    /**
     * default constructor that has no depth or data
     * 
     * @param newDepth
     *            the depth of the internal node
     * @param child
     *            the flyweight node for the internal node
     */
    public QuadInternal(int newDepth, QuadNode child)
    {
        depth = newDepth;
        northEast = child;
        southEast = child;
        southWest = child;
        northWest = child;
    }

    @Override
    public LinkedNode remove(QuadNode root, Point point)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LinkedList getElement()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setElement(LinkedList list)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public int dump(QuadNode root)
    {
        System.out.println(root.toString());
        return 1 + root.dump(northEast) + root.dump(southEast)
                + root.dump(southWest) + root.dump(northWest);
    }

    @Override
    public LinkedNode find(QuadNode root)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(QuadNode root)
    {
        // TODO Auto-generated method stub

    }

    /**
     * outputs the value of the LinkedList in the node
     */
    public LinkedList getData()
    {
        return null;
    }

    public int getDepth()
    {
        return depth;
    }

    public String toString()
    {
        String printer = "";
        for (int i = 0; i < depth; i++)
        {
            printer += " ";
        }
        printer += "Node at " + x + ", " + y + ", " + width + ": Internal";
        return printer;
    }
}
