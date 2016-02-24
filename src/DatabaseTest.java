import student.TestCase;

/**
 * 
 */

/**
 * @author prestonlattimer
 *
 */
public class DatabaseTest extends TestCase
{
    private Database<String, Integer> base;

    public void setUp() throws Exception
    {
        base = new Database<String, Integer>();
    }

    public void test()
    {
        assertNull(base.removeKey("hello"));
    }

}
