import java.util.Scanner;


public class LL1 {
	
//	public static Node<Integer> createLinkedList(){
//		Node<Integer> n1 = new Node<>(20);
//		Node<Integer> n2 = new Node<>(30);
//		Node<Integer> n3 = new Node<>(40);
//		Node<Integer> n4 = new Node<>(50);
//		Node<Integer> n5 = new Node<>(60);
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		n4.next = n5;
//		
//		return n1;
//	}
 
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
//	public static void increment(Node<Integer> head)
//	{
//		while(head != null)
//		{
//			head.data++;
//			head = head.next; 
//		}
//		
//	}
	
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
	public static void main(String[] args) {
 		
//		Node<Integer> head = createLinkedList();
//		increment(head);
		
		Node<Integer> head = takeInput();
		print(head);
		
//       Node<Integer> n1 = new Node<>(10);
//       
//      System.out.println(n1.data);
//      System.out.println(n1.next);
//      System.out.println(n1);
//      Node<Integer> n2 = new Node<>(20);
//      n2.next = n1;
//      System.out.println(n2.next);
	}

}
