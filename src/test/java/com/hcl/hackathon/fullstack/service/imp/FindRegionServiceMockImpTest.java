/**
 * 
 */
package com.hcl.hackathon.fullstack.service.imp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author saul
 *
 */
public class FindRegionServiceMockImpTest extends FindRegionServiceMockImp{

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.service.imp.FindRegionServiceMockImp#findRegionByCriteria(com.hcl.hackathon.fullstack.model.FindRegion)}.
	 */
	@Test
	public final void testFindRegionByCriteria() {
		assertEquals(this.findRegionByCriteria(null).size(), 3);
	}

}
