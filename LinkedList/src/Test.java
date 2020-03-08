
public class Test
{
	public Test()
	{
		Node<Integer> next4 = new Node<Integer>(5, null);
		Node<Integer> next3 = new Node<Integer>(4, next4);
		Node<Integer> next2 = new Node<Integer>(3, next3);
		Node<Integer> next1 = new Node<Integer>(2, next2);
		Node<Integer> next = new Node<Integer>(1, next1);
		Node<Integer> head = new Node<Integer>(0, next);
		LinkedList<Integer> list = new LinkedList<Integer>(head);

		LinkedList.printLinkedList(list);
		list.add(new Node<Integer>(6, null));
		LinkedList.printLinkedList(list);
		list.remove();
		LinkedList.printLinkedList(list);
	}

	public static void main(String[] args)
	{
		new Test();
	}
}
