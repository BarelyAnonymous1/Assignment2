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
public class LinkedListTest extends TestCase {

	private LinkedList list;
	private Point point1, point2, point3, point4;
	@Before
	public void setUp() {
		list = new LinkedList();
		point1 = new Point("a", 1, 20);
		point2 = new Point("b", 10, 30);
		point3 = new Point("c", 140, 10);
		point4 = new Point("d", 200, 200);
	}

	/**
	 * tests the insert method
	 */
	public void testInsert() {
		list.insert(point1);
		list.insert(point2);
		assertEquals(2, list.getSize());
	}
	
	public void testOutputDuplicates()
	{
		list.insert(point1);
		list.insert(point2);
		list.insert(point1);
		list.insert(point1);
		list.outputDuplicates();
		assertTrue(systemOut().getHistory().endsWith("(1, 20)\n"));
	}
	

}
