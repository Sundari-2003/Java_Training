import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import JunitDemos.Calculator;
 
public class TestCalculator {
	
	Calculator obj;
 
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("before all the test cases");	}
	
	@AfterAll
	public static void afterAll()
	{
		System.out.println("after all the test cases");	}
	
	@BeforeEach
	public void setUp()
	{
		System.out.println("before test method");
		obj=new Calculator();//create new
	}
	
	@AfterEach
	public void setDown()
	{
		System.out.println("after test method");
		obj=null;//after that make it null
	}
	
	
	
//	@ParameterizedTest
//	@CsvSource({"10 , 20 , 30 " , " 50 , 50 , 100"})
//	@DisplayName("test method add with 2 args")
//	public void testAdd(int x , int y , int expected)
//	{
//		System.out.println("add method");
//		int ac=obj.add(x , y);
////		int exp=50;
////		
////		Assertions.assertEquals(ac, exp);
//	}
//	
	@Test
	@DisplayName("test method sub with 2 args")
	public void testSub()
	{
		System.out.println("sub method");
		int ac=obj.sub(30,20);
		int exp=10;
		
		Assertions.assertEquals(ac, exp);
	}
	
	@Test
	@DisplayName("test method mul with 2 args")
	public void testMul()
	{
		System.out.println("mul method");
		int ac=obj.mul(3,2);
		int exp=6;
		
		Assertions.assertEquals(ac, exp);
	}
	
	@Test
	@DisplayName("test method div with 2 args")
	public void testDiv()
	{
		System.out.println("div method");
		int ac=obj.div(30,3);
		int exp=10;
		
		Assertions.assertEquals(ac, exp);
	}
	
	@Test
	@DisplayName("test method namecount list")
	public void testNameCount()
	{
		System.out.println("name count method");
		List<String> list=Arrays.asList("thanu","Sundari","Sheela");
		
		int actual=obj.nameCount(list);
		int exp=3;
		
		Assertions.assertEquals(actual,exp);
	}
	
	
	@ParameterizedTest
	@ValueSource(strings = {"hi hello" , "test user"}) // test user != hi hello | so failure
	@DisplayName("test method greetUser string input")
	public void testGreetuser(String strings)
	{
		System.out.println("greet user method");
		String actual=obj.greetUsers(strings);
		String exp="hi hello";
		
		Assertions.assertEquals(actual,exp);
	}
	
	@ParameterizedTest
	@CsvSource({"10,20,30","50,50,100"})//comma separated values
	@Timeout(value=500,unit=TimeUnit.MICROSECONDS)
//	@Timeout(value=3)
	public void testAdd(int x,int y,int expected)
	{
		System.out.println("add method");
		int ac=obj.add(x,y);
//		int exp=50;
		
		Assertions.assertEquals(ac, expected);
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->
		{
			throw new IllegalArgumentException("illegal args");
			
		});
	}
	
 
	
	
	
	
}