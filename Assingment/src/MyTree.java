import java.util.ArrayList;
import java.util.List;

import interfaces.Tree;
import interfaces.TreeArithmetic;
import interfaces.TreeProperties;
import interfaces.TreeTraversals;
import simpletree.Position;
import simpletree.SimpleTree;


/**
 * @author put your unikey here
 * @author and your partner's unikey, if working in a pair
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int height(int maxDepth) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numLeaves() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numLeaves(int depth) {
		// TODO Auto-generated method stub
		return 0;
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
	public boolean isComplete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBalanced() {
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
		// TODO Auto-generated method stub
	}
	public List<E> preorder(Position<E> node, List<E> list) {

		if (node != null) {
			list.add(node.getElement());
			for (int i = 0; i < numChildren(node); i++) {
				preorder(node.getChildren().get(i), list);
			}
		}
		return list;
	}

	@Override
	public List<E> postOrder() {
		List<E> list = new ArrayList<E>();
		return postorder(this.root(), list);

		// TODO Auto-generated method stub
	}
	public List<E> postorder(Position<E> node, List<E> list) {
		if (node != null) {
			for (int i = 0; i < numChildren(node); i++) {
				postorder(node.getChildren().get(i), list);
			}
			list.add(node.getElement());

			
		}
		
	return list; 
	}


	@Override
	public List<E> inOrder() {
		
		// TODO Auto-generated method stub
		return null;
	}

}
