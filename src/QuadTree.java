/**
 * general implementation of quadtree
 * 
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 * @version 1
 */
public class QuadTree
{
    /**
     * Flyweight model used to for null pointers in the tree
     */
    public static final QuadFly FLYLEAF = QuadFly.getInstance();

    private QuadNode              root;

    /**
     * default constructor that stores a flyweight in the root of the tree
     */
    public QuadTree()
    {
        root = QuadTree.FLYLEAF;
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
    
    public void duplicates()
    {
        root.duplicates();
    }
}
