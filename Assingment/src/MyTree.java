import java.util.ArrayList;
import java.util.Arrays;
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
		
		/*
		 *  Check size:
		 *  	1. the same  ==> keep checking
		 *  	2. different
		 *  		a. this is bigger ==> return 1
		 *  		b. this is smaller ==> return -1
		 */
		int thisSize = this.size();
		int otherSize = this.size();

		if(thisSize > otherSize) return 1;
		else if(thisSize < otherSize) return -1;
		else {
			List<E> thisInOrder = this.inOrder();
			List<E> otherInOrder = this.inOrder();
			
			for(int i=0; i < thisSize; i++){
				int result = compareNodes(thisInOrder.get(i), otherInOrder.get(i));
			}
		}
		
		//List<E> thisInOrder = this.inOrder();
		//List<E> otherInOrder = this.inOrder();
		
		
		return 0;
	}
	
	private int compareNodes(E node, E other){
		
		
		return 0;
	}

	
	int NewCounter = 0;
	@Override
	public boolean isArithmetic() {
		NewCounter = 0;
		if (this.size() == 1) {
			if (intChecker(this.root()) == 1) {
				return true; 	
			}
			else return false; 	
		}
		if(root()==null || numChildren(root())==0 || !isProperBinary()){
			return false;
		}
		else if (operatorChecker(this.root()) != 1) {
			System.out.println("falseOperator");
			return false;
		}
		else if (intChecker(this.root()) != 1) {
		
			return false;
		} else
			return true;
	}

	// checker for internal nodes

	int counter = 0;
	int internalNodes = 0;

	public int operatorChecker(Position<E> node) {
		if (numChildren(node) == 0) {
			return 1;
		}
		if (numChildren(node) != 0) {
			internalNodes++;
			if (isOperator(node.getElement().toString())) {
				counter++;
			}
		}

		for (int i = 0; i < numChildren(node); i++) {
			numLeaves(node.getChildren().get(i));
		}

		// if counter == number of internal nodes return true
		if (counter == internalNodes)
			return 1;
		else
			return 0;

	}

	// checker for leaves
	

	
	public int intChecker(Position<E> node) {
		if (numChildren(node) == 0 && isNumeric(node.getElement().toString())) {
			NewCounter++;	
			return 1;			
		}
		else if (numChildren(node) == 0)
			return 1;
		
		for (int i = 0; i < numChildren(node); i++) {
		 intChecker(node.getChildren().get(i)); // subtree = 1 +
		}
		if (NewCounter == this.numLeaves())
			return 1;
		else 
			return 0;
	}

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static boolean isOperator(String str) {
		char[] array = new char[1];
		array = str.toCharArray();
		if (array.length > 1)
			return false;
		if (array[0] == '+' || array[0] == '-' || array[0] == '/'
				|| array[0] == '*')
			return true;
		else
			return false;
	}
		
	@Override
	public double evaluateArithmetic() {
		return evaluateArithmetic(this.root()); 
	}

	@Override
	public String getArithmeticString() {
		return infix(this.root());
	}

	@Override
	public int height() {
		if (this.root() == null)
			return -1;   
		return height(this.root()); 
	}	
	
	@Override
	public int height(int maxDepth) {
		if (this.root() == null)
			return -1;   
		else
			return height(this.root(), maxDepth); 
	}

	@Override
	public int numLeaves() {
		if (this.root() == null)
			return 0; 
		else if (!hasChildren(this.root())) 
			return 1; 
		else return numLeaves(this.root()); 		
	}
	
	@Override
	public int numLeaves(int depth) {
		if (this.root() == null)
			return 0; 
		else if (!hasChildren(this.root())) 
			return 1;
		else{
			return numLeaves(this.root(), depth);
		}		
	}
	
	@Override
	public int numPositions(int depth) {
		if (this.root() == null)
			return 0; 
		else if (!hasChildren(this.root())) 
			return 1;
		else{
			return numPositions(this.root(), depth);
		}
	}
	
	@Override
	public boolean isBinary() {
		if(root()==null){
			return true;
		}else{
			return isBinary(this.root());
		}		
	}

	@Override
	public boolean isProperBinary() {
		if(root()==null){
			return true;
		}else{
			return isProperBinary(this.root());
		}
	}

	@Override
	public boolean isCompleteBinary() {
		if(root()==null){
			return true;
		}
		if(numChildren(this.root())==0){
			return true;
		}else{
			int h = height();
			//for 'perfect' tree
			if(numLeaves(h)==Math.pow(2, h)) return true;
			return isCompleteBinary(this.root());
		}
	}
	
	

	@Override
	public boolean isBalancedBinary() {
		if(this.root() == null || !hasChildren(this.root())){
			return true;
		}else if(!isBinary()){
			return false;
		}else{
			// formula: h < 2log(n(h)) + 2, where h = height and n = internal entries / nodes
			double heightCal = 2*Math.log(size()-numLeaves()) + 2;
			int height = height();
			
			if(height >= heightCal){
				return false;
			}else{
				return isBalancedBinary(root());
			}
		}
	}

	int Ncounter = 0;

	@Override
	public boolean isHeap(boolean min) {
	
		if(root() == null) 
			return true;
		if (size() == 1 && intChecker(root()) == 1) {
			return true; 
		}
		else if(!isCompleteBinary()) {
			return false; 
		}
		else  {
			if (min == true)  {
				Ncounter = 0;
				System.out.println(isMinHeap(this.root()));
			return isMinHeap(this.root());
			} 
			if (min == false) {
				Ncounter = 0;
				System.out.println("yo");
			return isMaxHeap(this.root()); 
			}
			else
			return false;
		}
	}
	
	
	private boolean isMinHeap(Position <E> node) {
		try {
		if (!hasChildren(node))  {
			E childVal = node.getElement();
			E parentVal = node.getParent().getElement();

			if(parentVal.compareTo(childVal)==1)   {
				Ncounter++; 
				return false; 
			
		}
		}
		
		
			else {
			for (int i = 0; i < numChildren(node); i++) {
				if (isMinHeap(node.getChildren().get(i)) == false)
					return false; 
			}
			
		}
		} catch (NumberFormatException g) {
			System.out.println("hey");
			return false; 
		}

		if (Ncounter == 0)
		return true; 	
		else 
			return false;

	}

	private boolean isMaxHeap(Position <E> node) {
		try {
		if (!hasChildren(node))  {
			E childVal = node.getElement();
			E parentVal = node.getParent().getElement();
			if ( parentVal.compareTo(childVal)==-1 ) {
				System.out.println("hey");
				Ncounter++; 
				return false; 
			}
			
		}	else {
			for (int i = 0; i < numChildren(node); i++) {
				if (isMaxHeap(node.getChildren().get(i)) == false)
						return false; 
			}
			
		}
		if (Ncounter == 0)
		return true; 	
		else 
			return false; 
			}
			catch (NumberFormatException e) {
				return false; 
			}
	}

	@Override
	public boolean isBinarySearchTree() {
		if(root()==null || numChildren(root())==0){
			return true;
		}else if(!isBinary()){
			return false;
		}else{
			
			List<E> inorderList = inOrderBinary();
			List<String> comparisionList = new ArrayList<>();
			
			for(E element : inorderList){
				comparisionList.add(element.toString());
			}
			
			for(int i=0; i < comparisionList.size()-1; i++){
				if(comparisionList.get(i).compareTo(comparisionList.get(i+1))==1){
					return false;
				}
			}
			return true;
		}
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
		if(root()==null){
			return list;
		}else{
			if(isProperBinary()){
				return inorder(this.root(), list);
			}else{
				throw new UnsupportedOperationException();
			}
		}
		
	}
	
	
	
	// HELPER METHODS:
	/*
	 * checks if parent has children
	 */
	private boolean hasChildren(Position <E> position) {
		if (numChildren(position) == 0)
			return false; 
		else 
			return true; 
	}
	
	
	// EXTRA methods, allowing for recursion:
	/*
	 * Preorder traversal method:
	 */
	private List<E> preorder(Position<E> node, List<E> list) {
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
	private List<E> postorder(Position<E> node, List<E> list) {
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
	private List<E> inorder(Position<E> node, List<E> list){
		if(numChildren(node)>0 && node.getChildren().get(0) != null){
			inorder(node.getChildren().get(0), list);
		}
		list.add(node.getElement());
		if(numChildren(node)>1 && node.getChildren().get(1) != null){
			inorder(node.getChildren().get(1), list);
		}		
		return list;
	}
	
	/*
	 * int height() helper
	 */
	private int height (Position<E> position){
		int maxHeight = 0;
		int subtree = 0; 
		
		if (numChildren(position) == 0 ) {
			return 0;
		}else {	
		for(int i = 0; i < numChildren(position); i++) {
			subtree = 1 + height(position.getChildren().get(i));
		
			if (subtree > maxHeight) 
				maxHeight = subtree; 
			}
			return maxHeight;  
		}		
	}
	
	/*
	 *  int height(int maxDepth) helper
	 */
	private int height(Position <E> position, int maxDepth) {		
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
	
	/*
	 *  numLeaves() helper method:
	 */
	private int numLeaves(Position <E> position) {
		int leaves = 0;
		if (numChildren(position) == 0 ) {
			return 1;
		}
		for (int i = 0; i < numChildren(position); i++) {
			leaves += numLeaves(position.getChildren().get(i)); //subtree = 1 + 
		}
		return leaves; 
	}
	
	/*
	 * numLeaves(int maxDepth) helper method.
	 * NOTE:  Return ONLY numLeaves at the specified depth
	 */
	private int numLeaves(Position <E> position, int depth) {
		int leaves = 0;
		if(depth == 0 && numChildren(position)==0){
			// is a leaf at the right level
			return 1;
		}else if(depth == 0){
			// is not a leaf but at the right level
			return 0;
		}else{
			for(int i=0; i < numChildren(position); i++){
				leaves += numLeaves(position.getChildren().get(i), depth-1);
			}
			return leaves;
		}
	}
	
	/*
	 * numPositions(int maxDepth) helper method.
	 * NOTE:  Return ONLY numPositions at the specified depth
	 */
	private int numPositions(Position<E> node, int depth) {
		int nodes = 0;
		if(depth == 0 && numChildren(node)==0){
			// is a leaf at the right level
			return 1;
		}else if(depth == 0){
			// is not a leaf but at the right level
			return 1;
		}else{
			for(int i=0; i < numChildren(node); i++){
				nodes += numLeaves(node.getChildren().get(i), depth-1);
			}
			return nodes;
		}
	}
	
	/*
	 * isBinary() helper method:
	 */
	private boolean isBinary(Position<E> position){
		int numChilds = numChildren(position);
		if(numChilds == 0){
			return true;
		}else if(numChilds <=2){
			for(int i=0; i < numChilds; i++){
				if(isBinary(position.getChildren().get(i))==false) return false;
			}
			return true;
		}else{
			return false;
		}
	}
	
	/*
	 * isProperBinary() helper method:
	 */
	private boolean isProperBinary(Position<E> position){
		int numChilds = numChildren(position);
		if(numChilds == 0){
			return true;
		}else if(numChilds == 1){
			return false;
		}else if(numChilds == 2){
			for(int i=0; i < 2; i++){
				if(isProperBinary(position.getChildren().get(i))==false) return false;
			}
			return true;
		}else{
			return false;
		}
	}
	
	/*
	 * isCompleteBinary() helper method - version 5:
	 */
	private boolean isCompleteBinary(Position<E> node){
		int numchilds = numChildren(node);
		if(numchilds==0){
			return true;
		}
		if(numchilds==1){
			if(size(node.getChildren().get(0)) == 0){
				return true;
			}else if(size(node.getChildren().get(0))==1){
				return true;
			}else{
				return false;
			}
		}
		if(numchilds==2){
			List<Position<E>> childs = node.getChildren();
			if(size(childs.get(0)) < size(childs.get(1)) || size(childs.get(0)) - size(childs.get(1)) > 2){
				return false;
			}else{
				return isCompleteBinary(childs.get(0));
			}
		}else{
			return false;
		}
	}
	
	/*
	 * isBalancedBinary() helper method
	 */
	private boolean isBalancedBinary(Position<E> node){
		int childs = numChildren(node);
		
		if(childs == 0){
			return true;
		}else if(childs==1){
			if(height(node.getChildren().get(0))>0){
				return false;
			}else{
				return true;
			}
		}else if(childs==2){
			for(Position<E> child : node.getChildren()){
				if(isBalancedBinary(child)==false) return false;
			}
			return true;
		}else{
			return false;
		}
	}
	
	/*
	 *  helper method for isBinarySearchTree()
	 */
	private List<E> inOrderBinary() {
		List<E> list = new ArrayList<E>();
		if(root()==null){
			return list;
		}else{
			if(isBinary()){
				return inorder(this.root(), list);
			}else{
				throw new UnsupportedOperationException();
			}
		}
		
	}	
	

	
	/*
	 * evaluateArithmetic() helper methods:
	 * 		1. evaluateArithmetic
	 * 		2. eval
	 */
	private double evaluateArithmetic(Position <E> node) {
		if (!hasChildren(node)) 
			return Double.parseDouble(node.getElement().toString()); 
		else 
			return eval(node); 
	}
	
	private double eval(Position <E> node) {
		Position <E> right = node.getChildren().get(0); 
		Position <E> left = node.getChildren().get(1);  
		String element = node.getElement().toString(); 
		 if (element.equals("+"))
			 return evaluateArithmetic(right) + evaluateArithmetic(left);
		 else if (element.equals("-"))
			 return evaluateArithmetic(right) - evaluateArithmetic(left);
		 else if(element.equals("*"))
			 return evaluateArithmetic(right) * evaluateArithmetic(left);
		 else 
			 return evaluateArithmetic(right) / evaluateArithmetic(left);
	}
	
	/*
	 * getArithmeticString() helper method
	 */
	String str;
	private String infix(Position <E> node) {
		if (!hasChildren(node) ){
			str += node.getElement().toString(); 
			str = str.replace("null", "");
			return str;
		} else {
			str +="(";
			infix(node.getChildren().get(0));
			str += node.getElement().toString();
			infix(node.getChildren().get(1));
			str += ")";
			str = str.replace("null", "");
			return str; 
		}		
	}
}
