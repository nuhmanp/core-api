package com.urbango.in.service;

import java.util.List;

import com.urbango.in.model.Location;

public interface LocationService {
	
	public void addNewLocation(Location location);
	
	List<Location> getAllLocations();

}
