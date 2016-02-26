/**
 * basic linked list implementation; based on storing Points
 * 
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 * @version 1
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

    public Point remove()
    {
        if (head.getNext() != null)
        {
            LinkedNode temp = head;
            head = head.getNext();
            return temp.getData();
        }
        else
        {
            Point output = head.getData();
            head = null;
            return output;
        }
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
                curr = (curr.getNext());
            }
            curr.setNext(newNode);
            if (!exists)
                size++;
        }
    }

    public LinkedNode getHead()
    {
        return head;
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