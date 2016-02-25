
public class QuadLeaf<String, Point> implements QuadNode<String, Point>
{
    private int              depth;
    private int x;
    private int y;
    private int width;
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
    public LinkedNode remove(QuadNode<String, Point> root, Point point)
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
    public void dump(QuadNode<String, Point> root)
    {
        if (root == null) return;
        System.out.println(this.toString());
        return;
    }

    @Override
    public LinkedNode find(QuadNode<String, Point> root)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(QuadNode<String, Point> root)
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
    	String output = "Node at " + x + ", " + y + ", " + width + ": ";
        if (data == null)
            return output + "Empty\n";
        LinkedNode curr = data.getHead();
        output = "";
        return output;
    }
    

}

