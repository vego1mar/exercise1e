package wdsr.exercise1;

import static org.junit.Assert.assertEquals;
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertThat;
//import static org.junit.Assert.fail;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
//import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import wdsr.exercise1.logic.Calculator;

public class CalculatorUtilDivisionTest 
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
	public void test16dividedBy4() {
		doReturn(4.0).when(calculator).divide(16, 4);
		String divisionString = calcUtil.getDivisionText(16, 4);
		assertEquals( "16 / 4 = 4.0", divisionString );
		}
	
	//_________________________________________________________________________________________
	
	@Test(expected=IllegalArgumentException.class)
	public void testDivisionByZero() {
		doThrow(new IllegalArgumentException()).when(calculator).divide(anyInt(), eq(0));
		calcUtil.getDivisionText(3, 0);
		}
	
	//_________________________________________________________________________________________
	}
