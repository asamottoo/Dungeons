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
import org.pickles.dungeons.calculator.*;

import static org.junit.Assert.*;

/**
 *
 * @author t.asamoto
 */
public class DefaultStatusTest {
	
	public DefaultStatusTest() {
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
		Status instance = new DefaultStatus();
		StatusValue expResult = StatusValue.getUnsupport();
		StatusValue result = instance.getNow();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getNowResult method, of class Status.
	 */
	@Test
	public void testGetNowResult() {
		Status instance = new DefaultStatus();
		StatusResult expResult = StatusResult.UNSUPPORT;
		StatusResult result = instance.getNowResult();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getVariable method, of class Status.
	 */
	@Test
	public void testGetVariable() {
		Status instance = new DefaultStatus();
		StatusValue expResult = StatusValue.getUnsupport();
		StatusValue result = instance.getVariable();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setVariable method, of class Status.
	 */
	@Test
	public void testSetVariable() {
		StatusValue variable = null;
		Status instance = new DefaultStatus();
		StatusResult expResult = StatusResult.UNSUPPORT;
		StatusResult result = instance.setVariable(variable);
		assertEquals(expResult, result);
	}

	/**
	 * Test of expand method, of class Status.
	 */
	@Test
	public void testExpand() {
		StatusValue value = null;
		Status instance = new DefaultStatus();
		StatusResult expResult = StatusResult.UNSUPPORT;
		StatusResult result = instance.expand(value);
		assertEquals(expResult, result);
	}

	/**
	 * Test of effect method, of class Status.
	 */
	@Test
	public void testEffect() {
		StatusValue value = null;
		Status instance = new DefaultStatus();
		StatusResult expResult = StatusResult.UNSUPPORT;
		StatusResult result = instance.effect(value);
		assertEquals(expResult, result);
	}

	/**
	 * Test of update method, of class Status.
	 */
	@Test
	public void testUpdate() {
		Status instance = new DefaultStatus();
		StatusResult expResult = StatusResult.UNSUPPORT;
		StatusResult result = instance.update();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getStatusType method, of class Status.
	 */
	@Test
	public void testGetStatusType() {
		Status instance = new DefaultStatus();
		ConstStatusType expResult = ConstStatusType.UNSUPPORTED;
		ConstStatusType result = instance.getStatusType();
		assertEquals(expResult, result);
	}

	/**
	 * Test of matchType method, of class Status.
	 */
	@Test
	public void testMatchType() {
		ConstStatusType type = null;
		Status instance = new DefaultStatus();
		boolean expResult = false;
		boolean result = instance.matchType(type);
		assertEquals(expResult, result);
	}

}
