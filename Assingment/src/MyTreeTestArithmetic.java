import static org.junit.Assert.*;

import org.junit.Test;

import simpletree.Position;
import simpletree.SimplePosition;

public class MyTreeTestArithmetic {

	@Test
	public void test() {
		MyTree<String> tree = new MyTree<String>();
		Position<String> a = new SimplePosition<String>("+");
		Position<String> b = new SimplePosition<String>("*");
		Position<String> c = new SimplePosition<String>("-");
		Position<String> d = new SimplePosition<String>("/");
		Position<String> e = new SimplePosition<String>("12");
		Position<String> f = new SimplePosition<String>("21");
		Position<String> g = new SimplePosition<String>("1");
		Position<String> h = new SimplePosition<String>("4");

		Position<String> i = new SimplePosition<String>("5");

		
	//	Position<String> d = new SimplePosition<String>("d");
		
		tree.setRoot(a);
		tree.insert(a, b);
		tree.insert(a, c);
		tree.insert(b, d);
		tree.insert(b, e);
		tree.insert(c, f);
		tree.insert(c, g);
		tree.insert(d, h);
		tree.insert(d, i);
	


		assertTrue(tree.isArithmetic()); 
	}
	
	@Test
	public void testEval() {
		MyTree<String> tree = new MyTree<String>();
		Position<String> a = new SimplePosition<String>("2.5");
		Position<String> b = new SimplePosition<String>("+");
		Position<String> c = new SimplePosition<String>("5");
		Position<String> d = new SimplePosition<String>("4");
		Position<String> e = new SimplePosition<String>("3");
		tree.setRoot(a);
	//	tree.insert(a, b);
	//	tree.insert(a, c);
	//	tree.insert(b, d);
	//	tree.insert(b, e);
	
		System.out.println(tree.getArithmeticString()); 
		System.out.println(tree.inOrder()); 
	

	}

}
