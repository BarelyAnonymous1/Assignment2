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

    /**
     * sets the Y coordinate of the Point
     * 
     * @param newY
     *            replacement y coordinate
     */
    public void setY(int newY)
    {
        y = newY;
    }

    /**
     * sets the name of the Point
     * 
     * @param newName
     *            replacement name for the Point
     */
    public void setName(String newName)
    {
        name = newName;
    }

    /**
     * access to private x coordinate
     * 
     * @return x coordinate
     */
    public int getX()
    {
        return x;
    }

    /**
     * access to private y coordinate
     * 
     * @return y coordinate
     */
    public int getY()
    {
        return y;
    }

    /**
     * access to private name
     * 
     * @return name of the Point
     */
    public String getName()
    {
        return name;
    }

    /**
     * checks to see if two Points are equivalent
     * 
     * @param other
     *            the Point being compared to this
     * @return an integer to determine equivalence
     */
    public int compareTo(Point other)
    {
        if (this.x == other.getX() && this.y == other.getY())
            return 0;
        else
            return -1;
    }

    /**
     * determines if the obj is equivalent to this Point
     * 
     * @param obj
     *            the Object being compared to this
     * @return true if equivalent, false otherwise
     */
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
