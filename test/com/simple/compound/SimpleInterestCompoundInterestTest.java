package com.simple.compound;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleInterestCompoundInterestTest {
	SimpleInterestCompoundInterest object= new SimpleInterestCompoundInterest();
	
	@Test
	public void Simple_Test_Pass() {
		
		assertEquals(" Excuted successfully ",72000,object.simple_interest(12000,2,3),0.0);
		assertEquals(" Excuted successfully ",165000,object.simple_interest(50000, 3, 1.1),0.0);
		assertEquals(" Excuted successfully ",2520000.0,object.simple_interest(40000,10,6.3),0.0);
		assertEquals(" Excuted successfully ",3780000.0,object.simple_interest(14000,30,9),0.0);
		
	}
	
	@Test
	public void Simple_Test_Fail() {
		
		assertFalse(" Excuted successfully ",72000!=object.simple_interest(12000,2,3));
		assertFalse(" Excuted successfully ",165000!=object.simple_interest(50000, 3, 1.1));
		assertFalse(" Excuted successfully ",2520000.0!=object.simple_interest(40000,10,6.3));
		assertFalse(" Excuted successfully ",3780000.0!=object.simple_interest(14000,30,9));
		
	}
	
	@Test
	public void Compound_Test_Pass() {
		
		assertEquals(" Excuted successfully ",12730.8,object.compound_interest(12000,2,3),0.0);
		assertEquals(" Excuted successfully ",51668.216549999976,object.compound_interest(50000, 3, 1.1),0.0);
		assertEquals(" Excuted successfully ",73687.29879025235,object.compound_interest(40000,10,6.3),0.0);
		assertEquals(" Excuted successfully ",185747.49856783787,object.compound_interest(14000,30,9),0.0);
		
	}
	
	@Test
	public void Compound_Test_Fail() {
		
		assertFalse(" Excuted successfully ",12730.8!=object.compound_interest(12000,2,3));
		assertFalse(" Excuted successfully ",51668.216549999976!=object.compound_interest(50000, 3, 1.1));
		assertFalse(" Excuted successfully ",73687.29879025235!=object.compound_interest(40000,10,6.3));
		assertFalse(" Excuted successfully ",185747.49856783787!=object.compound_interest(14000,30,9));
		
	}

}
