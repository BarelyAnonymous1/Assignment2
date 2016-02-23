
public class LinkedList<K extends Comparable<K>, E>
{
    private LinkedNode<K, E> head;
    private int           size;

    public LinkedList()
    {
        head = null;
        size = 0;
    }

    public LinkedList(LinkedNode<K, E> startHead)
    {
        head = startHead;
        size = 1;
    }

    public void insert(LinkedNode<K, E> newNode)
    {
        if (head == null)
        {
            head = newNode;
            size++;
        } 
        else
        {
            LinkedNode<K, E> curr = head;
            while (curr.getNext() != null)
                curr.setNext(curr.getNext());
            curr.setNext(newNode);
            size++;
        }
    }

}