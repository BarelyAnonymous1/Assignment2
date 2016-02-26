/**
 * Node used to implement the QuadTree; can be either internal or leaf
 * 
 * @author Preston Lattimer (platt), Jonathan DeFreeuw (jondef95)
 * 
 * @version 1
 *
 */
public interface QuadNode
{

    /**
     * 
     * outputs the value of the node, then recurses to the next node if it is an
     * internal node
     * 
     * @param x
     *            - x coordinate of the top left corner of the current region
     * @param y
     *            - y coordinate of the top left corner of the current region
     * @param width
     *            - width of the current region
     * @param depth
     *            - depth of the current node, relative to the root (0)
     * @return the number of nodes visited
     */
    public int dump(int x, int y, int width, int depth);

    /**
     * inserts a new QuadNode
     * 
     * @param root
     *            i think?
     */
    public QuadNode insert(int x, int y, int width, Point newPoint);

    /**
     * getter for the data stored in the node
     * 
     * @return data in the node
     */
    public LinkedList getData();
}