/**
 * 
 */
package com.hcl.hackathon.fullstack.model;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

/**
 * @author saul
 *
 */
public class TicketTest {


	private Ticket ticket;
	private Date issued;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		issued = new Date();
		ticket = new Ticket().setTicketNumber("23578")
				.setIssueReported("Printer error")
				.setPriority("Low")
				.setTicketStatus("Open")
				.setIssueDate(issued);
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Ticket#getIssueReported()}.
	 */
	@Test
	public final void testGetIssueReported() {
		assertEquals(this.ticket.getIssueReported(),"Printer error");
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Ticket#setIssueReported(java.lang.String)}.
	 */
	@Test
	public final void testSetIssueReported() {
		this.ticket.setIssueReported(null);
		assertEquals(this.ticket.getIssueReported(),null);
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Ticket#getTicketNumber()}.
	 */
	@Test
	public final void testGetTicketNumber() {
		assertEquals(this.ticket.getTicketNumber(),"23578");
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Ticket#setTicketNumber(java.lang.String)}.
	 */
	@Test
	public final void testSetTicketNumber() {
		this.ticket.setTicketNumber(null);
		assertEquals(this.ticket.getTicketNumber(),null);
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Ticket#getTicketStatus()}.
	 */
	@Test
	public final void testGetTicketStatus() {
		assertEquals(this.ticket.getTicketStatus(),"Open");
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Ticket#setTicketStatus(java.lang.String)}.
	 */
	@Test
	public final void testSetTicketStatus() {
		this.ticket.setTicketStatus(null);
		assertEquals(this.ticket.getTicketStatus(),null);
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Ticket#getIssueDate()}.
	 */
	@Test
	public final void testGetIssueDate() {
		assertEquals(this.ticket.getIssueDate(),this.issued);
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Ticket#setIssueDate(java.util.Date)}.
	 */
	@Test
	public final void testSetIssueDate() {
		this.ticket.setIssueDate(null);
		assertEquals(this.ticket.getIssueDate(),null);
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Ticket#getPriority()}.
	 */
	@Test
	public final void testGetPriority() {
		assertEquals(this.ticket.getPriority(),"Low");
	}

	/**
	 * Test method for {@link com.hcl.hackathon.fullstack.model.Ticket#setPriority(java.lang.String)}.
	 */
	@Test
	public final void testSetPriority() {
		this.ticket.setPriority(null);
		assertEquals(this.ticket.getPriority(),null);
	}

}
