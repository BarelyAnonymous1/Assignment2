/**
 * Node used to implement the SkipList; takes a KVPair and stores it
 * 
 * @author Preston Lattimer (platt), Jonathan DeFreeuw (jondef95)
 * 
 * @param <K>
 *            the generic key value for the KVPair
 * @param <E>
 *            the generic data value for the KVPair
 * @version 1
 *
 */
public interface QuadNode<K extends Comparable<K>, E>
{
	public void traverse(QuadNode<K, E> root);
	public LinkedNode<K, E> remove(QuadNode<K, E> root);
	public LinkedList<K, E> getElement();
	public void setElement(LinkedList<K, E> list);
	public void dump(QuadNode<K, E> root);
	public LinkedNode<K, E> find(QuadNode<K, E> root);
	public void insert(QuadNode<K, E> root);
	LinkedNode remove(QuadNode<K, E> root);
	
}