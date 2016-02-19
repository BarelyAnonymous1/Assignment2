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
	private SkipList<K, E> list;
	private QuadTree tree
	
	public Database()
	{
		list = new SkipList<K, E>();
		tree = new QuadTree();
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
	public E removeKey(K key)
	{
		return null;
	}
	/**
	 * 
	 * @param val is the value to be found
	 */
	public E removeValue(E val)
	{
		return null;
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
	public void dump()
	{
		System.out.println("SkipList dump:");
		list.dump();
		System.out.println("QuadTree dump:");
		tree.dump();
	}
	
	/**
	 * not implemented
	 */
	public SkipNode<K, E> search(K key)
	{
		return null;
	}
	
	/**
	 * not implemented
	 */
	public void regionSearch(E region){};
}
