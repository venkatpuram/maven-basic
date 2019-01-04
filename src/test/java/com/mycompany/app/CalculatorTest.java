package com.mycompany.app;

import static org.junit.Assert.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	private static Logger logger= Logger.getLogger(Calculator.class.getName());
	static {
    	BasicConfigurator.configure();

	}
    @Before
    public void setUp()
    {
    	calculator=new Calculator();
    }
    @Test
    public void additionTest()
    {
    	assertEquals(20,calculator.addition(10,10),0);
    }
    @Test
    public void substractTest()
    {
    	assertEquals(20,calculator.substract(30,10),0);
    }
    @Test
    public void multiplyTest()
    {
    	assertEquals(21,calculator.multiply(7,3),0);
    }
    @Test
    public void divisionTest() throws Exception
    {
    	assertEquals(7,calculator.division(21,3),0);
    }
}
