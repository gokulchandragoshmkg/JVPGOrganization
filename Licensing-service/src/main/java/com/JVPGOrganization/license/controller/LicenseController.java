package com.JVPGOrganization.license.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="v1/organization/{organizationId}/license")
public class LicenseController {

	@GetMapping("/{licenseId}")
	public ResponseEntity<String> getLicense( @PathVariable String organizationId,
            @PathVariable String licenseId) {
		return ResponseEntity.ok("Success");
	}
	
	@PostMapping
	public ResponseEntity<String> createLicense(@PathVariable String organizationId) {
		return ResponseEntity.ok(organizationId  + "Post success");
	}
}
