/** 
 * 
 */

/**
 * @author prestonlattimer
 *
 */
public class Database<K extends Comparable<K>, E> {

	
	/**
	 * creates the skipList for the database
	 */
	private SkipList list;
	
	public Database()
	{
		list = new SkipList();
	}
	
	public void insert()
	{
		/** not yet implemented
		 * 
		 */
	}
	
	/**
	 * not yet implemented
	 */
	public void remove()
	{
		// not implemented
	}
	/**
	 * not implemented
	 */
	public void duplicates()
	{
		//not yet implemented
	}
	
	/**
	 * not implemented
	 */
	public void dump(){};
	
	/**
	 * not implemented
	 */
	public void search(){};
	
	/**
	 * not implemented
	 */
	public void regionsearch(){};
}
