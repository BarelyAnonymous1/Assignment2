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
    private QuadNode northWest;
    private QuadNode northEast;
    private QuadNode southWest;
    private QuadNode southEast;

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
        northWest = child;
        northEast = child;
        southWest = child;
        southEast = child;
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
    public void dump(QuadNode root)
    {
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
    public void getData()
    {
        return;
    }

    public int getDepth()
    {
        return depth;
    }

    public String toString()
    {
        String printer = "";
        int i = 0;
        while (i < depth)
        {
            printer += " ";
        }
        printer += "Node at " + x + ", " + y + ", " + width + ": Internal";
        return printer;
    }
}
