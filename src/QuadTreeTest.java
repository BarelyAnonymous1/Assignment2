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
		tree.dump();
		assertEquals(
			  "QuadTree dump:\n"
			+ "Node at 0, 0, 1024: Internal\n"
			+ "  Node at 0, 0, 512: Internal\n"
			+ "    Node at 0, 0, 256: Internal\n"
			+ "      Node at 0, 0, 128:\n"
			+ "      (a, 1, 20)\n"
			+ "      (b, 10, 30)\n"
			+ "      Node at 128, 0, 128:\n"
			+ "      (c, 140, 10)\n"
			+ "      Node at 0, 128, 128: Empty\n"
			+ "      Node at 128, 128, 128:\n"
			+ "      (d, 200, 200)\n"
			+ "    Node at 256, 0, 256: Empty\n"
			+ "    Node at 0, 256, 256: Empty\n"
			+ "    Node at 256, 256, 256: Empty\n"
			+ "  Node at 512, 0, 512: Empty\n"
			+ "  Node at 0, 512, 512: Empty\n"
			+ "  Node at 512, 512, 512: Empty\n"
			+ "13 quadtree nodes printed\n", 
			systemOut().getHistory());
	}
	public void testDuplicates() {
		tree.insert(point1);
		tree.insert(point2);
		tree.insert(point3);
		Point point5 = new Point("a", 1, 20);
		Point point6 = new Point("a", 2, 30);
		Point point7 = new Point("d", 1, 20);
		Point point8 = new Point("e", 140, 10);
		tree.insert(point5);
		tree.insert(point6);
		tree.insert(point7);
		tree.insert(point8);
		tree.duplicates();
		assertEquals("(1, 20)\n(140, 10)\n", systemOut().getHistory());
		
	}
	
	public void testRemove() {
		tree.remove(point1, true);
		tree.remove(point1, false);
		tree.insert(point1);
		tree.dump();
		tree.remove(point1, true);
		tree.dump();
		tree.insert(point1);
		tree.insert(point2);
		tree.insert(point3);
		tree.insert(point4);
		tree.dump();
		tree.remove(point1, false);
		tree.dump();
		
	}

}
