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
    public QuadInternal()
    {
        northEast = QuadTree.getFlyLeaf();
        southEast = QuadTree.getFlyLeaf();
        southWest = QuadTree.getFlyLeaf();
        northWest = QuadTree.getFlyLeaf();
    }

    @Override
    public int dump(QuadNode root, int x, int y, int width, int spaces)
    {
        String printer = "";
        for (int i = 0; i < spaces; i++)
        {
            printer += "  ";
        }
        printer += "Node at " + x + ", " + y + ", " + width + ": Internal  ";
        System.out.println(printer);
        int newDepth = spaces + 1;
        return 1 + northWest.dump(northWest, x, y, width / 2, newDepth)
                + northEast.dump(northEast, width / 2, y, width / 2, newDepth)
                + southWest.dump(southWest, x, width / 2, width / 2, newDepth)
                + southEast.dump(southEast, width / 2, width / 2, width / 2,
                        newDepth);

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
        return this;
    }

    public LinkedList getData()
    {
        return null;
    }

    public void setNW(QuadNode newNW)
    {
        northWest = newNW;
    }

    public void setNE(QuadNode newNE)
    {
        northEast = newNE;
    }

    public void setSW(QuadNode newSW)
    {
        southWest = newSW;
    }

    public void setSE(QuadNode newSE)
    {
        southEast = newSE;
    }
}
