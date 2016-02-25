
public class QuadLeaf implements QuadNode
{
    private int              depth;
    private LinkedList data;

    public QuadLeaf(){}

    public QuadLeaf(int startDepth)
    {
        depth = startDepth;
        data = new LinkedList();
    }

    public QuadLeaf(int startDepth, KVPair startData)
    {
        depth = startDepth;
        data = new LinkedList(startData);
    }

    @Override
    public LinkedNode remove(QuadNode root, Point point)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LinkedList getElement()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setElement(LinkedList list)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void dump(QuadNode root)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public LinkedNode find(QuadNode root)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(QuadNode root)
    {
        // TODO Auto-generated method stub
    	return;
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
        LinkedNode curr = data.getHead();
        String output = "";
        return output;
    }
    

}

