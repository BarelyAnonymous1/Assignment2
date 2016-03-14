import student.TestCase;

/**
 * @author CS3114 staff
 * @version 2
 */
public class Point2Test extends TestCase
{

    /**
     * This method sets up the tests that follow.
     */
    public void setUp()
    {
    }

    // ----------------------------------------------------------

    // ----------------------------------------------------------
    /**
     * Test command parser syntax on mostly bad input
     *
     * @throws Exception
     */
    public void testSyntax1() throws Exception
    {
        Point2 testClass = new Point2();
        String[] args = new String[1];
        args[0] = "P2SyntaxTest1.txt";
        Point2.main(args);
        assertEquals("Point rejected: (r_r, -1, -20)\n"
                + "Point rejected: (rec, 7, -8)\n" + "Duplicate points:\n"
                + "SkipList dump:\n" + "Node has depth 1, Value (null)\n"
                + "SkipList size is: 0\n" + "QuadTree dump:\n"
                + "Node at 0, 0, 1024: Empty\n"
                + "1 quadtree nodes printed\n" + "Point not found: r_r\n"
                + "Point not removed: r_r\n" + "Point rejected: (1, -1)\n"
                + "Point not found: (1, 1)\n"
                + "Points intersecting region (-5, -5, 20, 20):\n"
                + "1 quadtree nodes visited\n"
                + "Rectangle rejected: (5, 5, 4, -2)\n",
                systemOut().getHistory());
    }

    // ----------------------------------------------------------
    /**
     * Simple test of all the "good" command outputs
     *
     * @throws Exception
     */
    /**public void testSyntax2() throws Exception
    {
        System.out.println("");
        System.out.println("");
        String[] args = new String[1];
        args[0] = "P2SyntaxTest2.txt";
        Point2.main(args);
        assertTrue(systemOut().getHistory()
                .endsWith("SkipList size is: 2\n" + "QuadTree dump:\n"
                        + "Node at 0, 0, 1024:\n" + "far, 200, 200\n"
                        + "r_42, 1, 20\n" + "1 quadtree nodes printed\n"));
    }*/
    
    public void testSyntax3() throws Exception
    {
        System.out.println("");
        System.out.println("");
        String[] args = new String[1];
        args[0] = "test.txt";
        Point2.main(args);
        assertTrue(systemOut().getHistory()
                .endsWith("Point not removed: r_r\n"
                        + "Point removed: (a, 1, 1)\n"
                        + "Point rejected: (1, -2)\n"
                        + "Point removed: (inExistRec_0, 1, 1)\n"));
    }
}
