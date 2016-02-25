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
    private QuadNode<String, Point> head;
    private static QuadLeaf<String, Point> flyLeaf;

    public QuadTree()
    {
        head = new QuadLeaf<String, Point>(0);
        flyLeaf = new QuadLeaf<String, Point>();
    }

    /**
     * output a list of every item in the list in the following format:
     * "Node at 0, 0, 1024: Empty"
     */
    public int dump(int x, int y, int size, QuadNode<String, Point> root)
    {
        int nodeCount = 0;

        System.out.println(nodeCount + " quadtree nodes printed");
    }
    
    public QuadNode<String, Point> getHead()
    {
        return head;
    }
    public void dump2()
    {
        
    }
}
