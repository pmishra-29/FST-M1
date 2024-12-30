package activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class Activity1 {
	// Test fixtures
	static ArrayList<String> list;

	// Initialize test fixtures before each test method
	@BeforeEach
	void setUp() throws Exception {
		list = new ArrayList<String>();
		list.add("alpha"); // at index 0
		list.add("beta"); // at index 1
	}

	// Test method to test the insert operation
	@Test
	public void insertTest() {
		// Assertion for size
		List<String> expectedList =Arrays.asList("alpha","beta","charlie");
		//Assert the size of the List BEFORE adding an element
		assertEquals(2, list.size(), "Wrong size");
		// Add new element
		list.add(2, "charlie");
		//Assert the size of the List AFTER adding an element
		assertEquals(3, list.size(), "Wrong size");

		// Assert individual elements
//		assertEquals("alpha", list.get(0), "Wrong element");
//		assertEquals("beta", list.get(1), "Wrong element");
//		assertEquals("charlie", list.get(2), "Wrong element");

		// Soft Assertions
//		assertAll(	() -> assertEquals("alpha", list.get(0)),
//					() -> assertEquals("beta", list.get(1)),
//					() -> assertEquals("charlie", list.get(2))
//				);	
		
		assertIterableEquals(expectedList,list);
		}

	// Test method to test the replace operation
	@Test
	public void replaceTest() {
		// Replace new element
		List<String> expectedList =Arrays.asList("alpha","charlie");
		//Assert the size of the List BEFORE adding an element
		assertEquals(2, list.size(), "Wrong size");
		
		//replace an element
		list.set(1, "charlie");

//		// Assert size of list
//		assertEquals(2, list.size(), "Wrong size");
//		// Assert individual elements
//		assertEquals("alpha", list.get(0), "Wrong element");
//		assertEquals("charlie", list.get(1), "Wrong element");
		
		// Soft Assertions
//		assertAll(	() -> assertEquals("alpha", list.get(0)),
//					() -> assertEquals("charlie", list.get(1))
//				);
//	}	
		//Assert the size of the List AFTER adding an element
		assertEquals(2, list.size(), "Wrong size");
		
		//Assert list elements
		assertIterableEquals(expectedList,list);
		}
		
}
