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
	@Test
	public void height() {
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
	    tree.insert(a, c);
	    tree.insert(c, d);
	    tree.insert(a, e);
	    tree.insert(e, f);
	    tree.insert(f, g);

	    System.out.println(tree.height()); 
	    
	}
		@Test
		public void heightMaxDepth() {
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
	    tree.insert(a, c);
	    tree.insert(c, d);
	    tree.insert(a, e);
	    tree.insert(e, f);
	    tree.insert(f, g);

	 //   System.out.println(tree.height(4)); 
	    
	}
		@Test
		public void numLeaves() {
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
		    tree.insert(a, c);
		    tree.insert(a, d);
		    tree.insert(a, e);
		    tree.insert(e, f);
		 //   System.out.println(tree.size());
		    tree.insert(f, g);

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
