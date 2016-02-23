
public class LinkedList<E>
{
    private LinkedNode<E> head;
    private int           size;

    public LinkedList()
    {
        head = null;
        size = 0;
    }

    public LinkedList(LinkedNode<E> startHead)
    {
        head = startHead;
        size = 1;
    }

    public void insert(LinkedNode<E> newNode)
    {
        if (head == null)
        {
            head = newNode;
            size++;
        } 
        else
        {
            LinkedNode<E> curr = head;
            while (curr.getNext() != null)
                curr.setNext(curr.getNext());
            curr.setNext(newNode);
            size++;
        }
    }

}