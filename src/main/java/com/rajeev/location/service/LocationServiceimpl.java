package com.rajeev.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajeev.location.entity.Location;
import com.rajeev.location.repos.LocationReposgatry;
@Service
public class LocationServiceimpl implements LocationService {
    @Autowired 
	private LocationReposgatry rposgatry; 
	@Override
	public Location saveLocation(Location location) {
		return rposgatry.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return rposgatry.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		rposgatry.delete(location);
	}

	@Override
	public Optional<Location> getLocationById(int id) {
		return rposgatry.findById(id);
	}

	@Override
	public List<Location> getAllLocation() {
		return (List<Location>) rposgatry.findAll();
	}

}
