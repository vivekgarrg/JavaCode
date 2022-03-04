

import java.util.*;

public class TreeUse {
	
	
	public static BinaryTreeNode<Integer> takeInputLevelWIse(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData =  s.nextInt();
		if(rootData == -1)
			return null;
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.add(root);
		
		while(!pendingNodes.isEmpty())
		{
			BinaryTreeNode<Integer> node = pendingNodes.peek();
			pendingNodes.remove();
			
			System.out.println("Enter the left child of "+node.data);
			int leftData =  s.nextInt();
			
			if(leftData!=-1)
			{
				BinaryTreeNode<Integer>  leftChild = new BinaryTreeNode<>(leftData);
				pendingNodes.add(leftChild);
				node.left =  leftChild;
			}
			
			System.out.println("Enter the right child of "+node.data);
			int rightData =  s.nextInt();
			
			if(rightData!=-1)
			{
				BinaryTreeNode<Integer>  rightChild = new BinaryTreeNode<>(rightData);
				pendingNodes.add(rightChild);
				node.right =  rightChild;
			}
		}
		
		return root;
		
	}
	
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null)
			return;
		
		
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);
		
		while(!pendingNodes.isEmpty()) {
			String str = "";
			BinaryTreeNode<Integer> front = pendingNodes.peek();
			str += front.data + "";
			pendingNodes.remove();
			
			
			if(front.left != null) {
				str += ": L:"+front.left.data+",";
			   pendingNodes.add(front.left);
			}
			if(front.right != null) {
				str += ": R:"+front.right.data;
				pendingNodes.add(front.right);
			}
			
			System.out.println(str);
		}
	
	}

	public static void print(BinaryTreeNode<Integer> root) {
		if(root == null)
			return;
		String str = root.data + "";
		
		if(root.left != null)
		{
			str += ": L" + root.left.data+ "," ;
		}
		if(root.right != null) {
			str += "R :"+ root.right.data;
		}
		
		System.out.println(str);
		print(root.left);
		print(root.right);
		
	}
	
	
	public static BinaryTreeNode<Integer> takeInput(Scanner s){
		System.out.println("Enter root data: ");
		int data = s.nextInt();
		if(data == -1)
			return null;
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
        root.left =  takeInput(s);
        root.right =  takeInput(s);
        
        return root;
		
	}

	
	public static int countNodes(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return 0;
		
		int ans = 1;
		ans += countNodes(root.left);
		ans += countNodes(root.right);
		
		return ans;
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputLevelWIse();
		printLevelWise(root);
		System.out.print("Total Number of Nodes: "+countNodes(root));
		
	}

}
