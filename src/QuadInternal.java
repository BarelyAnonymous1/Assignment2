/**
 * internal node for the quadtree
 * 
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 * @version 1
 */

public class QuadInternal implements QuadNode
{
    private QuadNode northEast;
    private QuadNode southEast;
    private QuadNode southWest;
    private QuadNode northWest;

    /**
     * default constructor that sets all of the children to the Flyweight
     * 
     */
    public QuadInternal()
    {
        northEast = QuadTree.getFlyLeaf();
        southEast = QuadTree.getFlyLeaf();
        southWest = QuadTree.getFlyLeaf();
        northWest = QuadTree.getFlyLeaf();
    }

    /**
     * outputs that the current node with the parameters is an internal node
     * recursive function that moves through each of the children counts the
     * number of notes visited
     * 
     * @param x
     *            - x coordinate of the top left corner of the current region
     * @param y
     *            - y coordinate of the top left corner of the current region
     * @param width
     *            - width of the current region
     * @param depth
     *            - depth of the current node
     */
    @Override
    public int dump(int x, int y, int width, int depth)
    {
        String printer = "";
        for (int i = 0; i < depth; i++)
        {
            printer += "  ";
        }
        printer += "Node at " + x + ", " + y + ", " + width + ": Internal";
        System.out.println(printer);
        int newDepth = depth + 1;
        return 1 + northWest.dump(x, y, width / 2, newDepth)
                + northEast.dump(width / 2, y, width / 2, newDepth)
                + southWest.dump(x, width / 2, width / 2, newDepth)
                + southEast.dump(width / 2, width / 2, width / 2,
                        newDepth);

    }

    @Override
    public QuadNode insert(int x, int y, int width, Point newPoint)
    {
        if (newPoint.getX() < x + width / 2)
            if (newPoint.getY() < y + width / 2)
                northWest = northWest.insert(x, y, width / 2, newPoint);
            else
                southWest = southWest.insert(x, width / 2, width / 2,
                        newPoint);
        else if (newPoint.getY() < y + width / 2)
            northEast = northEast.insert(width / 2, y, width / 2,
                    newPoint);
        else
            southEast = southEast.insert(width / 2, width / 2, width / 2,
                    newPoint);
        return this;
    }

    @Override
    public LinkedList getData()
    {
        return null;
    }
}
