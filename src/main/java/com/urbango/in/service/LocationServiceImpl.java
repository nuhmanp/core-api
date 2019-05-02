package com.urbango.in.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbango.in.model.Location;
import com.urbango.in.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void addNewLocation(Location location) {
		
		locationRepository.save(location);
	}

	@Override
	public List<Location> getAllLocations() {
		return locationRepository.findAll();
	}

}
