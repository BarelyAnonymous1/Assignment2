
public class QuadFly implements QuadNode
{
    private static QuadFly instance = new QuadFly();
    
    private QuadFly()
    {
    }

    public static QuadFly getInstance()
    {
        return instance;
    }
    @Override
    public int dump(int x, int y, int width, int depth)
    {
        String spaces = "";
        for (int i = 0; i < depth; i++)
            spaces += "  ";
        System.out.println(spaces + "Node at " + x + ", " + y + ", "
                + width + ": Empty");
        return 1;
    }

    @Override
    public QuadNode insert(int x, int y, int width, Point newPoint)
    {
        QuadLeaf newLeaf = new QuadLeaf(newPoint);
        return newLeaf;
    }

    @Override
    public LinkedList getData()
    {
        return null;
    }

    @Override
    public void duplicates()
    {
    }
    
    @Override
    public boolean search(int x, int y, int width, Point searchPoint)
    {
        return false;
    }

}
