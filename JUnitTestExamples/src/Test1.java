
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test1 {

	/*
	 * @Test public void multiplicationOfZeroIntegersShouldReturnZero() {
	 * MyClass tester = new MyClass(); // MyClass is tested
	 * 
	 * // assert statements assertEquals(0, tester.multiply(10, 0),
	 * "10 x 0 must be 0"); assertEquals(0, tester.multiply(0, 10),
	 * "0 x 10 must be 0"); assertEquals(0, tester.multiply(0, 0),
	 * "0 x 0 must be 0");
	 * 
	 * assertequals }
	 */

	/*
	 * // Run once, e.g. Database connection, connection pool
	 * 
	 * @BeforeClass public static void runOnceBeforeClass() {
	 * System.out.println("@BeforeClass - runOnceBeforeClass"); }
	 * 
	 * // Run once, e.g close connection, cleanup
	 * 
	 * @AfterClass public static void runOnceAfterClass() { System.out.println(
	 * "@AfterClass - runOnceAfterClass"); }
	 * 
	 * // Should rename to @BeforeTestMethod // e.g. Creating an similar object
	 * and share for all @Test
	 * 
	 * @Before public void runBeforeTestMethod() { System.out.println(
	 * "@Before - runBeforeTestMethod"); }
	 * 
	 * // Should rename to @AfterTestMethod
	 * 
	 * @After public void runAfterTestMethod() { System.out.println(
	 * "@After - runAfterTestMethod"); }
	 */
	
	@Test(expected=Exception.class)
	public void test_exception() throws Exception{
		throw new IOException();
	}
	

	@Test
	public void test_method_1() {
		MyClass myClass = new MyClass();
		assertEquals("OK", myClass.multiply(5, 5), 25);
		
		//assertEquals("", DBConnection.getConnection());
	}
	/*
	 * @Test public void test_method_2() { System.out.println(
	 * "@Test - test_method_2"); }
	 */

}

class MyClass {

	public int multiply(int i, int j) {
		return i * j;
	}

}

class DBConnection {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection()  {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ws711", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
