
public class LinkedNode
{
    private LinkedNode next;
    private Point2 data;
    
    
    public LinkedNode(Point2 newValue)
    {
        data = newValue;
        next = null;
    }
    
    public void setNext(LinkedNode newNext)
    {
        next = newNext;
    }
    
    public LinkedNode getNext()
    {
        return next;
    }
    
    public void setNext(Point2 newData)
    {
        data = newData;
    }
    
    public Point2 getData()
    {
        return data;
    }
}
