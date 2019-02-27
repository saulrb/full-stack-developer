/**
 * 
 */
package com.hcl.hackathon.fullstack.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.hackathon.fullstack.model.FindRegion;
import com.hcl.hackathon.fullstack.model.Region;
import com.hcl.hackathon.fullstack.service.FindRegionService;

import java.util.List;

/**
 * @author saul
 *
 */
@CrossOrigin(origins = "http://localhost;4200", maxAge = 3600)
@RestController
@RequestMapping({"/api/region"})
public class RegionRestController {

	// Create a region service 
	@Autowired
	private FindRegionService findRegionService;
	
	@PostMapping(path = "{/find}")
	public List<Region> findByCriteria(@RequestBody FindRegion findRegion) {
		
		// Find region service implementation 
		return findRegionService.findRegionByCriteria(findRegion);
		
	}
}
