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
public class QuadInternalTest extends TestCase {

    QuadInternal node1;
    QuadInternal node2;
    QuadInternal node3;
    /**
     * sets up the class
     */
    public void setUp() {
        node1 = new QuadInternal();
        node2 = new QuadInternal();
        node3 = new QuadInternal();
    }

    /**
     * tests the remove method
     */
    public void testRemove()
    {
        Point searchPoint = new Point("a", 54, 10);
        assertNull(node1.remove(0, 4, 20, searchPoint, true));
    }
    /**
     * tests the adjustTree mehtod
     */
    public void testAdjustTree()
    {
        assertSame(node1.adjustTree(0, 0, 10), QuadTree.FLYLEAF);
    }
}
