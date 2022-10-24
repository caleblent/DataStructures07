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
// I don't think I actually need these 2 methods
//	public void insertLeft(AnimalNode top, String newAnimal, String newQuestion) {
//		// 1. new left node (with top node data)
//		// 2. new right node (with new, user inputed animal data)
//		// 3. update data in top node
//		
//		AnimalNode left = new AnimalNode(null, top.getData(), null);
//		AnimalNode right = new AnimalNode(null, newAnimal, null);
//		top.setLeft(left);
//		top.setData(newQuestion);
//		top.setRight(right);
//	}
//	
//	public void inserRight(AnimalNode top, String newAnimal, String newQuestion) {
//		// 1. new right node (with top node data)
//		// 2. new left node (with new, user inputed animal data)
//		// 3. update data in top node
//		
//		AnimalNode right = new AnimalNode(null, top.getData(), null);
//		AnimalNode left = new AnimalNode(null, newAnimal, null);
//		top.setLeft(left);
//		top.setData(newQuestion);
//		top.setRight(right);
//	}

} //