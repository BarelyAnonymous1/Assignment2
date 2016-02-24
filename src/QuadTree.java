/**
 * general implementation of quadtree
 * 
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 * @param <K>
 *            key stored in the KVPair
 * @param <E>
 *            value stored in the KVPair
 */
public class QuadTree<K extends Comparable<K>, E>
{

    /**
     * @param args
     */

    private QuadNode head;

    public QuadTree()
    {
        // head = new QuadNode<K, E>(null, 0, 1024, 0);
    }

    /**
     * output a list of every item in the list in the following format:
     * "Node at 0, 0, 1024: Empty"
     */
    public void dump()
    {
        System.out.println("QuadTree dump:");
        int x = 0;
        QuadNode current = head;
        if (head == null)
        {
            System.out.println("Node at 0, 0, 1024: Empty");
            x++;
        }
        /**
         * while (current != null) { String name = ""; if (current.getValue() ==
         * null) { name = "Empty"; } else { name = current.getPair().toString();
         * } // System.out.println("Node at " + current.getLevel() // + ", " +
         * current.getLeftChild() // + ", " + current.getRightChild() // + ": "
         * + name);
         * 
         * current = current.next[0]; x++; }
         */
        System.out.println(x + " quadtree nodes printed");
    }
}
