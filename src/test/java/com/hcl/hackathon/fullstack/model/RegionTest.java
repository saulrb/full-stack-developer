/**
 * 
 */
package com.hcl.hackathon.fullstack.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * @author saul
 *
 */
public class RegionTest {

	private Region region;
	private List<Ticket> tickets;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		tickets = new ArrayList<Ticket>();
		tickets.add(new Ticket().setTicketNumber("23578")
				.setIssueReported("Printer error")
				.setPriority("Low")
				.setTicketStatus("Open")
				.setIssueDate(new Date()));
		tickets.add(new Ticket().setTicketNumber("23590")
				.setIssueReported("File Server down")
				.setPriority("High")
				.setTicketStatus("InProgress")
				.setIssueDate(new Date()));

		region = new Region().setId("21")
				.setCity("San Ysidro")
				.setCityId("90200")
				.setLatitude(753.01f)
				.setLongitude(437.41f)
				.setName("South California")
				.setState("California")
				.setStateId("33")				
				.setTickets(tickets)				
				.setTicketCount(tickets.size());
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#getId()}.
	 */
	@Test
	public final void testGetId() {
		assertEquals(this.region.getId(),"33");
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#setId(java.lang.String)}.
	 */
	@Test
	public final void testSetId() {
		this.region.setId(null);
		assertEquals(this.region.getId(),null);
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#getName()}.
	 */
	@Test
	public final void testGetName() {
		assertEquals(this.region.getName(),"South California");
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#setName(java.lang.String)}.
	 */
	@Test
	public final void testSetName() {
		this.region.setName(null);
		assertEquals(this.region.getName(),null);
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#getStateId()}.
	 */
	@Test
	public final void testGetStateId() {
		assertEquals(this.region.getStateId(),"33");
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#setStateId(java.lang.String)}.
	 */
	@Test
	public final void testSetStateId() {
		this.region.setStateId(null);
		assertEquals(this.region.getStateId(),null);
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#getState()}.
	 */
	@Test
	public final void testGetState() {
		assertEquals(this.region.getState(),"California");
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#setState(java.lang.String)}.
	 */
	@Test
	public final void testSetState() {
		this.region.setState(null);
		assertEquals(this.region.getState(),null);
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#getCityId()}.
	 */
	@Test
	public final void testGetCityId() {		
		assertEquals(this.region.getCityId(),"90200");
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#setCityId(java.lang.String)}.
	 */
	@Test
	public final void testSetCityId() {
		this.region.setCityId(null);
		assertEquals(this.region.getCityId(),null);
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#getCity()}.
	 */
	@Test
	public final void testGetCity() {
		assertEquals(this.region.getCity(),"San Ysidro");
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#setCity(java.lang.String)}.
	 */
	@Test
	public final void testSetCity() {
		this.region.setCity(null);
		assertEquals(this.region.getCity(),null);
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#getLatitude()}.
	 */
	@Test
	public final void testGetLatitude() {
		assertEquals(this.region.getLatitude(),new Float(753.01f));
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#setLatitude(java.lang.Float)}.
	 */
	@Test
	public final void testSetLatitude() {
		this.region.setLatitude(null);
		assertEquals(this.region.getLatitude(),null);
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#getLongitude()}.
	 */
	@Test
	public final void testGetLongitude() {
		assertEquals(this.region.getLongitude(),new Float(437.41f));	
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#setLongitude(java.lang.Float)}.
	 */
	@Test
	public final void testSetLongitude() {
		this.region.setLongitude(null);
		assertEquals(this.region.getLongitude(),null);	
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#getTickets()}.
	 */
	@Test
	public final void testGetTickets() {
		assertEquals(this.region.getTickets().size(),2);
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#setTickets(java.util.List)}.
	 */
	@Test
	public final void testSetTickets() {
		this.region.setTickets(null);
		assertEquals(this.region.getTickets(),null);
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#getTicketCount()}.
	 */
	@Test
	public final void testGetTicketCount() {
		assertEquals(this.region.getTicketCount(),new Integer(2));
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Region#setTicketCount(java.lang.Integer)}.
	 */
	@Test
	public final void testSetTicketCount() {
		this.region.setTicketCount(null);
		assertEquals(this.region.getTicketCount(),null);
	}

}
