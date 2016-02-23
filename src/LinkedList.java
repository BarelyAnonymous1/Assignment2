
public class LinkedList<E>
{
    private LinkedNode<E> head;

    public LinkedList(LinkedNode<E> startHead)
    {
        head = startHead;
    }

    public void insert(LinkedNode<E> newNode)
    {
        if (head == null)
            head = newNode;
        else
        {
            LinkedNode<E> curr = head;
            while (curr.getNext() != null)
                curr.setNext(curr.getNext());
            curr.setNext(newNode);
        }
    }

}

public void QuadTreeDump(QuadNode root)
{
    if (root == null){}
    else
    {
        root.dump();
        QuadTreeDump(root.left());
        QuadTreeDump(root.right());
    }
}