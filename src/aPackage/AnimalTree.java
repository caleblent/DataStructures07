package aPackage;

/**
 * Simple Binary Tree implementation
 * Missing lots of functionality (which we will add when we get to Binary Search Trees)
 * No sentinel nodes in this version
 * @author N Gossett, modified
 * @version Fall 2022
 * @param String: Data being stored in nodes
 */
public class AnimalTree {

	// the only attribute we need for the Binary Tree class:
	private AnimalNode root;
	
	/**
	 * Construct an AnimalTree from scratch
	 */
	public AnimalTree() {
		root = new AnimalNode(null, null, null);
	}
	
	/**
	 * Construct an AnimalTree from root data
	 */
	public AnimalTree(String rootData) {
		root = new AnimalNode(null, rootData, null);
	}
	
	/**
	 * Construct an AnimalTree from a root AnimalNode
	 */
	public AnimalTree(AnimalNode root) {
		this.root = root;
	}
	
	/**
	 * construct a tree from AnimalNodes
	 */
	public AnimalTree(AnimalNode leftNode, String rootData, AnimalNode rightNode)
	{
		this();
		root.setLeft(leftNode);
		root.setData(rootData);
		root.setRight(rightNode);
	}
	
	/**
	 * construct a tree from AnimalTrees
	 */
	public AnimalTree(AnimalTree leftTree, String rootData, AnimalTree rightTree)
	{
		this();
		root = new AnimalNode(null, rootData, null);
		if (leftTree != null) { root.setLeft(leftTree.root); }
		if (rightTree != null) { root.setRight(rightTree.root);}
	}
	
	public int size() {
		return size(root);
	}
	
	private int size(AnimalNode root) {
		if (root == null) { return 0; }
		return 1 + size(root.getLeft()) + size(root.getRight());  
	}

	public int height() {
		return height(root);
	}
	
	private int height(AnimalNode root) {
		if (root == null) { return -1; }
		return 1 + Math.max(height(root.getLeft()), height(root.getRight()));
	}
	
	public AnimalNode getRoot() {
		return this.root;
	}
	
	public void printInOrderTraversal(AnimalNode node) {
		if (node.getLeft() != null)
			printPreOrderTraversal(node.getLeft());
		System.out.print("<<" + node.getData() + ">> ");
		if (node.getRight() != null)
			printPreOrderTraversal(node.getRight());
	}
	
	public void printPreOrderTraversal(AnimalNode node) {
		System.out.print("<<" + node.getData() + ">> ");
		if (node.getLeft() != null)
			printPreOrderTraversal(node.getLeft());
		if (node.getRight() != null)
			printPreOrderTraversal(node.getRight());
	}
	
	public void printPostOrderTraversal(AnimalNode node) {
		if (node.getLeft() != null)
			printPreOrderTraversal(node.getLeft());
		if (node.getRight() != null)
			printPreOrderTraversal(node.getRight());
		System.out.print("<<" + node.getData() + ">> ");
	}

} //