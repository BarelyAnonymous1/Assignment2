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
        northEast = QuadTree.FLYLEAF;
        southEast = QuadTree.FLYLEAF;
        southWest = QuadTree.FLYLEAF;
        northWest = QuadTree.FLYLEAF;
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
     *            - depth of the current node, relative to the root (depth 0)
     * @return the number of nodes visited
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
                + northEast.dump(x + width / 2, y, width / 2, newDepth)
                + southWest.dump(x, y + width / 2, width / 2, newDepth)
                + southEast.dump(x + width / 2, y + width / 2, width / 2,
                        newDepth);

    }

    /**
     * insert a new Point in a child of the current internal node; recursive in
     * that it will continue following internal nodes if the child chosen is
     * internal, otherwise the function will end when it reaches a leaf
     * 
     * @param x
     *            - x coordinate of the top left corner of the current region
     * @param y
     *            - y coordinate of the top left corner of the current region
     * @param width
     *            - width of the current region
     * @param newPoint
     *            - Point that will be added to the tree
     * @return the root of the subtree that is changed after insert
     */
    @Override
    public QuadNode insert(int x, int y, int width, Point newPoint)
    {
        if (newPoint.getX() < x + width / 2)
            if (newPoint.getY() < y + width / 2)
                northWest = northWest.insert(x, y, width / 2, newPoint);
            else
                southWest = southWest.insert(x, y + width / 2, width / 2,
                        newPoint);
        else if (newPoint.getY() < y + width / 2)
            northEast = northEast.insert(x + width / 2, y, width / 2,
                    newPoint);
        else
            southEast = southEast.insert(x + width / 2, y + width / 2,
                    width / 2, newPoint);
        return this;
    }

    /**
     * gets the data stored in the internal node; which is null because the
     * internal node stores no information except pointers to its children
     * 
     * @return null because there is no data in the internal node
     */
    @Override
    public LinkedList getData()
    {
        return null;
    }

    @Override
    public void duplicates()
    {
        northWest.duplicates();
        southWest.duplicates();
        northEast.duplicates();
        southEast.duplicates();
    }

    public Point remove(int x, int y, int width, Point searchPoint,
            boolean byName)
    {
        Point foundPoint = null;
        if (searchPoint.getX() < x + width / 2)
            if (searchPoint.getY() < y + width / 2)
            {
                foundPoint = northWest.remove(x, y, width / 2, searchPoint,
                        byName);
                northWest = northWest.adjustTree(x, y, width);
            }
            else
            {
                foundPoint = southWest.remove(x, y + width / 2, width / 2,
                        searchPoint, byName);
                southWest = southWest.adjustTree(x, y, width);
            }
        else if (searchPoint.getY() < y + width / 2)
        {
            foundPoint = northEast.remove(x + width / 2, y, width / 2,
                    searchPoint, byName);
            northEast = northEast.adjustTree(x, y, width);
        }
        else
        {
            foundPoint = southEast.remove(x + width / 2, y + width / 2,
                    width / 2, searchPoint, byName);
            southEast = southEast.adjustTree(x, y, width);
        }
        return foundPoint;
    }

    private int removeEmpty()
    {
        int numUniques = 0;
        if (northWest.getData() != null)
        {
            int nw = northWest.getData().getUnique();
            if (nw == 0)
                northWest = QuadTree.FLYLEAF;
            numUniques += nw;
        }
        if (northEast.getData() != null)
        {
            int ne = northEast.getData().getUnique();
            if (ne == 0)
                northEast = QuadTree.FLYLEAF;
            numUniques += ne;
        }
        if (southWest.getData() != null)
        {
            int sw = southWest.getData().getUnique();
            if (sw == 0)
                southWest = QuadTree.FLYLEAF;
            numUniques += sw;
        }
        if (southEast.getData() != null)
        {
            int se = southEast.getData().getUnique();
            if (se == 0)
                southEast = QuadTree.FLYLEAF;
            numUniques += se;
        }
        return numUniques;
    }

    @Override
    public QuadNode adjustTree(int x, int y, int width)
    {
        int numUniques = removeEmpty();
        if (numUniques == 0)
        {
            return QuadTree.FLYLEAF;
        }
        else if (numUniques < 4)
        {
            QuadLeaf newLeaf = new QuadLeaf();
            System.out.println("stuck");
            while (northWest.getData() != null
                    && northWest.getData().getHead() != null)
            {
                newLeaf.insert(x, y, width, northWest.getData().removeHead());
                System.out.println("stuck");
            }
            while (northEast.getData() != null
                    && northEast.getData().getHead() != null)
            {
                newLeaf.insert(x, y, width, northEast.getData().removeHead());
                System.out.println("stuck");
            }
            while (southWest.getData() != null
                    && southWest.getData().getHead() != null)
            {
                newLeaf.insert(x, y, width, southWest.getData().removeHead());
                System.out.println("stuck");
            }
            while (southEast.getData() != null
                    && southEast.getData().getHead() != null)
            {
                newLeaf.insert(x, y, width, southEast.getData().removeHead());
                System.out.println("stuck");
            }
            return newLeaf.adjustTree(x, y, width);
        }
        else
        {
            return this;
        }
    }

}
