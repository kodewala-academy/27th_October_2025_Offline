package com.kodewala.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.location.controller.request.LocationRequest;
import com.kodewala.location.controller.response.LocationResponse;
import com.kodewala.location.service.LocationService;

@RestController
@RequestMapping("/api/user/location/")
public class LocationUpdateController {

	@Autowired
	LocationService locationService;
    @PostMapping("update") 
	public ResponseEntity<LocationResponse> updateLocation(@RequestBody LocationRequest locationRequest) {

		boolean status = locationService.updateLocation(locationRequest.getUser(), locationRequest.getDeviceID(),
				locationRequest.getLg(), locationRequest.getLt());

		LocationResponse locationResponse = new LocationResponse();
		locationResponse.setStatus("" + status);
		locationResponse.setMessage("Location Updated!");

		return ResponseEntity.ok(locationResponse);
	}

}
