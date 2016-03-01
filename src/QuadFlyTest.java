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

	@Test
	public void testDump() {
		tree.FLYLEAF.dump(0, 0, 2, 0);
		assertSame("Node at 0, 0, 2: Empty\n", systemOut().getHistory());
	}

}
