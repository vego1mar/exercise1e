package wdsr.exercise1;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import wdsr.exercise1.logic.Calculator;

public class CalculatorUtilModuloTest 
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
	public void testModuloByZero() {
		doReturn(0).when(calculator).modulo(anyInt(), eq(0));
		String moduloString = calcUtil.getModuloText(23, 0);
		assertEquals( "23 % 0 = 0", moduloString );
		}
	
	//_________________________________________________________________________________________
	
	}
