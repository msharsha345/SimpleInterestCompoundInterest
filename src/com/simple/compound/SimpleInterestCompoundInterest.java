package com.simple.compound;

public class SimpleInterestCompoundInterest {

	/*
	 * method for simple interest 
	 */
	
	public  double simple_interest(double principle,double time,double rate)
	{
		return (principle*time*rate);
	}
	
	/*
	 * method for compound interest 
	 */
	
	public  double compound_interest(double principle,double time,double rate)
	{
		return (principle * 
                (Math.pow((1 + rate / 100), time))) ;
	}

}
