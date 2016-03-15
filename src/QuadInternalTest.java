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
        QuadTree tree = new QuadTree();
        Point newPoint = new Point("a", 1023, 1);
        tree.insert(newPoint);
        tree.insert(newPoint);
        tree.insert(new Point("b", 1022, 1));
        tree.insert(new Point("c", 1, 1));
        tree.remove(new Point("c", 1, 1), true);
        tree.dump();
        assertTrue(systemOut().getHistory()
                .endsWith("1 quadtree nodes printed"));
        
    }
    
}
