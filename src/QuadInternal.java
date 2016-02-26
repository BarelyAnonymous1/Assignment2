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
    public QuadInternal(QuadNode child)
    {
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
    public int dump(QuadNode root, int depth)
    {
        System.out.println(root.toString());
        return 1 + root.dump(northEast, depth++)
                + root.dump(southEast, depth++)
                + root.dump(southWest, depth++)
                + root.dump(northWest, depth++);
    }

    @Override
    public LinkedNode find(QuadNode root)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public QuadNode insert(QuadNode root, int x, int y, int width,
            Point newPoint)
    {
        if (newPoint.getX() < x + width / 2)
            if (newPoint.getY() < y + width / 2)
                northWest = northWest.insert(northWest, x, y, width / 2,
                        newPoint);
            else
                southWest = southWest.insert(southWest, x, width / 2,
                        width / 2, newPoint);
        else if (newPoint.getY() < y + width / 2)
            northEast = northEast.insert(northEast, width / 2, y,
                    width / 2, newPoint);
        else
            southEast = southEast.insert(southEast, width / 2, width / 2,
                    width / 2, newPoint);
        return root;
    }

    /**
     * outputs the value of the LinkedList in the node
     */
    public LinkedList getData()
    {
        return null;
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
