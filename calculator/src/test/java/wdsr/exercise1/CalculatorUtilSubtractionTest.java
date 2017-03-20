package wdsr.exercise1;

import static org.mockito.Mockito.doReturn;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import wdsr.exercise1.logic.Calculator;

public class CalculatorUtilSubtractionTest 
	{
	private Calculator calculator;
	private CalculatorUtil calcUtil;

	//_________________________________________________________________________________________
	
	@Before
	public void init() {
		calculator = Mockito.mock(Calculator.class);
		calcUtil = new CalculatorUtil(calculator);
		}
	
	//_________________________________________________________________________________________

	@Test
	public void test3minus1() {
		doReturn(2).when(calculator).subtract(3, 1);
		String substractionString = calcUtil.getSubstractionText(3, 1);
		assertEquals( "3 - 1 = 2", substractionString );
		}
	
	//_________________________________________________________________________________________
	
	}
