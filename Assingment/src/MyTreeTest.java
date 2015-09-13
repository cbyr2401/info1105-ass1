import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import simpletree.Position;
import simpletree.SimplePosition;



public class MyTreeTest {

	
	// declare variables for test cases:
	MyTree<String> justATree = new MyTree<String>();  // just a tree
	MyTree<String> binaryTree = new MyTree<String>();  //Binary only
	MyTree<String> bigBinaryTree = new MyTree<String>(); // Binary only, bigger
	MyTree<String> bigProperTree = new MyTree<String>(); //ProperBinary
	MyTree<String> completeTree = new MyTree<String>(); //Complete tree
	MyTree<String> bigCompleteTree = new MyTree<String>(); //Complete tree
	MyTree<String> arithmeticTree = new MyTree<String>(); //Arithmetic tree
	MyTree<String> bigArithmeticTree = new MyTree<String>(); //Arithmetic tree
	MyTree<Integer> wikipedia1 = new MyTree<>(); //unbalanced
	MyTree<String> wikipedia2 = new MyTree<>(); //balanced
	
	// for first tree:
    Position<String> a = new SimplePosition<String>("a");
    Position<String> b = new SimplePosition<String>("b");
    Position<String> c = new SimplePosition<String>("c");
    Position<String> d = new SimplePosition<String>("d");
    // for second tree:
    Position<String> aa = new SimplePosition<String>("a");
    Position<String> bb= new SimplePosition<String>("b");
    Position<String> cc = new SimplePosition<String>("c");
    Position<String> dd = new SimplePosition<String>("d");
    Position<String> ee = new SimplePosition<String>("e");
    Position<String> ff = new SimplePosition<String>("f");
    Position<String> gg = new SimplePosition<String>("g");
    Position<String> hh = new SimplePosition<String>("h");
    
    // for thrid tree:
    Position<String> aaa = new SimplePosition<String>("a");
    Position<String> bbb= new SimplePosition<String>("b");
    Position<String> ccc = new SimplePosition<String>("c");
    Position<String> ddd = new SimplePosition<String>("d");
    Position<String> eee = new SimplePosition<String>("e");
    Position<String> fff = new SimplePosition<String>("f");
    Position<String> ggg = new SimplePosition<String>("g");
    Position<String> hhh = new SimplePosition<String>("h");
    Position<String> iii = new SimplePosition<String>("i");
    
    // for fourth tree:
    Position<String> aaaa = new SimplePosition<String>("a");
    Position<String> bbbb= new SimplePosition<String>("b");
    Position<String> cccc = new SimplePosition<String>("c");
    Position<String> dddd = new SimplePosition<String>("d");
    Position<String> eeee = new SimplePosition<String>("e");

    // for fifth tree:
    Position<String> a5 = new SimplePosition<String>("a");
    Position<String> b5= new SimplePosition<String>("b");
    Position<String> c5 = new SimplePosition<String>("c");
    Position<String> d5 = new SimplePosition<String>("d");
    Position<String> e5 = new SimplePosition<String>("e");
    Position<String> f5 = new SimplePosition<String>("f");
    Position<String> g5 = new SimplePosition<String>("g");
    Position<String> h5 = new SimplePosition<String>("h");
    Position<String> i5 = new SimplePosition<String>("i");
    
    // for just a tree:
    Position<String> a6 = new SimplePosition<String>("a");
    Position<String> b6= new SimplePosition<String>("b");
    Position<String> c6 = new SimplePosition<String>("c");
    Position<String> d6 = new SimplePosition<String>("d");
    Position<String> e6 = new SimplePosition<String>("e");
    Position<String> f6 = new SimplePosition<String>("f");
    Position<String> g6 = new SimplePosition<String>("g");
    Position<String> h6 = new SimplePosition<String>("h");
    Position<String> i6 = new SimplePosition<String>("i");
    Position<String> j6 = new SimplePosition<String>("j");
    
    // for arithmetic tree
    Position<String> a7 = new SimplePosition<String>("+");
    Position<String> b7= new SimplePosition<String>("1");
    Position<String> c7 = new SimplePosition<String>("2");
    
    //for bigArithmeticTree:
    Position<String> a8 = new SimplePosition<String>("+");
    Position<String> b8= new SimplePosition<String>("*");
    Position<String> c8 = new SimplePosition<String>("/");
    Position<String> d8 = new SimplePosition<String>("12");
    Position<String> e8= new SimplePosition<String>("10");
    Position<String> f8 = new SimplePosition<String>("5");
    Position<String> g8 = new SimplePosition<String>("-");
    Position<String> h8= new SimplePosition<String>("21");
    Position<String> i8 = new SimplePosition<String>("1");
    //Position<String> j8 = new SimplePosition<String>("+");
    //Position<String> b8= new SimplePosition<String>("1");
    //Position<String> c8 = new SimplePosition<String>("2");
    
    // for wikipedia 1
    Position<Integer> aw = new SimplePosition<Integer>(2);
	Position<Integer> bw = new SimplePosition<Integer>(7);
	Position<Integer> cw = new SimplePosition<Integer>(5);
	Position<Integer> dw = new SimplePosition<Integer>(2);
	Position<Integer> ew = new SimplePosition<Integer>(6);
	Position<Integer> fw = new SimplePosition<Integer>(5);
	Position<Integer> gw = new SimplePosition<Integer>(11);
	Position<Integer> hw = new SimplePosition<Integer>(9);
	Position<Integer> iw = new SimplePosition<Integer>(4);
	
	// for wikipedia 2
	Position<String> a1w = new SimplePosition<String>("ABCDE");
	Position<String> b1w = new SimplePosition<String>("ABCD");
	Position<String> c1w = new SimplePosition<String>("E");
	Position<String> d1w = new SimplePosition<String>("AB");
	Position<String> e1w = new SimplePosition<String>("CD");
	Position<String> f1w = new SimplePosition<String>("A");
	Position<String> g1w = new SimplePosition<String>("B");
	Position<String> h1w = new SimplePosition<String>("C");
	Position<String> i1w = new SimplePosition<String>("D");
	
	
    
    
    
	
	@Before
	public void setUp(){
		// binary only:
		binaryTree.setRoot(a);
		binaryTree.insert(a, b);
		binaryTree.insert(b, c);
		binaryTree.insert(c, d);
		
		//binary only:
		bigBinaryTree.setRoot(aa);
		bigBinaryTree.insert(aa,bb);
		bigBinaryTree.insert(aa,cc);
		bigBinaryTree.insert(bb,dd);
		bigBinaryTree.insert(bb,ee);
		bigBinaryTree.insert(ee,ff);
		bigBinaryTree.insert(ee,gg);
		bigBinaryTree.insert(cc,hh);
		
		// proper tree:
		bigProperTree.setRoot(aaa);
		bigProperTree.insert(aaa,bbb);
		bigProperTree.insert(aaa,ccc);
		bigProperTree.insert(bbb,ddd);
		bigProperTree.insert(bbb,eee);
		bigProperTree.insert(eee,fff);
		bigProperTree.insert(eee,ggg);
		bigProperTree.insert(ccc,hhh);
		bigProperTree.insert(ccc,iii);
		
		// complete tree:
		completeTree.setRoot(aaaa);
		completeTree.insert(aaaa,bbbb);
		completeTree.insert(aaaa,cccc);
		completeTree.insert(bbbb,dddd);
		completeTree.insert(bbbb,eeee);
		
		// big complete tree:
		bigCompleteTree.setRoot(a5);
		bigCompleteTree.insert(a5,b5);
		bigCompleteTree.insert(a5,c5);
		bigCompleteTree.insert(b5,d5);
		bigCompleteTree.insert(b5,e5);
		bigCompleteTree.insert(d5,f5);
		bigCompleteTree.insert(c5,g5);
		bigCompleteTree.insert(c5,h5);
		
		// just a tree:
		justATree.setRoot(a6);
		justATree.insert(a6,b6);
		justATree.insert(a6,c6);
		justATree.insert(b6,d6);
		justATree.insert(b6,e6);
		justATree.insert(b6,f6);
		justATree.insert(d6,g6);
		justATree.insert(d6,h6);
		justATree.insert(c6,i6);
		justATree.insert(c6,j6);
		
		//for arithmeticTree:
		arithmeticTree.setRoot(a7);
		arithmeticTree.insert(a7, b7);
		arithmeticTree.insert(a7, c7);
		
		//for bigArithmeticTree:
		bigArithmeticTree.setRoot(a8);
		bigArithmeticTree.insert(a8, b8);
		bigArithmeticTree.insert(a8, g8);
		bigArithmeticTree.insert(b8, c8);
		bigArithmeticTree.insert(b8, d8);
		bigArithmeticTree.insert(c8, e8);
		bigArithmeticTree.insert(c8, f8);
		bigArithmeticTree.insert(g8, h8);
		bigArithmeticTree.insert(g8, i8);
		
		// unbalanced
		wikipedia1.setRoot(aw);
		wikipedia1.insert(aw, bw);
		wikipedia1.insert(aw, cw);
		wikipedia1.insert(bw, dw);
		wikipedia1.insert(bw, ew);
		wikipedia1.insert(ew, fw);
		wikipedia1.insert(ew, gw);
		wikipedia1.insert(cw, hw);
		wikipedia1.insert(hw, iw);
		
		// balanced
		wikipedia2.setRoot(a1w);
		wikipedia2.insert(a1w, b1w);
		wikipedia2.insert(a1w, c1w);
		wikipedia2.insert(b1w, d1w);
		wikipedia2.insert(b1w, e1w);
		wikipedia2.insert(d1w, f1w);
		wikipedia2.insert(d1w, g1w);
		wikipedia2.insert(e1w, h1w);
		wikipedia2.insert(e1w, i1w);
		
		
	}
	
	@Rule
	public ExpectedException exception = ExpectedException.none();

	
	@Test
	public void testConstruction() {
		MyTree<Integer> tree = new MyTree<Integer>(); 
		assertEquals(tree.root(), null);
		assertEquals(0, tree.size());
		assertEquals(-1, tree.height());
	}
	
	@Test
	public void testInOrder() {
		
		exception.expect(UnsupportedOperationException.class);
		binaryTree.inOrder();
		exception.expect(UnsupportedOperationException.class);
		bigBinaryTree.inOrder();
		
		assertEquals(Arrays.asList("d","b","f","e","g","a","h","c","i"), bigProperTree.inOrder());
		assertEquals(Arrays.asList("d","b","e","a","c"), completeTree.inOrder());
		
		exception.expect(UnsupportedOperationException.class);
		bigCompleteTree.inOrder();
		exception.expect(UnsupportedOperationException.class);
		justATree.inOrder();
	}
	
	@Test
	public void testPostOrder() {
		assertEquals(Arrays.asList("d","c","b","a"), binaryTree.postOrder());
		assertEquals(Arrays.asList("d","f","g","e","b","h","c","a"), bigBinaryTree.postOrder());
		
		assertEquals(Arrays.asList("d","f","g","e","b","h","i","c","a"), bigProperTree.postOrder());
		assertEquals(Arrays.asList("f","d","e","b","g","h","c","a"), bigCompleteTree.postOrder());
	}
	
	@Test
	public void testPreOrder() {
		assertEquals(Arrays.asList("a","b","c","d"), binaryTree.preOrder());
		assertEquals(Arrays.asList("a","b","d","e","f","g","c","h"), bigBinaryTree.preOrder());
		
		assertEquals(Arrays.asList("a","b","d","e","f","g","c","h","i"), bigProperTree.preOrder());
		assertEquals(Arrays.asList("a","b","d","f","e","c","g","h"), bigCompleteTree.preOrder());
		   
	}
	
	@Test
	public void testHeight() {
		assertEquals(3, binaryTree.height());
		assertEquals(3, bigBinaryTree.height());
		assertEquals(3, bigProperTree.height());
		assertEquals(2, completeTree.height());
		assertEquals(3, bigCompleteTree.height());
		assertEquals(3, justATree.height());
		
		MyTree<String> newtree = new MyTree<>();
		Position<String> p1 = new SimplePosition<String>("p1");
		
		assertEquals(-1, newtree.height());
		newtree.setRoot(p1);
		assertEquals(0, newtree.height());
	}
	@Test
	public void testHeightMaxDepth() {
		
		assertEquals(1, binaryTree.height(1));
		assertEquals(1, bigBinaryTree.height(1));
		assertEquals(1, bigProperTree.height(1));
		assertEquals(1, completeTree.height(1));
		assertEquals(1, bigCompleteTree.height(1));
		assertEquals(1, justATree.height(1));
		
		assertEquals(2, binaryTree.height(2));
		assertEquals(2, bigBinaryTree.height(2));
		assertEquals(2, bigProperTree.height(2));
		assertEquals(2, completeTree.height(2));
		assertEquals(2, bigCompleteTree.height(2));
		assertEquals(2, justATree.height(2));
		
		// should return the actual height of the tree:		
		assertEquals(3, binaryTree.height(4));
		assertEquals(3, bigBinaryTree.height(4));
		assertEquals(3, bigProperTree.height(4));
		assertEquals(2, completeTree.height(4));
		assertEquals(3, bigCompleteTree.height(4));
		assertEquals(3, justATree.height(4));
		
		// test zero:
		assertEquals(0, binaryTree.height(0));
		assertEquals(0, bigBinaryTree.height(0));
		assertEquals(0, bigProperTree.height(0));
		assertEquals(0, completeTree.height(0));
		assertEquals(0, bigCompleteTree.height(0));
		assertEquals(0, justATree.height(0));
		
		/* // test negatives:
		assertEquals(0, binaryTree.height(-1));
		assertEquals(0, bigBinaryTree.height(-30));
		assertEquals(0, bigProperTree.height(-1000));
		assertEquals(0, completeTree.height(-2));
		assertEquals(0, bigCompleteTree.height(-5));
		assertEquals(0, justATree.height(-8));
		*/
	    
	}
	@Test
	public void testNumLeaves() {
		
		assertEquals(1, binaryTree.numLeaves());
		assertEquals(4, bigBinaryTree.numLeaves());
		assertEquals(5, bigProperTree.numLeaves());
		assertEquals(3, completeTree.numLeaves());
		assertEquals(4, bigCompleteTree.numLeaves());
		assertEquals(6, justATree.numLeaves());
	    
	}

	@Test 
	public void testnumLeavesDepth() {
		/*
		 * Return ONLY numLeaves at the specified depth
		 */
		
		assertEquals(0, binaryTree.numLeaves(1));
		assertEquals(0, bigBinaryTree.numLeaves(1));
		assertEquals(0, bigProperTree.numLeaves(1));
		assertEquals(1, completeTree.numLeaves(1));
		assertEquals(0, bigCompleteTree.numLeaves(1));
		assertEquals(0, justATree.numLeaves(1));
		
		assertEquals(0, binaryTree.numLeaves(2));
		assertEquals(2, bigBinaryTree.numLeaves(2));
		assertEquals(3, bigProperTree.numLeaves(2));
		assertEquals(2, completeTree.numLeaves(2));
		assertEquals(3, bigCompleteTree.numLeaves(2));
		assertEquals(4, justATree.numLeaves(2));
		
		// should return the 0 leaves, as the tree is too big for that.:		
		assertEquals(0, binaryTree.numLeaves(4));
		assertEquals(0, bigBinaryTree.numLeaves(4));
		assertEquals(0, bigProperTree.numLeaves(4));
		assertEquals(0, completeTree.numLeaves(4));
		assertEquals(0, bigCompleteTree.numLeaves(4));
		assertEquals(0, justATree.numLeaves(4));
		
		// test zero:
		assertEquals(0, binaryTree.numLeaves(0));
		assertEquals(0, bigBinaryTree.numLeaves(0));
		assertEquals(0, bigProperTree.numLeaves(0));
		assertEquals(0, completeTree.numLeaves(0));
		assertEquals(0, bigCompleteTree.numLeaves(0));
		assertEquals(0, justATree.numLeaves(0));
		
		/* // test negatives:
		assertEquals(0, binaryTree.numLeaves(-1));
		assertEquals(0, bigBinaryTree.numLeaves(-30));
		assertEquals(0, bigProperTree.numLeaves(-1000));
		assertEquals(0, completeTree.numLeaves(-2));
		assertEquals(0, bigCompleteTree.numLeaves(-5));
		assertEquals(0, justATree.numLeaves(-8));
		*/
		    
	}
	
	@Test
	public void testIsBinary(){
		assertTrue(binaryTree.isBinary());
		assertTrue(bigBinaryTree.isBinary());
		assertTrue(bigProperTree.isBinary());
	    assertTrue(completeTree.isBinary());
	    assertTrue(bigCompleteTree.isBinary());
	    
	    assertFalse(justATree.isBinary());
	    
	}
	
	@Test
	public void testIsProperBinary(){
		assertFalse(justATree.isProperBinary());
		assertFalse(binaryTree.isProperBinary());
		assertFalse(bigBinaryTree.isProperBinary());
	    assertFalse(bigCompleteTree.isProperBinary());
	    
	    assertTrue(bigProperTree.isProperBinary());
	    assertTrue(completeTree.isProperBinary());
	}
	
	@Test
	public void testIsCompleteBinary(){
		
		MyTree<String> balancedTree = new MyTree<String>(); //Balanced and complete tree
		MyTree<String> notCompleteTree = new MyTree<String>(); //not a complete tree
		MyTree<String> anotherNotCompleteTree = new MyTree<String>(); //not a complete tree
		
		Position<String> a = new SimplePosition<String>("a");
	    Position<String> b= new SimplePosition<String>("b");
	    Position<String> c = new SimplePosition<String>("c");
	    Position<String> d = new SimplePosition<String>("d");
	    Position<String> e = new SimplePosition<String>("e");
	    Position<String> f = new SimplePosition<String>("f");
	    Position<String> g = new SimplePosition<String>("g");
	    
	    Position<String> a1 = new SimplePosition<String>("a");
	    Position<String> b1= new SimplePosition<String>("b");
	    Position<String> c1 = new SimplePosition<String>("c");
	    Position<String> d1 = new SimplePosition<String>("d");
	    Position<String> e1 = new SimplePosition<String>("e");
	    Position<String> f1 = new SimplePosition<String>("f");
	    Position<String> g1 = new SimplePosition<String>("g");
	    	
	    Position<String> a2 = new SimplePosition<String>("a");
	    Position<String> b2= new SimplePosition<String>("b");
	    Position<String> c2 = new SimplePosition<String>("c");
	    Position<String> d2 = new SimplePosition<String>("d");
	    Position<String> e2 = new SimplePosition<String>("e");
	    Position<String> f2 = new SimplePosition<String>("f");
	    Position<String> g2 = new SimplePosition<String>("g");
	    Position<String> h2 = new SimplePosition<String>("h");
	    Position<String> i2 = new SimplePosition<String>("i");
	    Position<String> j2 = new SimplePosition<String>("j");
	    
	    balancedTree.setRoot(a);
	    balancedTree.insert(a, b);
	    balancedTree.insert(a, c);
	    balancedTree.insert(b, d);
	    balancedTree.insert(b, e);
	    balancedTree.insert(c, f);
	    balancedTree.insert(c, g);
	    
	    notCompleteTree.setRoot(a1);
	    notCompleteTree.insert(a1, b1);
	    notCompleteTree.insert(a1, c1);
	    notCompleteTree.insert(b1, d1);
	    notCompleteTree.insert(b1, e1);
	    notCompleteTree.insert(d1, f1);
	    notCompleteTree.insert(d1, g1);
	    
	    anotherNotCompleteTree.setRoot(a2);
	    anotherNotCompleteTree.insert(a2, b2);
	    anotherNotCompleteTree.insert(a2, c2);
	    anotherNotCompleteTree.insert(b2, d2);
	    anotherNotCompleteTree.insert(b2, e2);
	    anotherNotCompleteTree.insert(c2, f2);
	    anotherNotCompleteTree.insert(d2, g2);
	    anotherNotCompleteTree.insert(d2, h2);
	    anotherNotCompleteTree.insert(e2, i2);
	    anotherNotCompleteTree.insert(e2, j2);
	    
	    
		
		assertFalse(justATree.isCompleteBinary());
		assertTrue(balancedTree.isCompleteBinary());
		assertFalse(binaryTree.isCompleteBinary());
		assertFalse(bigBinaryTree.isCompleteBinary());
		
		assertTrue(completeTree.isCompleteBinary());
	    assertFalse(bigProperTree.isCompleteBinary());
	    assertTrue(bigCompleteTree.isCompleteBinary());
	    assertFalse(notCompleteTree.isCompleteBinary());
	    assertFalse(anotherNotCompleteTree.isCompleteBinary());
	    
	}
	
	@Test
	public void testIsArithmetic() {
		
		assertTrue(arithmeticTree.isArithmetic());
		assertTrue(bigArithmeticTree.isArithmetic());
		
		assertFalse(bigBinaryTree.isArithmetic());
		assertFalse(binaryTree.isArithmetic());
		assertFalse(bigCompleteTree.isArithmetic());
		assertFalse(completeTree.isArithmetic());
		assertFalse(bigProperTree.isArithmetic());
	//	assertTrue(MyTree.isNumeric("2")); 
	//	assertTrue(MyTree.isOperator("+a")); 
	}
	
	@Test
	public void testIsBinarySearchTree(){
		MyTree<Integer> bst1 = new MyTree<>();
		MyTree<Integer> bst2 = new MyTree<>();
		MyTree<Integer> bst3 = new MyTree<>();
		
		Position<Integer> a = new SimplePosition<Integer>(6);
		Position<Integer> b = new SimplePosition<Integer>(12);
		Position<Integer> c = new SimplePosition<Integer>(10);
		Position<Integer> d = new SimplePosition<Integer>(2);
		Position<Integer> e = new SimplePosition<Integer>(5);
		
		Position<Integer> a1 = new SimplePosition<Integer>(6);
		Position<Integer> b1 = new SimplePosition<Integer>(5);
		Position<Integer> c1 = new SimplePosition<Integer>(8);
		Position<Integer> d1 = new SimplePosition<Integer>(2);
		Position<Integer> e1 = new SimplePosition<Integer>(7);
		
		Position<Integer> a2 = new SimplePosition<Integer>(100);
		Position<Integer> b2 = new SimplePosition<Integer>(95);
		Position<Integer> c2 = new SimplePosition<Integer>(101);
		Position<Integer> d2 = new SimplePosition<Integer>(75);
		Position<Integer> e2 = new SimplePosition<Integer>(96);
		Position<Integer> f2 = new SimplePosition<Integer>(10);
		Position<Integer> g2 = new SimplePosition<Integer>(80);
		//Position<Integer> h2 = new SimplePosition<Integer>(7);
		
		
		
		bst1.setRoot(a);
		bst1.insert(a, b);
		bst1.insert(a, c);
		bst1.insert(b, d);
		bst1.insert(b, e);
		
		bst2.setRoot(a1);
		bst2.insert(a1, b1);
		bst2.insert(a1, c1);
		bst2.insert(b1, d1);
		bst2.insert(b1, e1);
		
		bst3.setRoot(a2);
		bst3.insert(a2, b2);
		bst3.insert(a2, c2);
		bst3.insert(b2, d2);
		bst3.insert(b2, e2);
		bst3.insert(d2, f2);
		bst3.insert(d2, g2);
		
		assertFalse(bst1.isBinarySearchTree());
		assertFalse(bst2.isBinarySearchTree());
		assertTrue(bst3.isBinarySearchTree());

	}

	@Test
	public void testIsBalancedTree(){

		assertTrue(wikipedia2.isBalancedBinary());
		assertTrue(wikipedia1.isBinary());
		assertFalse(wikipedia1.isBalancedBinary());
		

	}
	
	@Test
	public void testEvaluateArithmetic(){
		assertEquals(3, arithmeticTree.evaluateArithmetic(), 0.00001);
		assertEquals(44, bigArithmeticTree.evaluateArithmetic(), 0.00001);
	}
	
	@Test
	public void testGetStringArithmetic(){
		assertEquals("(((10/5)*12)+(21-1))", bigArithmeticTree.getArithmeticString());
		assertEquals("(1+2)", arithmeticTree.getArithmeticString());
	}
	
	@Test
	public void testIsHeap(){
		assertTrue(arithmeticTree.isHeap(true));
		assertTrue(bigArithmeticTree.isHeap(true));
		
		assertFalse(bigBinaryTree.isArithmetic());
		assertFalse(binaryTree.isArithmetic());
		assertFalse(bigCompleteTree.isArithmetic());
		assertFalse(completeTree.isArithmetic());
		assertFalse(bigProperTree.isArithmetic());
	}
	
	@Test
	public void testHeap() {
		MyTree<String> heap = new MyTree<String>();  //Binary only
		Position<String> a = new SimplePosition<String>("1");
	    Position<String> b = new SimplePosition<String>("2");
	    Position<String> c = new SimplePosition<String>("6");
	    Position<String> d = new SimplePosition<String>("4");
	    Position<String> e = new SimplePosition<String>("5");
	    Position<String> f = new SimplePosition<String>("9");
	    Position<String> g = new SimplePosition<String>("100");
	    Position<String> h = new SimplePosition<String>("24");
	    Position<String> i = new SimplePosition<String>("22");

	    heap.setRoot(a);
	    heap.insert(a, b);
	    heap.insert(a,c);
	    heap.insert(b, d);
	    heap.insert(b, e);
	    heap.insert(c, f);
	    heap.insert(c, g);
	    heap.insert(d, h);
	    heap.insert(d, i);
		    
	    boolean min = true; 
	    assertTrue(heap.isHeap(min)); 
	}
	@Test
	public void testComparison() {
		MyTree<String> tree = new MyTree<String>(); 
		 Position<String> aa1 = new SimplePosition<String>("a");
		    Position<String> bb1= new SimplePosition<String>("b");
		    Position<String> cc1 = new SimplePosition<String>("c");
		    Position<String> dd1 = new SimplePosition<String>("d");
		    Position<String> ee1 = new SimplePosition<String>("e");
		    Position<String> ff1 = new SimplePosition<String>("f");
		    Position<String> gg1 = new SimplePosition<String>("g");
		    Position<String> hh1 = new SimplePosition<String>("z");
			tree.setRoot(aa1);
			tree.insert(aa1,bb1);
			tree.insert(aa1,cc1);
			tree.insert(bb1,dd1);
			tree.insert(bb1,ee1);
			tree.insert(ee1,ff1);
			tree.insert(ee1,gg1);
			tree.insert(cc1,hh1);
		assertEquals(0, bigBinaryTree.compareTo(bigBinaryTree));
		assertEquals(0, bigCompleteTree.compareTo(bigCompleteTree));
		System.out.println("h".compareTo("z"));
		assertEquals("h".compareTo("z"), bigBinaryTree.compareTo(tree));

	}
}
