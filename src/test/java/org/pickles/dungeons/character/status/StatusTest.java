/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pickles.dungeons.character.status;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pickles.dungeons.calculator.ConstStatusType;
import org.pickles.dungeons.calculator.Status;
import org.pickles.dungeons.calculator.StatusResult;
import org.pickles.dungeons.calculator.StatusValue;

import static org.junit.Assert.*;

/**
 *
 * @author t.asamoto
 */
public class StatusTest {
	
	public StatusTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * Test of getNow method, of class Status.
	 */
	@Test
	public void testGetNow() {
		System.out.println("getNow");
		Status instance = new StatusImpl();
		StatusValue expResult = null;
		StatusValue result = instance.getNow();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getNowResult method, of class Status.
	 */
	@Test
	public void testGetNowResult() {
		System.out.println("getNowResult");
		Status instance = new StatusImpl();
		StatusResult expResult = null;
		StatusResult result = instance.getNowResult();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getVariable method, of class Status.
	 */
	@Test
	public void testGetVariable() {
		System.out.println("getVariable");
		Status instance = new StatusImpl();
		StatusValue expResult = null;
		StatusValue result = instance.getVariable();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setVariable method, of class Status.
	 */
	@Test
	public void testSetVariable() {
		System.out.println("setVariable");
		StatusValue variable = null;
		Status instance = new StatusImpl();
		StatusResult expResult = null;
		StatusResult result = instance.setVariable(variable);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of expand method, of class Status.
	 */
	@Test
	public void testExpand() {
		System.out.println("expand");
		StatusValue value = null;
		Status instance = new StatusImpl();
		StatusResult expResult = null;
		StatusResult result = instance.expand(value);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of effect method, of class Status.
	 */
	@Test
	public void testEffect() {
		System.out.println("effect");
		StatusValue value = null;
		Status instance = new StatusImpl();
		StatusResult expResult = null;
		StatusResult result = instance.effect(value);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of update method, of class Status.
	 */
	@Test
	public void testUpdate() {
		System.out.println("update");
		Status instance = new StatusImpl();
		StatusResult expResult = null;
		StatusResult result = instance.update();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getStatusType method, of class Status.
	 */
	@Test
	public void testGetStatusType() {
		System.out.println("getStatusType");
		Status instance = new StatusImpl();
		ConstStatusType expResult = null;
		ConstStatusType result = instance.getStatusType();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of matchType method, of class Status.
	 */
	@Test
	public void testMatchType() {
		System.out.println("matchType");
		ConstStatusType type = null;
		Status instance = new StatusImpl();
		boolean expResult = false;
		boolean result = instance.matchType(type);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	public class StatusImpl implements Status {
	}
	
}
