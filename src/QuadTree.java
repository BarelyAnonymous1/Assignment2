/**
 * general implementation of quadtree
 * 
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 * @param <String>
 *            key stored in the KVPair
 * @param <Point>
 *            value stored in the KVPair
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
        if (root.getData() != null)
        {
            
        }
    }

    /**
     * output a list of every item in the list in the following format:
     * "Node at 0, 0, 1024: Empty"
     */
    public void dump()
    {
        System.out.println(root.dump(root) + " quadtree nodes printed");
    }
    
    public QuadNode getRoot()
    {
        return root;
    }
}
