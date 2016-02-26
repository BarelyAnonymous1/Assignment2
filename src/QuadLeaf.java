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

    public QuadLeaf(int startX, int startY, int startWidth, int startDepth)
    {
        x = startX;
        y = startY;
        width = startWidth;
        depth = startDepth;
        data = new LinkedList();
    }

    public QuadLeaf(Point startData)
    {
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
    public int dump(QuadNode root, int depth)
    {
        if (root == null)
            return 0;
        System.out.println(this.toString());
        return 1;
    }

    @Override
    public LinkedNode find(QuadNode root)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public QuadNode insert(QuadNode root, Point newPoint)
    {
        if (data == null)
        {
            QuadLeaf newLeaf = new QuadLeaf()
        }
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
        else
        {
            output += "\n";
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