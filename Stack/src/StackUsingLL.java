

class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		next = null;
	}
}
 class Stack {
private int size;
private Node head;

Stack()
{
	size = 0;
	head = null;
}

int size()
{
	return size;
}
void push(int data)
{
	Node newNode = new Node(data);
	size++;
	if(head == null)
	{
		head = newNode;
	}
	else {
		newNode.next = head;
		head = newNode;
	}
}

int pop()
{
	if(head == null)
	{
	 System.out.println("Stack is empty");
	}
	else {
		size--;
	int answer = head.data;
	head = head.next;
	return answer;
	}
	return 0;
}

int top()
{
	if(head!=null)
	return head.data;
	
	return -1;
}
boolean isEmpty(){
	if(head == null)
		return true;
	
	return false;
	
}
}
 
 public class StackUsingLL{
	 public static void main(String args[])
	 {
		 Stack s = new Stack();
		 s.push(10);
		 s.push(20);
		 s.push(30);
		 
		 System.out.println(s.pop());
		 System.out.println(s.pop());
		 System.out.println(s.size());
		 System.out.println(s.top());
		 System.out.println(s.isEmpty());
		 System.out.println(s.pop());
		 
		 System.out.println(s.size());
		 System.out.println(s.top());
		 System.out.println(s.isEmpty());
	 }
 
 }
