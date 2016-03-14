import org.junit.Before;
import org.junit.Test;

import student.TestCase;

/**
 * 
 */

/**
 * @author prestonlattimer
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
        assertFalse(point.equals(obj));
        assertTrue(point.equals(point2));
    }

}
