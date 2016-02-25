
public class QuadLeaf<K extends Comparable<K>, E> implements QuadNode<K, E>
{
    private int              depth;
    private LinkedList<K, E> data;

    public QuadLeaf(){}

    public QuadLeaf(int startDepth)
    {
        depth = startDepth;
        data = new LinkedList<K, E>();
    }

    public QuadLeaf(int startDepth, KVPair<K, E> startData)
    {
        depth = startDepth;
        data = new LinkedList<K, E>(startData);
    }

    @Override
    public void traverse(QuadNode<K, E> root)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public LinkedNode<K, E> remove(QuadNode<K, E> root, KVPair<K, E> pair)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LinkedList<K, E> getElement()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setElement(LinkedList<K, E> list)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void dump(String depth)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public LinkedNode<K, E> find(QuadNode<K, E> root)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(QuadNode<K, E> root)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void getData()
    {
        // TODO Auto-generated method stub

    }
    
    public int getDepth()
    {
        return depth;
    }
    
    public String toString()
    {
        if (data == null)
            return "Empty\n";
        LinkedNode<K, E> curr = data.getHead();
        String output = "";
    }
    

}
