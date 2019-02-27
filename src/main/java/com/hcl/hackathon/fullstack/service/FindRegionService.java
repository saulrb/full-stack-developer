/**
 * 
 */
package com.hcl.hackathon.fullstack.service;

import com.hcl.hackathon.fullstack.model.*;
import java.util.List;
/**
 * @author saul
 *
 */
public interface FindRegionService {

	List<Region> findRegionByCriteria(FindRegion findRegion);
	
}
