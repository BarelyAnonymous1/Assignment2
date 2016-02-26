/**
 * basic linked list implementation; based on storing Points
 * 
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 * @version 1
 */
public class LinkedList
{
    /**
     * pointer to the first node in the list
     */
    private LinkedNode head;
    /**
     * number of DIFFERENT Points in the list. Example: 4,2->2,4->4,2->0,5 has
     * size 3
     */
    private int        size;

    /**
     * default constructor for the LinkedList
     */
    public LinkedList()
    {
        head = null;
        size = 0;
    }

    /**
     * creates a LinkedList based on a single node
     * 
     * @param startPoint
     *            the data that will start the list
     */
    public LinkedList(Point startPoint)
    {
        head = new LinkedNode(startPoint);
        size = 1;
    }

    /**
     * removes the head from the list, and replaces the head with the next node
     * 
     * @return the data stored in the head of the node
     */
    public Point remove()
    {
        if (head.getNext() != null)
        {
            Point temp = head.getData();
            head = head.getNext();
            return temp;
        }
        else
        {
            Point output = head.getData();
            head = null;
            return output;
        }
    }

    /**
     * inserts a specific Point into the list; inserts at the end so that it can
     * be determined if there are any duplicates in the list
     * 
     * @param newPoint
     *            the Point that will be added to the node
     */
    public void insert(Point newPoint)
    {
        LinkedNode newNode = new LinkedNode(newPoint);
        if (head == null)
        {
            head = newNode;
            size++;
        }
        else
        {
            LinkedNode curr = head;
            boolean exists = false;
            while (curr.getNext() != null)
            {
                if (curr.getData().equals(newPoint))
                    exists = true;
                curr = (curr.getNext());
            }
            curr.setNext(newNode);
            if (!exists)
                size++;
        }
    }

    /**
     * get the pointer to the head of the list
     * 
     * @return the head of the list
     */
    public LinkedNode getHead()
    {
        return head;
    }

    /**
     * get the size of the list; size should not include duplicates
     * 
     * @return size of the list, no duplicates
     */
    public int getSize()
    {
        return size;
    }
}