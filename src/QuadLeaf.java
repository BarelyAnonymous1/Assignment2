<<<<<<< HEAD
=======

>>>>>>> branch 'master' of https://github.com/BarelyAnonymous1/Assignment2.git
public class QuadLeaf implements QuadNode
{
<<<<<<< HEAD
    private int        depth;
=======
    private int              depth;
    private int x;
    private int y;
    private int width;
>>>>>>> branch 'master' of https://github.com/BarelyAnonymous1/Assignment2.git
    private LinkedList data;

    public QuadLeaf()
    {
    }

    public QuadLeaf(int startDepth)
    {
        depth = startDepth;
        data = new LinkedList();
    }

<<<<<<< HEAD
    public QuadLeaf(int startDepth, Point startData)
=======
    public QuadLeaf(int startDepth, KVPair startData)
>>>>>>> branch 'master' of https://github.com/BarelyAnonymous1/Assignment2.git
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
        if (root == null) return;
        System.out.println(this.toString());
        return;
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
    	String output = "Node at " + x + ", " + y + ", " + width + ": ";
        if (data == null)
<<<<<<< HEAD
            return "Empty\n";
        LinkedNode curr = data.getHead();
        String output = "";
=======
            return output + "Empty\n";
        LinkedNode curr = data.getHead();
        output = "";
>>>>>>> branch 'master' of https://github.com/BarelyAnonymous1/Assignment2.git
        return output;
    }
}
<<<<<<< HEAD
=======

>>>>>>> branch 'master' of https://github.com/BarelyAnonymous1/Assignment2.git
