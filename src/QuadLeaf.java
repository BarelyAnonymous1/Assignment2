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

    public QuadLeaf(Point startData)
    {
        data = new LinkedList(startData);
    }

    
    @Override
    public int dump(QuadNode root, int depth)
    {
        if (root == null)
            return 0;
        System.out.println(this.toString());
        return 1;
    }
    
    public QuadNode adjustTree(int x, int y, int width)
    {
        if (data.getSize())
        return null;
    }

    @Override
    public QuadNode insert(QuadNode root, int x, int y, int width, Point newPoint)
    {
        if (data == null)
        {
            QuadLeaf newLeaf = new QuadLeaf(newPoint);
            return newLeaf;
        }
        else
        {
            data.insert(newPoint);
            return adjustTree(x, y, width);
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