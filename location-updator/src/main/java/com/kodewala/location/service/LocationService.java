package com.kodewala.location.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.location.entity.LocationEntity;
import com.kodewala.location.repository.LocationRepository;

@Service
public class LocationService {

	@Autowired
	LocationRepository locationRepository;

	public boolean updateLocation(String user, String devId, String lg, String lt) {
		boolean status = false;
		LocationEntity locationEntity = new LocationEntity();
		locationEntity.setDeviceID(devId);
		locationEntity.setUser(user);
		locationEntity.setLg(lg);
		locationEntity.setLt(lt);

		LocationEntity response = locationRepository.save(locationEntity);
		if (response.getId() > 0) {
			status = true;
		}
		return status;
	}

}
