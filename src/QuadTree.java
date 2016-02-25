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
    public void dump()
    {
        System.out.println("QuadTree dump:");
        int x = 0;
        QuadNode<String, Point> current = head;
        while (current != null)
        {
            String name = "";
            if (current.getValue() == null)
            {
                name = "Empty";
            }
            else
            {
                name = current.getPair().toString();
            }
            System.out.println("Node at " + current.getLevel() + ", "
                    + current.getLeftChild() + ", "
                    + current.getRightChild() + ": " + name);
            current = current.next[0];
            x++;
        }
        System.out.println(x + " quadtree nodes printed");
    }
    
    public void dump2()
    {
        
    }
}
