package mockito.test_doubles;

import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.Test;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verifyNoMoreInteractions;

/* A stub delivers indirect inputs to the caller when the stub's methods 
 * are called. Stubs are programmed only for the test scope. Stubs may 
 * record other information such as the number of times the methods were 
 * invoked and so on */

public class _03_Mockito_Fmwk_Stub_Object 
{
	MarketWatcher marketWatcher = mock(MarketWatcher.class);
	Portfolio portfolio         = mock(Portfolio.class);

	@Test
	public void marketWatcher_Returns_current_stock_status()
	{
		/* The Mockito framework supports stubbing and allows us to return a given value 
		 * when a specific method is called. This can be done using Mockito.when() along 
		 * with thenReturn (). The getQuote method is stubbed to return "Stubbed value" whenever 
		 * the getQuote method is called. Note that anyString() is passed to the getQuote method, 
		 * which means whenever the getQuote method will be called with any String value, the 
		 * "Stubbed value" will be returned. The when() method represents the trigger, that is, 
		 * when to stub */

		when(marketWatcher.getQuote(anyString()))
		.thenReturn("Stubbed value");

		/* The verify() method is a static method, which is used to verify the method invocation. 
		 * If the method is not invoked, or the argument doesn't match, then the verify method 
		 * will raise an error to indicate that the code logic has issues. In some conditions, 
		 * a behavior or method of a mock object should not be invoked, or sometimes, we may 
		 * need to call the method N (a number) times  
		   verify(marketWatcher, atLeast(1)).getQuote(anyString()); */
		   verify(marketWatcher, times(0)).getQuote(anyString());
		   verifyNoMoreInteractions(marketWatcher);  // will fail as the getQuote method was invoked 
	}
}