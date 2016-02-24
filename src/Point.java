/**
 * Class that stores the coordinates to a point in a given plane
 * 
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 * @version 1
 */
public class Point implements Comparable<Point>
{
    private int    x;
    private int    y;
    private String name;

    /**
     * constructor to store a name and coordinates of a point
     * 
     * @param startName
     *            original name
     * @param startX
     *            original x coordinate
     * @param startY
     *            original y coordinate
     */
    public Point(String startName, int startX, int startY)
    {
        name = startName;
        x = startX;
        y = startY;
    }

    /**
     * sets the X coordinate of the Point
     * 
     * @param newX
     *            replacement x coordinate
     */
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
        if (this.x == other.getX() && this.y == other.getY())
            return 0;
        else
            return -1;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Point)
        {
            Point point = (Point) obj;
            return (this.x == point.getX() && this.y == point.getY());
        }
        return false;
    }

}
