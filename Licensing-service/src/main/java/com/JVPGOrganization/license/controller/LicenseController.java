package com.JVPGOrganization.license.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="v1/organization/{organizationId}/license")
public class LicenseController {

	@RequestMapping(value="/{licenseId}",method = RequestMethod.GET)
	public ResponseEntity<String> getLicense( @PathVariable("organizationId") String organizationId,
			@PathVariable("licenseId") String licenseId) {
		return ResponseEntity.ok("Success");
	}
	
}
