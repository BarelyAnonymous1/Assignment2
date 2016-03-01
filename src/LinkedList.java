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

    private boolean    duplicates;

    /**
     * default constructor for the LinkedList
     */
    public LinkedList()
    {
        head = null;
        size = 0;
        duplicates = true;
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
        duplicates = true;
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
     * be determined if there are any duplicates in the list; sorted by
     * coordinate in ascending order, first by x coordinate, then by y
     * coordinate
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
            while (curr.getNext() != null)
            {
                if (!curr.getData().equals(newPoint))
                    duplicates = false;
                if (newPoint.compareTo(curr.getData()) >= 0)
                {
                    newNode.setNext(curr.getNext());
                    curr.setNext(newNode);
                    size++;
                    return;
                }
                curr = (curr.getNext());
            }
            curr.setNext(newNode);
            size++;
        }
    }

    public void outputDuplicates()
    {
        LinkedNode curr = head;
        String output = "";
        while (curr.getNext() != null)
        {
            if (curr.getData().equals(curr.getNext().getData()))
            {
                if (!(output.contains(curr.getNext().getData().toString())))
                {
                    output += curr.getNext().getData().toString();
                    System.out.println(curr.getNext().getData().toString());
                }
            }
            curr = curr.getNext();
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

    /**
     * returns whether or not the list contains only a unique point
     * 
     * @return true if there is only one unique set of coordinates in the list,
     *         false otherwise
     */
    public boolean onlyDuplicates()
    {
        return duplicates;
    }
}