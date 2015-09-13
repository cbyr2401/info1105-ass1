import static org.junit.Assert.*;

import org.junit.Test;

import simpletree.Position;
import simpletree.SimplePosition;


public class MyTreeTestHeap {

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


		    
		    boolean min = false; 
		    assertTrue(heap.isHeap(min)); 
	}

}
