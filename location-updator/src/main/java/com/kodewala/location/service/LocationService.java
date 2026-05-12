package com.kodewala.location.service;

import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

	public void findLocation(int page, int records) {
		Pageable pageable = PageRequest.of(page, records);

		org.springframework.data.domain.Page<LocationEntity> pages = locationRepository.findAll(pageable);

		for (LocationEntity location : pages.getContent()) {
			System.out.println(location.getDeviceID() + " " + location.getId() + " " + location.getUser());

		}
	}

}
