package com.mycompany.app;



public class Calculator 
{
	public double addition(double numberone,double numbertwo)
	{
		
		return numberone+numbertwo;
	}
	public double substract(double numberone,double numbertwo)
	{
		double result;
		result=numberone-numbertwo;
		return result;
	}
	public double multiply(double numberone,double numbertwo)
	{
		double result;
		result=numberone*numbertwo;
		return result;
	}
	public double division(double numberone,double numbertwo) throws Exception
	{
		
		double result;
		//if(numbertwo == 0) throw new Exception();
		result=numberone/numbertwo;
		return result;
		
	}
}
