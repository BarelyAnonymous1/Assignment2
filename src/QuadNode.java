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
public interface QuadNode
{
	public void traverse(QuadNode root);
	public LinkedNode remove(QuadNode root);
	public LinkedList getElement();
	public void setElement(LinkedList list);
	public void dump(QuadNode root);
	public LinkedNode find(QuadNode root);
	public void insert(QuadNode root);
	
}