package mockito.test_doubles;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Test;
import static org.mockito.Mockito.mock;

/* Test doubles are skilled replacements for collaborator objects. Mock objects have 
 * expectations; a test expects a value from a mock object, and during execution, a 
 * mock object returns the expected result. Also, mock objects can keep track of the 
 * invocation count, that is, the number of times a method on a mock object is invoked. 
 * A dummy object is passed around but never used, i.e. its methods are never called. 
 * Such an object can for example be used to fill the parameter list of a method */


public class _01_Mockito_Fmwk_Mock_Object 
{
	MarketWatcher marketWatcher = mock(MarketWatcher.class);
	Portfolio portfolio         = mock(Portfolio.class);

	@Test 
	public void sanity() throws Exception 
	{
		assertNotNull(marketWatcher);
		assertNotNull(portfolio);
	}
}


interface MarketWatcher { String getQuote(String anyString);}

class Portfolio {}

class Stock implements MarketWatcher
{
	private final String symbol;
	private final String name;
	private BigDecimal price;

	public Stock(String id, String name, BigDecimal price) 
	{
		this.symbol = id;
		this.name = name;
		this.price = price;
	}
	
	public String getQuote(String anyString) 
	{
		return "Hello World";
	}
}