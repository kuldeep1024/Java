import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Test2 {

	public static void main(String[] args) {
		Test2 t =new Test2();
		t.test1();
		t.test2();
		t.test3();
	}

	@Test
	public void test1(){
		List list = new ArrayList();
		list.add(42);
		list.add(-3);
		list.add(17);
		list.add(99);
		
		assertEquals(4, list.size());
		assertEquals(17, list.get(2));
		assertTrue(list.contains(-3));
		assertFalse(list.isEmpty());

		assertFalse("checks if true",false);
		assertTrue("checks if true",true);
	}
	
	@Test
	public void test2(){
		if (false)
			fail("fail.......");
	}	
	@Test
	public void test3(){
		Test2 t2=null;
		
		//t2= new Test2();
	
		assertNull( "Identifier must be null.", t2 );
		
	}

}
