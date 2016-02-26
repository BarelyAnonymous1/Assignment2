/**
 * basic generic linked list implementation; based on storing KVPairs
 * 
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 * @version 1
 * @param <K>
 *            key stored in the KVPair
 * @param <E>
 *            value stored in the KVPair
 */
public class LinkedList
{
    private LinkedNode head;
    private int        size;

    /**
     * default constructor for the LinkedList
     */
    public LinkedList()
    {
        head = null;
        setSize(0);
    }

    /**
     * creates a LinkedList based on a single node
     * 
     * @param startData
     *            the data that will start the list
     */
    public LinkedList(Point point)
    {
        head = new LinkedNode(point);
        setSize(1);
    }

    /**
     * inserts a specific KVPair into the list
     * 
     * @param newPair
     *            the pair that will be added to the node
     */
    public void insert(Point newPoint)
    {
        LinkedNode newNode = new LinkedNode(newPoint);
        if (head == null)
        {
            head = newNode;
            setSize(getSize() + 1);
        }
        else
        {
            LinkedNode curr = head;
            boolean exists = false;
            while (curr.getNext() != null)
            {
                if (curr.getData() == newPoint)
                    exists = true;
                curr.setNext(curr.getNext());
                System.out.println("next");
            }
            curr.setNext(newNode);
            if (!exists)
                setSize(getSize() + 1);
        }
    }

    public LinkedNode getHead()
    {
        return head;
    }

    /**
     * displays the toStrig values for each node in the list
     */
    public void dump()
    {
        // TODO not yet implemented
        // should print in form "Node at 0, 0, 1024: Internal"
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int newSize)
    {
        size = newSize;
    }
}