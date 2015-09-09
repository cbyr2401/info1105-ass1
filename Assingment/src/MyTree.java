import java.util.ArrayList;
import java.util.List;

import interfaces.Tree;
import interfaces.TreeArithmetic;
import interfaces.TreeProperties;
import interfaces.TreeTraversals;
import simpletree.Position;
import simpletree.SimpleTree;


/**
 * @author njay####
 * @author cbyr2401
 * 
 * This class, MyTree, should be your solution to the assignment
 * It should remain in the (default package)
 * 
 * Implement as many of the required methods as you can.
 */

public class MyTree<E extends Comparable<E>> extends SimpleTree<E> implements
				TreeTraversals<E>,      //PART 1
				TreeProperties,         //PART 2
				Comparable<Tree<E>>,    //PART 3 (only if enrolled in INFO1105)
				//BalancedBST<E>,       //PART 3 (only if enrolled in INFO1905)
				TreeArithmetic          //PART 4
{

	//constructor
	public MyTree() {
		super(); //call the constructor of SimpleTree with no arguments
	}

	@Override
	public int compareTo(Tree<E> other) {
		//TODO: implement this method if enrolled in INFO1105
		// compare the tree with another tree
		// check the structure and values of the trees:
		// a) Check the positions left-to-right, top to bottom (i.e. root, then depth 1, then depth 2, etc.)
		// b) If this tree has a position that the other tree does not, return 1.
		// c) If the other tree has a position that this one does not, return -1.
		// d) If the position is in both trees, then compare the values (return if the difference is not 0)
		return 0;
	}

	@Override
	public boolean isArithmetic() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double evaluateArithmetic() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getArithmeticString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int height() {
		if (this.root() == null)
			return -1;   
		return height(this.root()); 
		
		// TODO Auto-generated method stub	
	}
	
	public int height (Position <E> position ) {
		int maxHeight = 0;
		int subtree = 0; 
		
		if (numChildren(position) == 0 ) {
			return 0;
		}
		else {
			
		for (int i = 0; i < numChildren(position); i++) {
			
		subtree = 1 + height(position.getChildren().get(i) );
		
		if (subtree > maxHeight) 
			maxHeight = subtree; 
		}
	
			return maxHeight;  
		}
		
			
	}
	
	public boolean hasChildren(Position <E> position) {
		if (numChildren(position) == 0)
			return false; 
		else 
			return true; 
	}
		
	
	@Override
	public int height(int maxDepth) {
		if (this.root() == null)
			return -1;   
		else
		return height(this.root(), maxDepth); 
	
		// TODO Auto-generated method stub
		
	}
	
	public int height(Position <E> position, int maxDepth) {		
		int maxHeight = 0;
		int subtree = 0;

		if (numChildren(position) == 0 ) {
			return 0;
		}else {
			for (int i = 0; i < numChildren(position); i++) {
				subtree = 1 + height(position.getChildren().get(i), maxDepth );
				if (subtree >= maxDepth) {
					return maxDepth;
				}
				if (subtree > maxHeight) 
					maxHeight = subtree; 
				}
			return maxHeight;  
		}
	}

	@Override
	public int numLeaves() {
		if (this.root() == null)
			return 0; 
		else if (!hasChildren(this.root())) 
			return 1; 
		else return numLeaves(this.root()); 
		// TODO Auto-generated method stub
		
	}

	public int leaves; 
	public int numLeaves(Position <E> position) {
		int subtree; 
		
		if (numChildren(position) == 0 ) {
			leaves++; 
			return 0;
		}
		for (int i = 0; i < numChildren(position); i++) {
		subtree = 1 + numLeaves(position.getChildren().get(i));
			}
		return leaves; 
	}
	
	
	@Override
	public int numLeaves(int depth) {

		if (this.root() == null)
			return 0; 
		else if (!hasChildren(this.root())) 
			return 1; 
		else return numLeaves(this.root(), depth); 
		//System.out.println(leaves); 
		
		// TODO Auto-generated method stub
		
	}
	
	public int numLeaves(Position <E> position, int depth) {
		int subtree; 
		System.out.println("hey");
		if (numChildren(position) == 0 ) {
			leaves++; 
			return 0;
		}
		subtree = 1 + numLeaves(position.getChildren().get(0), depth);
	//	for (int i = 0; i < numChildren(position); i++) {
			
	
	//	
		//System.out.println("hey");
		
	//		}
		
		
		return leaves; 
	}
	
	
	
	
	
	

	@Override
	public int numPositions(int depth) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isBinary() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isProperBinary() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCompleteBinary() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBalancedBinary() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHeap(boolean min) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBinarySearchTree() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<E> preOrder() {
		List<E> list = new ArrayList<E>();
		return preorder(this.root(), list);
	}

	@Override
	public List<E> postOrder() {
		List<E> list = new ArrayList<E>();
		return postorder(this.root(), list);
	}

	@Override
	public List<E> inOrder() {
		List<E> list = new ArrayList<E>();
		return inorder(this.root(), list);
	}
	
	// EXTRA traversal methods, allowing for recursion:
	/*
	 * Preorder traversal method:
	 */
	public List<E> preorder(Position<E> node, List<E> list) {
		if (node != null) {
			list.add(node.getElement());
			for (int i = 0; i < numChildren(node); i++) {
				preorder(node.getChildren().get(i), list);
			}
		}
		return list;
	}
	
	/*
	 *  PostOrder traversal method:
	 */
	public List<E> postorder(Position<E> node, List<E> list) {
		if (node != null) {
			for (int i = 0; i < numChildren(node); i++) {
				postorder(node.getChildren().get(i), list);
			}
			list.add(node.getElement());
		}	
	return list; 
	}
	
	/*
	 * InOrder traversal method:
	 */
	public List<E> inorder(Position<E> node, List<E> list){
		if(isProperBinary()){
			if(node.getChildren().get(0) != null){
				inorder(node.getChildren().get(0), list);
			}
			list.add(node.getElement());
			if(node.getChildren().get(1) != null){
				inorder(node.getChildren().get(1), list);
			}
		}else{
			throw new UnsupportedOperationException();
		}
		
		return null;
	}

}
