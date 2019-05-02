package com.urbango.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.urbango.in.model.Location;
import com.urbango.in.service.LocationService;

@RestController
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@RequestMapping(value="/location/add", method=RequestMethod.POST)
	String addNewLocation(@RequestBody Location location) {
		locationService.addNewLocation(location);
		return "SUCCESS";
		
	}
	
	@RequestMapping(value="/locations", method=RequestMethod.GET)
	List<Location> addNewLocation() {
		return locationService.getAllLocations();
		
	}
	
	

}
