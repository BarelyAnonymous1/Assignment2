/**
 * Class that stores the coordinates to a point in a given plane
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 * @version
 */
public class Point extends Comparable<Point>
{
    private int x;
    private int y;
    private String name;
    
    public Point(int startX, int startY, String startName)
    {
        x = startX;
        y = startY;
        name = startName;
    }
    
    public void setX(int newX)
    {
        x = newX;
    }
    
    public void setY(int newY)
    {
        y = newY;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int compareTo(Point other)
    {
        
    }
    
    
}
