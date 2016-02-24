import student.TestCase;

/**
 * tests the methods in the database
 * @author Jonathan DeFreeuw (jondef95) Preston Lattimer (platt)
 * @version 1
 */
public class DatabaseTest extends TestCase
{
    private Database<String, Integer> base;

    /**
     * creates the database used in testing
     */
    public void setUp()
    {
        base = new Database<String, Integer>();
    }

    /**
     * tests basic methods
     */
    public void test()
    {
        base.regionSearch(4);
        assertNull(base.removeKey("hello"));
    }

}
