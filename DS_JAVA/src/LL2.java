import java.util.Scanner;

public class LL2 {
	
	
	//printing function
	public static void print(Node head) {
		Node<Integer> temp = head;
		int count = 0;
		while(temp != null)
		{
			count++;
			System.out.print(temp.data + " ");
			temp = temp.next;
			
		}
		System.out.println("Length:"+count);
	}
	
	
	//TakeInput Function
	public static Node<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> head  = null;
		Node<Integer> tail = null;
		
		while(data != -1)
		{
			Node<Integer> currentNode = new Node<>(data);
			if(head == null)
			{
				head = currentNode;
				tail = currentNode;
			}
			else
			{
				tail.next = currentNode;
				tail = tail.next;
			}
		
			data = sc.nextInt();
		}
		
		
		return head;
	}
	
	
	//Insert Function
	public static Node<Integer> inser(Node<Integer> head, int elem, int pos)
	{
		Node<Integer> newNode =  new Node<>(elem);
		int count =0;
		Node<Integer> prev = head;
		if(pos == 0)
		{
			newNode.next = head;
			head = newNode;
			return head;
		}
		
		while(count < pos-1 && prev !=null)
		{
			count++;
			prev = prev.next;
		}
		newNode.next  = prev.next;
		prev.next = newNode;
		
		return head;
	}
	
	//deleting  a Node from ith position
	public static Node<Integer> delete(Node<Integer> head, int pos)
	{
		int count =0;
		Node<Integer> prev = head;
		Node<Integer> curr = head;
		if(pos == 0)
		{
			head = head.next;
		}
		while(count<pos-1)
		{
			count++;
			prev = prev.next;
		}
		curr = prev.next;
		prev.next = curr.next;
		
		return head;
	}
	
	//Print nodes recursively
	public static void printR(Node<Integer> head)
	{
		
		if(head == null)
			return;
		
		
		System.out.print(head.data + " ");
		printR(head.next);
	}
	
	//Insert Recursively
	public static Node<Integer> insertR(Node<Integer> head, int elem, int pos)
	{
		//If the position is greater than the length of the list
		if(head == null && pos>0)
		{
			return head;
		}
		if(pos==0)
		{
			Node<Integer> newNode = new Node<>(elem);
			newNode.next  = head;
			return newNode;	
		}
		else
		{
			Node<Integer> smallerHead = insertR(head.next,elem,pos-1);
           head.next = smallerHead;		
   		     
           return head;
		}

	}
	
	//Delete recursively
	
	public static Node<Integer> deleteR(Node<Integer> head, int pos)
	{
		if(pos == 0)
		{
			head = head.next;
			return head;
		}
		else
		{
			Node<Integer> smallerHead = deleteR(head.next,pos-1);
			head.next = smallerHead;
			return head;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
//		head = insertR(head,20,0);
		head = deleteR(head,2);
		printR(head);
	}

}
