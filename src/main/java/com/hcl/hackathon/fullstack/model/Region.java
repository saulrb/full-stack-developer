/**
 * 
 */
package com.hcl.hackathon.fullstack.model;

import java.util.List;

/**
 * @author saul
 *
 */
public class Region {
	
	private String id;
	private String name;
	private String stateId;
	private String state;
	private String cityId;
	private String city;
	private Float latitude;
	private Float longitude;
	private List<Ticket> tickets;
	private Integer ticketCount;
	

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public Region setId(String id) {
		this.id = id;
		return this;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public Region setName(String name) {
		this.name = name;
		return this;
	}
	/**
	 * @return the stateId
	 */
	public String getStateId() {
		return stateId;
	}
	/**
	 * @param stateId the stateId to set
	 */
	public Region setStateId(String stateId) {
		this.stateId = stateId;
		return this;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public Region setState(String state) {
		this.state = state;
		return this;
	}
	/**
	 * @return the cityId
	 */
	public String getCityId() {
		return cityId;
	}
	/**
	 * @param cityId the cityId to set
	 */
	public Region setCityId(String cityId) {
		this.cityId = cityId;
		return this;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public Region setCity(String city) {
		this.city = city;
		return this;
	}
	/**
	 * @return the latitude
	 */
	public Float getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public Region setLatitude(Float latitude) {
		this.latitude = latitude;
		return this;
	}
	/**
	 * @return the longitude
	 */
	public Float getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public Region setLongitude(Float longitude) {
		this.longitude = longitude;
		return this;
	}
	/**
	 * @return the tickets
	 */
	public List<Ticket> getTickets() {
		return tickets;
	}
	/**
	 * @param tickets the tickets to set
	 */
	public Region setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
		return this;
	}
	
	/**
	 * @return the ticketCount
	 */
	public Integer getTicketCount() {
		return ticketCount;
	}
	/**
	 * @param ticketCount the ticketCount to set
	 */
	public Region setTicketCount(Integer ticketCount) {
		this.ticketCount = ticketCount;
		return this;
	}
}
