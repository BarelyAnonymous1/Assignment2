/**
 * Leaf node for the PR-QuadTree. Only node to contain data; contains a
 * linkedlist of Points
 * 
 * @author Preston Lattimer (platt) Jonathan DeFreeuw (jondef95)
 *
 */
public class QuadLeaf implements QuadNode
{
    /**
     * linkedlist of Points stored in the leaf node
     */
    private LinkedList data;

    /**
     * default constructor; leaves the data linkedlist empty; used mainly for
     * the Flyweight node
     */
    public QuadLeaf(){}

    public QuadLeaf(Point startData)
    {
        data = new LinkedList(startData);
    }

    @Override
    public int dump(int x, int y, int width, int depth)
    {
        String spaces = "";
        for (int i = 0; i < depth; i++)
            spaces += "  ";
        String title = spaces + "Node at " + x + ", " + y + ", " + width
                + ":";
        if (data == null)
            System.out.println(title + " Empty");
        else
        {
            System.out.println(title);
            LinkedNode curr = data.getHead();
            while (curr != null)
            {
                String output = spaces + curr.getData().toString();
                System.out.println(output);
                curr = curr.getNext();
            }
        }
        return 1;
    }

    public QuadNode adjustTree(int x, int y, int width)
    {
        if (data != null && data.getSize() == 4)
        {
            QuadInternal root = new QuadInternal();
            while (data.getHead() != null)
            {
                root.insert(x, y, width, data.remove());
            }
            return root;
        }
        else
        {
            return this;
        }
    }

    @Override
    public QuadNode insert(int x, int y, int width, Point newPoint)
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

    public LinkedList getData()
    {
        return data;
    }

    // public String toString()
    // {
    // String output = "Node at " + x + ", " + y + ", " + width + ": ";
    // if (data == null)
    // return output + "Empty\n";
    // else
    // {
    // output += "\n";
    // String spaces = "";
    // for (int i = 0; i < depth; i++)
    // spaces += " ";
    // LinkedNode curr = data.getHead();
    // while (curr != null)
    // {
    // output += spaces + curr.getData().toString() + "\n";
    // curr = curr.getNext();
    // }
    // return output;
    // }
    // }
}