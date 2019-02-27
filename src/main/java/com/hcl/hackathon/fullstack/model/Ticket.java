/**
 * 
 */
package com.hcl.hackathon.fullstack.model;

import java.util.Date;

/**
 * @author saul
 *
 */
public class Ticket {
	private String issueReported;
	private String ticketNumber;
	private String ticketStatus;
	private Date issueDate;
	private String priority;
	/**
	 * @return the issueReported
	 */
	public String getIssueReported() {
		return issueReported;
	}
	/**
	 * @param issueReported the issueReported to set
	 */
	public Ticket setIssueReported(String issueReported) {
		this.issueReported = issueReported;
		return this;
	}
	/**
	 * @return the ticketNumber
	 */
	public String getTicketNumber() {
		return ticketNumber;
	}
	/**
	 * @param ticketNumber the ticketNumber to set
	 */
	public Ticket setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
		return this;
	}
	/**
	 * @return the ticketStatus
	 */
	public String getTicketStatus() {
		return ticketStatus;
	}
	/**
	 * @param ticketStatus the ticketStatus to set
	 */
	public Ticket setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
		return this;
	}
	/**
	 * @return the issueDate
	 */
	public Date getIssueDate() {
		return issueDate;
	}
	/**
	 * @param issueDate the issueDate to set
	 */
	public Ticket setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
		return this;
	}
	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}
	/**
	 * @param priority the priority to set
	 */
	public Ticket setPriority(String priority) {
		this.priority = priority;
		return this;
	}
	
	
}
