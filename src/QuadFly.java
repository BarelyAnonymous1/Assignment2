/**
 * creates the flyweight for the class so that we can conserve space
 * -any leaf node that does not point to data points instead to the 
 * single flyweight, instantiated inside the quadtree class
 * @author platt, jondef95
 * @version 1
 *
 */
public class QuadFly implements QuadNode
{
    private static QuadFly instance = new QuadFly();

    /**
     * creates an empty flyweight
     */
    private QuadFly()
    {
    }

    /**
     * @return the individual instance of the quadfly
     */
    public static QuadFly getInstance()
    {
        return instance;
    }

    @Override
    public int dump(int x, int y, int width, int depth)
    {
        String spaces = "";
        for (int i = 0; i < depth; i++)
            spaces += "  ";
        System.out.println(spaces + "Node at " + x + ", " + y + ", "
                + width + ": Empty");
        return 1;
    }

    @Override
    public QuadNode insert(int x, int y, int width, Point newPoint)
    {
        QuadLeaf newLeaf = new QuadLeaf(newPoint);
        return newLeaf;
    }

    @Override
    public LinkedList getData()
    {
        return null;
    }

    @Override
    public void duplicates()
    {
    }

    @Override
    public Point remove(int x, int y, int width, Point searchPoint,
            boolean byName)
    {
        return null;
    }

    @Override
    public QuadNode adjustTree(int x, int y, int width)
    {
        return this;
    }
    
    /**
     * @return that this has no unique values
     */
    public int getUnique()
    {
        return 0;
    }

}
