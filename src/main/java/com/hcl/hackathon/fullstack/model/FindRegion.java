/**
 * 
 */
package com.hcl.hackathon.fullstack.model;

/**
 * @author saul
 *
 */
public class FindRegion {
	
	private String regionId;
	private String StateId;
	private String cityId;
	/**
	 * @return the regionId
	 */
	public String getRegionId() {
		return regionId;
	}
	/**
	 * @param regionId the regionId to set
	 */
	public FindRegion setRegionId(String regionId) {
		this.regionId = regionId;
		return this;
	}
	/**
	 * @return the stateId
	 */
	public String getStateId() {
		return StateId;
	}
	/**
	 * @param stateId the stateId to set
	 */
	public FindRegion setStateId(String stateId) {
		StateId = stateId;
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
	public FindRegion setCityId(String cityId) {
		this.cityId = cityId;
		return this;
	}
		
}
