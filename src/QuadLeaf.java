/**
 * 
 * @author prestonlattimer
 *
 */

public class QuadLeaf implements QuadNode
{
    private int        depth;
    private int        x;
    private int        y;
    private int        width;
    private LinkedList data;

    public QuadLeaf()
    {
    }

    public QuadLeaf(int startDepth)
    {
        depth = startDepth;
        data = new LinkedList();
    }

    public QuadLeaf(int startDepth, Point startData)
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
    public int dump(QuadNode root, String coord)
    {
        if (root == null)
            return 0;
        String output = "Node at " + coord + ": ";
        System.out.println(output + this.toString());
        return 1;
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

    public int getDepth()
    {
        return depth;
    }


    public String toString()
    {

        if (data == null)
            return "Empty\n";
        else
        {
            String output = "\n";
            String spaces = "";
            for (int i = 0; i < depth; i++)
                spaces += "  ";
            LinkedNode curr = data.getHead();
            while (curr != null)
            {     
                output += spaces + curr.getData().toString() + "\n"; 
                curr = curr.getNext();
            }
            return output;
        }
    }
    
    public LinkedList getData()
    {
        return data;
    }
}