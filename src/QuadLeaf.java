/**
 * 
 * @author prestonlattimer
 *
 */

public class QuadLeaf implements QuadNode
{
    private LinkedList data;

    public QuadLeaf()
    {
    }

    public QuadLeaf(Point startData)
    {
        data = new LinkedList(startData);
    }

    
    @Override
    public int dump(QuadNode root, int x, int y, int width, int depth)
    {
        if (root == null)
            return 0;
        String title = "Node at " + x + ", " + y + ", " + width + ": ";
        if (data == null)
            System.out.println(title + "Empty"); 
        else
        {
            System.out.println(title);
            String spaces = "";
            for (int i = 0; i < depth; i++)
                spaces += "  ";
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
            QuadInternal root = new QuadInternal(QuadTree.getFlyLeaf());
            LinkedNode curr = data.getHead();
            while (curr != null)
            {
                root.insert(root, x, y, width, curr.getData());
                curr = curr.getNext();
            }
            return root;
        }
        else
            return this;
    }

    @Override
    public QuadNode insert(QuadNode root, int x, int y, int width, Point newPoint)
    {
        System.out.println(newPoint.toString());
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

//    public String toString()
//    {
//        String output = "Node at " + x + ", " + y + ", " + width + ": ";
//        if (data == null)
//            return output + "Empty\n";
//        else
//        {
//            output += "\n";
//            String spaces = "";
//            for (int i = 0; i < depth; i++)
//                spaces += "  ";
//            LinkedNode curr = data.getHead();
//            while (curr != null)
//            {
//                output += spaces + curr.getData().toString() + "\n";
//                curr = curr.getNext();
//            }
//            return output;
//        }
//    }
}