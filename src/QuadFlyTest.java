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
public class QuadFlyTest extends TestCase {

	QuadTree tree;
	@Before
	public void setUp() {
		tree = new QuadTree();
	}

	/**
	 * test case for the dump function for the flyleaf
	 */
	@Test
	public void testDump() {
		tree.FLYLEAF.dump(0, 0, 2, 0);
		assertEquals("Node at 0, 0, 2: Empty\n", systemOut().getHistory());
		Point point = new Point("test", 0, 0);
		QuadLeaf leaf = new QuadLeaf(point);	
	}

}