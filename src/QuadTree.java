/**
 * general implementation of quadtree
 * 
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 * @version 1
 */
public class QuadTree
{
    private QuadNode root;
    private static QuadLeaf flyLeaf;

    public QuadTree()
    {
        flyLeaf = new QuadLeaf();
        root = flyLeaf;
    }
    
    public void insert(Point newPoint)
    {
        if (root.getData() == null)
        {
            root = new QuadLeaf(newPoint);
        }
        else
        {
            root.insert(root, 0, 0, 1024, newPoint);
        }
    }

    /**
     * output a list of every item in the list in the following format:
     * "Node at 0, 0, 1024: Empty"
     */
    public void dump()
    {
        System.out.println(root.dump(root, 0) + " quadtree nodes printed");
    }
    
    public QuadNode getRoot()
    {
        return root;
    }
    
    public static QuadLeaf getFlyLeaf()
    {
        return flyLeaf;
    }
}
