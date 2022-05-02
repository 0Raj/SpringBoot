package TreePractice;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		TreeNode myTreeNode = new TreeNode(10);
		myTreeNode.left = new TreeNode(20);
		myTreeNode.left.left = new TreeNode(40);
		myTreeNode.right = new TreeNode(30);
		myTreeNode.right.right = new TreeNode(60);
		myTreeNode.left.right = new TreeNode(50);
		myTreeNode.left.right.left = new TreeNode(70);
		myTreeNode.left.right.right = new TreeNode(80);
		myTreeNode.left.right.right.left = new TreeNode(90);
		
		//List<Integer> result = findPreOrder(myTreeNode);
		
		int heightOftree = findHight(myTreeNode);
		//System.out.println(heightOftree);
		
		for(int i=0; i<heightOftree; i++) {
			findKthElements(myTreeNode,0,i);
			//System.out.println();
		}
		
		
		

	}

	private static void findKthElements(TreeNode myTreeNode, int i,int k) {
		if(myTreeNode ==  null) {
			return;
		}
		if(i == k) {
			System.out.print(myTreeNode.value+" ");
			return;
		}
		
		findKthElements(myTreeNode.left, i+1, k);
		findKthElements(myTreeNode.right, i+1, k);
		
	}

	private static int findHight(TreeNode myTreeNode) {
		
		if(myTreeNode == null) {
			return 0;
		}
		
		return 1+Math.max(findHight(myTreeNode.left),findHight(myTreeNode.right));
	}

	private static List<Integer> findPreOrder(TreeNode myTreeNode) {
		List<Integer> list = new ArrayList<>();
		if(myTreeNode == null) {
			return list;
		}
		
		list.add(myTreeNode.value);
		
		List<Integer> leftList = findPreOrder(myTreeNode.left);
		list.addAll(leftList);
		
		List<Integer> rightList = findPreOrder(myTreeNode.right);
		list.addAll(rightList);
		
		return list;
	}

}
