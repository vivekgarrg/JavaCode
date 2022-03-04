
class Node<T>{
	T data;
	Node<T> next;
	
	Node(T data)
	{
		this.data = data;
		next = null;
	}
	
}
public class QueueUsingLL<T> {
	
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	QueueUsingLL()
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	int getsize() {
		return size;
	}
	
	T front()
	{
		return head.data;
	}
	
	void enqueue(T data)
	{
		Node<T> newNode = new Node<T>(data);
		size++;
		if(head == null)
		{
			head = newNode;
			tail = head;
		}else {
			tail.next = newNode;
			tail = tail.next;
		}
	}
	
	T dequeue()
	{
		if(head == null)
		{
			System.out.println("Queue is empty");
			return null;
		}else {
		T result = head.data;
		head = head.next;
		return result;
	
		}
		
	}
	
	boolean isEmpty()
	{
		if(head == null)
			return true;
		
		return false;
	}

}
