
public class LinkedList
{
	LinkedList next;
	int value;

	public LinkedList(int value, LinkedList next)
	{
		this.value = value;
		this.next = next;
	}

	public void setNext(LinkedList next)
	{
		this.next = next;
	}

	public LinkedList getNext()
	{
		return next;
	}

	public boolean hasNext()
	{
		return next == null;
	}
}
