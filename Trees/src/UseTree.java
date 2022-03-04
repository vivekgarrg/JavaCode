import java.util.Scanner;

public class UseTree {

	
	//Taking input recursively
	public static TreeNode<Integer> takeInput(){
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the node data");
		n= s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter the child of: "+n);
		int childCount = s.nextInt();
		for(int i=0; i<childCount; i++)
		{
			TreeNode<Integer> child = takeInput();
			root.children.add(child);
		}
		return root;
		
	}
	
	
	public static TreeNode<Integer> inputLevelWise()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Root data: ");
		int rootData = s.nextInt();
		
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty())
		{
			TreeNode<Integer> frontNode = pendingNodes.dequeue();
			System.out.println("Enter the number of children of :"+ frontNode.data);
			int numChildren = s.nextInt();
			for(int i=0; i<numChildren; i++)
			{
				System.out.println("Enter the "+(i+1)+"th child of : "+frontNode.data);
				int child = s.nextInt();
				
				TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				root.children.add(childNode);
				pendingNodes.enqueue(childNode);
				
			}
		}
		return root;
	}
	
	public static void print(TreeNode<Integer> root)
	{
		String s = root.data+" : ";
		for(int i=0; i<root.children.size(); i++)
		{
			s += root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0; i<root.children.size();i++)
		{
			print(root.children.get(i));
		}
		
	}

	public static void printLevelWise(TreeNode<Integer> root)
	{
		if(root == null)
			System.out.println("No node is found..");
		else {
		
			
			System.out.println(root.data);
			QueueUsingLL<TreeNode<Integer>> remChild = new QueueUsingLL<>();
		    remChild.enqueue(root);
			
		    while(!remChild.isEmpty())
		    {
		    	
			int numChild = root.children.size();
			remChild.dequeue();
			for(int i=0; i<numChild; i++)
			{
				System.out.println((i+1)+" th child of :"+root.data+"is  ==>"+root.children.get(i).data);
				remChild.enqueue(root.children.get(i));
			}
		    }
		}
	}
	public static void main(String[] args) {
		
//		TreeNode<Integer> root = takeInput();
		
//		print(root);
		
		
		int arr[]= new int[10];
		int arr1[] = new int[20];
		
		System.out.println(arr.toString());
		System.out.println(arr1);
		String str = new String("Vivek");
		
		Integer a = 10;
		str = Integer.toString(10);
		
		System.out.println(str);
		TreeNode<Integer> root = inputLevelWise();
		printLevelWise(root);
		
		
		
		
		
		
//		TreeNode<Integer> root = new TreeNode<Integer>(4);
//		TreeNode<Integer> node1 = new TreeNode<Integer>(2);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(3);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(5);
//		TreeNode<Integer> node4= new TreeNode<Integer>(6);
//		
// 
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		node2.children.add(node4);
//		
//		System.out.println(root);
	}

}
