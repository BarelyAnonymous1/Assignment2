import org.junit.Before;
import org.junit.Test;

import student.TestCase;

/**
 * 
 */

/**
 * @author platt, jondef95
 * @version 1
 *
 */
public class PointTest extends TestCase {

    /**
     * Test method for equals.
     */
    public void testEquals() {
        Object obj = new Object();
        Point point = new Point("a", 1, 2);
        Point point2 = new Point("a", 1, 2);
        Point pointNotSame = new Point("b", 3, 2);
        Point pointNotSame2 = new Point("c", 1, 3);
        assertFalse(point.equals(obj));
        assertTrue(point.equals(point2));
        assertFalse(point.equals(pointNotSame));
        assertFalse(point.equals(pointNotSame2));
    }

}
