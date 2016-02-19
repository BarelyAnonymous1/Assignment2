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
	
	/**
	 * 
	 * @param pair is the value to be inserted
	 */
	public void insert(KVPair pair)
	{
		/** not yet implemented
		 * 
		 */
	}
	
	/**
	 * not yet implemented
	 * @param key is the key to be searched
	 */
	public E remove(K key)
	{
		return null;
	}
	/**
	 * 
	 * @param val is the value to be found
	 */
	public void remove(E val)
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
