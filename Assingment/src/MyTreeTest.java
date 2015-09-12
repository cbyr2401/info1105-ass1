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
		
		Position<String> a = new SimplePosition<String>("a");
	    Position<String> b= new SimplePosition<String>("b");
	    Position<String> c = new SimplePosition<String>("c");
	    Position<String> d = new SimplePosition<String>("d");
	    Position<String> e = new SimplePosition<String>("e");
	    Position<String> f = new SimplePosition<String>("f");
	    Position<String> g = new SimplePosition<String>("g");

	    
	    balancedTree.setRoot(a);
	    balancedTree.insert(a, b);
	    balancedTree.insert(a, c);
	    balancedTree.insert(b, d);
	    balancedTree.insert(b, e);
	    balancedTree.insert(c, f);
	    balancedTree.insert(c, g);
	    
	    
		
		assertFalse(justATree.isCompleteBinary());
		assertTrue(balancedTree.isCompleteBinary());
		assertFalse(binaryTree.isCompleteBinary());
		assertFalse(bigBinaryTree.isCompleteBinary());
		
		assertTrue(completeTree.isCompleteBinary());
	    assertFalse(bigProperTree.isCompleteBinary());
	    assertTrue(bigCompleteTree.isCompleteBinary());
	    
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
	

}
