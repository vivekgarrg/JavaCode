
public class linList {

	public static void main(String[] args) {
		Node<Integer> node1 = new Node<Integer>(20);
		Node<Integer> node2 = new Node<Integer>(30);
		Node<Integer> node3 = new Node<Integer>(40);
		Node<Integer> node4 = new Node<Integer>(50);
		Node<Integer> node5 = new Node<Integer>(60);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
	final	Node<Integer> head = node1;
//		while(head!=null)
//		{
//			System.out.println(head.data + " ");
////			head = head.next;
//		}
		System.out.println(head);

	}

}
