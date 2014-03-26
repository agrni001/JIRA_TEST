package com.staples.asgard.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.staples.asgard.core.exceptions.DatabaseException;

/**
 * Base class - for JUNIT framework
 * 
 * @author Sapient
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring/integration/testContext.xml" })
public class BaseUnitTest {
	/**
	 * Test set-up
	 * @throws Exception 
	 */
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		additionalSetUp();
	}

	/**
	 * Functionality specific set-up is added here.
	 * 
	 * @throws DatabaseException
	 * @throws Exception
	 */
	public void additionalSetUp() throws Exception {
		// TODO Auto-generated method stub
	}

	/**
	 * Main test method
	 */
	@Ignore
	@Test
	public void test() {
		// Added to avoid JUNIt error
		assertEquals("test", "test", "test");
	}

	/**
	 * Steps to execute post test
	 */
	@After
	public void tearDown() {
	}
}