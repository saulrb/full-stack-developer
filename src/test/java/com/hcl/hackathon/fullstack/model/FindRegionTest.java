/**
 * 
 */
package com.hcl.hackathon.fullstack.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


import org.junit.Before;
import org.junit.Test;

/**
 * @author saul
 *
 */
public class FindRegionTest {

	private FindRegion findRegion;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.findRegion = new FindRegion()
				.setCityId("123")
				.setRegionId("10")
				.setStateId("32");		
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.FindRegion#getRegionId()}.
	 */
	@Test
	public final void testGetRegionId() {
		assertEquals(this.findRegion.getRegionId(),"10");
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.FindRegion#setRegionId(java.lang.String)}.
	 */
	@Test
	public final void testSetRegionId() {
		this.findRegion.setRegionId(null);
		assertEquals(this.findRegion.getRegionId(),null);
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.FindRegion#getStateId()}.
	 */
	@Test
	public final void testGetStateId() {
		assertEquals(this.findRegion.getStateId(),"32");
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.FindRegion#setStateId(java.lang.String)}.
	 */
	@Test
	public final void testSetStateId() {
		this.findRegion.setStateId(null);
		assertEquals(this.findRegion.getStateId(),null);
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.FindRegion#getCityId()}.
	 */
	@Test
	public final void testGetCityId() {
		assertEquals(this.findRegion.getCityId(),"123");
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.FindRegion#setCityId(java.lang.String)}.
	 */
	@Test
	public final void testSetCityId() {
		this.findRegion.setRegionId(null);
		assertEquals(this.findRegion.getCityId(),null);
	}

}
