
public class Node<E>
{
	private Node<E> next;
	private E value;

	public Node(E value, Node<E> next)
	{
		this.value = value;
		this.next = next;
	}

	public void setNext(Node<E> next)
	{
		this.next = next;
	}

	public Node<E> getNext()
	{
		return next;
	}

	public boolean hasNext()
	{
		return next != null;
	}

	public void setValue(E value)
	{
		this.value = value;
	}

	public E getValue()
	{
		return value;
	}

//	public boolean equals(Node<E> element)
//	{
//		return element.getValue().equals(value) && element.getNext().equals(next);
//	}
}
