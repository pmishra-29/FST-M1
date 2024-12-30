package examples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {
	Calculator calc=new Calculator();
//	
//	@BeforeEach
//	public void setup() {
//		calc = new Calculator();
//	System.out.println("Starting the tests...");
//	}
	
	//@Disabled //Annotation to disable any test method
	@DisplayName("Addition Test")
	@Test
	public void addTest() {
		//perform the add function to get the Actual result
		int result = calc.add(10, 20);
		
		//Add assertion to verify against Expected result
		assertEquals(30, result);
		System.out.println("TC01: Addition Test Passed");
	}
	
	@DisplayName("Multiplication Test")
	@Test
	public void multiplyTest() {
		//perform the add function to get the Actual result
		int result = calc.multiply(10, 20);
		
		//Add assertion to verify against Expected result
		assertEquals(200, result);
		System.out.println("TC02: Multiplication Test Passed");
	}
	
	@DisplayName("Square Test")
	@Test
	public void squareTest() {
		//perform the add function to get the Actual result
		int result = calc.square(10);
		
		//Add assertion to verify against Expected result
		assertEquals(100, result);
		System.out.println("TC03: Square Test Passed");
	}
	
// ***************Parameterized Tests********************
	
	@ParameterizedTest
	@ValueSource(ints = {1,2,3,4})// can not pass same datatype variables twice like ints1 and ints1
	public void paramSqrtTest(int num1) {
		int result = calc.square(num1);
		
		//Add assertion to verify against Expected result
		assertEquals(num1 * num1, result);
	}

	
	@ParameterizedTest
	@CsvSource({
		"10,90","50,50","80,20"
		
	})
	public void paraAddTest(int num1 , int num2) {
		//perform the add function to get the Actual result
		int result1 = calc.add(num1, num2);
		
		//Add assertion to verify against Expected result
		assertEquals(100, result1);
		System.out.println("TC01: Addition Test Passed");
	}
	
	@ParameterizedTest
	@CsvSource({
	    "apple,         1",
	    "banana,        2",
	    "'lemon, lime', 0xF1"
	})
	void testWithCsvSource(String fruit, int rank) {
	    assertNotNull(fruit);
	    assertNotEquals(0, rank);
	}
	
	@ParameterizedTest
	@CsvFileSource(files="src/test/resources/input",nullValues = {"NA","N/A" ,"-"})
	public void aggregateTest(ArgumentsAccessor args) {

		System.out.println(args.getString(0) + " has only " +args.getString(3) +" days remaining" );
	}
}
