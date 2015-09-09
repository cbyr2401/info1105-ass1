import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import simpletree.Position;
import simpletree.SimplePosition;



public class MyTreeTest {

	
	// declare variables for test cases:
	MyTree<String> tree = new MyTree<String>(); 
	

    Position<String> a = new SimplePosition<String>("a");
    Position<String> b = new SimplePosition<String>("b");
    Position<String> c = new SimplePosition<String>("c");
    Position<String> d = new SimplePosition<String>("d");
	
	@Before
	public void setUp(){
		// test tree1 one:
		tree.setRoot(a);
	    tree.insert(a, b);
	    tree.insert(b, c);
	    tree.insert(c, d);
		
	}
	
	
	@Test
	public void testConstruction() {
		MyTree<Integer> tree = new MyTree<Integer>(); 
		assertEquals(tree.root(), null); 
		//fail("Not yet implemented");
	}
	
	@Test
	public void testInOrder() {
		//assertEquals(Arrays.asList("d","c","b","a"), tree.inOrder());
	}
	
	@Test
	public void testPostOrder() {
		assertEquals(Arrays.asList("d","c","b","a"), tree.postOrder());
	}
	
	@Test
	public void testPreOrder() {
		assertEquals(Arrays.asList("a","b","c","d"), tree.preOrder());
		   
	}
	
	@Test
	public void testHeight() {
		assertEquals(3, tree.height());
	    
	}
	@Test
	public void testHeightMaxDepth() {
		MyTree<String> newtree = new MyTree<String>(); 
		
	
	    Position<String> a = new SimplePosition<String>("a");
	    Position<String> b = new SimplePosition<String>("b");
	    Position<String> c = new SimplePosition<String>("c");
	    Position<String> d = new SimplePosition<String>("d");
	    Position<String> e = new SimplePosition<String>("e");
	    Position<String> f = new SimplePosition<String>("f");
	    Position<String> g = new SimplePosition<String>("g");
	
	    newtree.setRoot(a);
	    newtree.insert(a, b);
	    newtree.insert(a, c);
	    newtree.insert(c, d);
	    newtree.insert(a, e);
	    newtree.insert(e, f);
	    newtree.insert(f, g);

	    //   System.out.println(tree.height(4)); 
	    
	}
	@Test
	public void testNumLeaves() {
		MyTree<String> newtree = new MyTree<String>(); 
		

	    Position<String> a = new SimplePosition<String>("a");
	    Position<String> b = new SimplePosition<String>("b");
	    Position<String> c = new SimplePosition<String>("c");
	    Position<String> d = new SimplePosition<String>("d");
	    Position<String> e = new SimplePosition<String>("e");
	    Position<String> f = new SimplePosition<String>("f");
	    Position<String> g = new SimplePosition<String>("g");

	    newtree.setRoot(a);
	    newtree.insert(a, b);
	    newtree.insert(a, c);
	    newtree.insert(a, d);
	    newtree.insert(a, e);
	    newtree.insert(e, f);
	 //   System.out.println(tree.size());
	    newtree.insert(f, g);

	 //   System.out.println(tree.numLeaves()); 
	    
	}

	@Test 
	public void numLeavesDepth() {
		MyTree<String> tree = new MyTree<String>(); 
		
		Position<String> a = new SimplePosition<String>("a");
	    Position<String> b = new SimplePosition<String>("b");
	    Position<String> c = new SimplePosition<String>("c");
	    Position<String> d = new SimplePosition<String>("d");
	    Position<String> e = new SimplePosition<String>("e");
	    Position<String> f = new SimplePosition<String>("f");
	    Position<String> g = new SimplePosition<String>("g");
	    
	    tree.setRoot(a);
	    tree.insert(a, b);
	    tree.insert(b, c);
	    tree.insert(a, d);
	    tree.insert(d, e);
	    tree.insert(e, f);
	 //   System.out.println(tree.size());
	    tree.insert(f, g);
	    tree.numLeaves(2); 
		    
	}
	

}
