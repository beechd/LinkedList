
public class LinkedList<E>
{
	private Node<E> head;
	private int size = 1;

	public LinkedList(Node<E> head)
	{
		this.head = head;
	}

	public void setHead(Node<E> head)
	{
		this.head = head;
	}

	public Node<E> getHead()
	{
		return head;
	}

	public void add(Node<E> element)
	{
		Node<E> current = head;
		while (current.hasNext())
		{
			current = current.getNext();
		}
		current.setNext(element);
		size++;
	}

	public void remove()
	{
		remove(0);
	}

	public void remove(int index)
	{
		if (head == null)
		{
			return;
		}
		Node<E> current = head;

		if (index == 0)
		{
			head = current.getNext();
		}

		for (int i = 0; current != null && i < index - 1; i++)
		{
			current = current.getNext();
		}

		if (current == null || current.getNext() == null)
		{
			return;
		}

		Node<E> next = current.getNext().getNext();

		current.setNext(next);
	}

	public int getSize()
	{
		int size = 1;
		Node<E> current = head;
		while (current.hasNext())
		{
			size++;
			current = current.getNext();
		}
		return size++;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	public static <E> void printLinkedList(LinkedList<E> list)
	{
		Node<E> current = list.getHead();
		while (current.hasNext())
		{
			System.out.print(current.getValue() + ", ");
			current = current.getNext();
		}
		System.out.println(current.getValue());
	}
}
