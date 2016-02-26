/**
 * general implementation of quadtree
 * 
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 * @version 1
 */
public class QuadTree
{
    private QuadNode              root;
    public static final QuadLeaf FLYLEAF = new QuadLeaf();

    /**
     * default constructor that stores a flyweight in the root of the tree
     */
    public QuadTree()
    {
        root = FLYLEAF;
    }

    /**
     * insert a new point into the tree
     * @param newPoint the new point to be added to the tree
     */
    public void insert(Point newPoint)
    {
        root = root.insert(0, 0, 1024, newPoint);
    }

    /**
     * output a list of every item in the list in the following format:
     * "Node at 0, 0, 1024: Empty"
     */
    public void dump()
    {
        System.out.println("QuadTree dump:");
        System.out.println(
                root.dump(0, 0, 1024, 0) + " quadtree nodes printed");
    }
}
