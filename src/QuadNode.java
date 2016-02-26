/**
 * Node used to implement the SkipList; takes a KVPair and stores it
 * 
 * @author Preston Lattimer (platt), Jonathan DeFreeuw (jondef95)
 * 
 * @version 1
 *
 */
public interface QuadNode
{

    /**
     * outputs the value of the node, then recurses to the next node
     * 
     * @param root
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
     * @return data in the node
     */
    public LinkedList getData();
}