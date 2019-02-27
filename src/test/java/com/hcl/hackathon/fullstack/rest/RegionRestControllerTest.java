/**
 * 
 */
package com.hcl.hackathon.fullstack.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author saul
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(RegionRestController.class)
@ComponentScan( basePackages="com.hcl.hackathon.fullstack")
public class RegionRestControllerTest {

	@Autowired
	private MockMvc mvc;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.rest.RegionRestController#findByCriteria(com.hcl.hackathon.fullstack.model.FindRegion)}.
	 * @throws Exception 
	 */
	@Test
	public final void testFindByCriteria() throws Exception {
		this.mvc.perform(post("/api/region/find").accept(MediaType.APPLICATION_JSON).content("{\"regionId\":\"23\", \"stateId\":\"23\", \"cityId\":\"23\"}"))
		.andExpect(status().isOk());
	}

}
