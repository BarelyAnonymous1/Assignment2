/**
 * 
 */

/**
 * @author prestonlattimer
 *
 */
public class QuadTree {

	/**
	 * @param args
	 */
	
	private int level;
	
	public QuadTree() 
	{
		level = 0;
	}

	
	
    /**
     * output a list of every item in the list in the following
     * format: 
     * "Node at 0, 0, 1024: Empty"
     */
    public void dump()
    {
        System.out.println("SkipList dump:");
        SkipNode<K, E> current = head;
        while (current != null)
        {
            String name = "";
            if (current.getValue() == null)
            {
                name = "null";
            }
            else
            {
                name = current.getPair().toString();
            }
            System.out.println("Node has depth " + current.getLevel()
                    + ", Value (" + name + ")");

            current = current.next[0];
        }
        System.out.println("SkipList size is: " + size);
    }
}
