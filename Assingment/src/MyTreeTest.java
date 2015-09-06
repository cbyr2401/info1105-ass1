import static org.junit.Assert.*;

import org.junit.Test;

import simpletree.Position;
import simpletree.SimplePosition;


public class MyTreeTest {

	@Test
	public void testConstruction() {
		MyTree<Integer> tree = new MyTree<Integer>(); 
		assertEquals(tree.root(), null); 
		//fail("Not yet implemented");
	}
	
	@Test
	public void testInOrder() {
		MyTree<String> tree = new MyTree<String>(); 
		

	    Position<String> a = new SimplePosition<String>("a");
	    Position<String> b = new SimplePosition<String>("b");
	    Position<String> c = new SimplePosition<String>("c");
	    Position<String> d = new SimplePosition<String>("d");

	    tree.setRoot(a);
	    tree.insert(a, b);
	    tree.insert(b, c);
	    tree.insert(c, d);

	   System.out.println(tree.preOrder()); 
	    
	}
	
	@Test
	public void testPostOrder() {
		MyTree<String> tree = new MyTree<String>(); 
		

	    Position<String> a = new SimplePosition<String>("a");
	    Position<String> b = new SimplePosition<String>("b");
	    Position<String> c = new SimplePosition<String>("c");
	    Position<String> d = new SimplePosition<String>("d");

	    tree.setRoot(a);
	    tree.insert(a, b);
	    tree.insert(b, c);
	    tree.insert(c, d);

	    System.out.println(tree.postOrder()); 
	    
	}

	

}
