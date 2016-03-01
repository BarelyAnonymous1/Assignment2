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
	protected void setUp() throws Exception {
		tree = new QuadTree();
	}

	@Test
	public void testDump() {
		assertSame("  Node at 0, 0, 2: Empty", tree.FLYLEAF.dump(0, 0, 2, 2));
	}

}
