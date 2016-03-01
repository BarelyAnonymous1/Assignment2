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
public class QuadTreeTest extends TestCase {

	/**
	 * generates points to add
	 */
	private Point point1, point2, point3, point4;
	private QuadTree tree;
	@Before
	public void setUp() throws Exception {
		point1 = new Point("a", 1, 20);
		point2 = new Point("b", 10, 30);
		point3 = new Point("c", 140, 10);
		point4 = new Point("d", 200, 200);
		tree = new QuadTree();
	}

	@Test
	public void testInsert() {
		tree.insert(point1);
		tree.insert(point2);
		tree.insert(point3);
		tree.insert(point4);
		tree.insert(null);
		
	}

}
