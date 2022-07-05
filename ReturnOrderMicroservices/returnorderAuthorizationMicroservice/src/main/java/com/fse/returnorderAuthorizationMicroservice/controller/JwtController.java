package com.fse.returnorderAuthorizationMicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fse.returnorderAuthorizationMicroservice.service.JwtService;
import com.fse.returnorderAuthorizationMicroservice.entity.JwtRequest;
import com.fse.returnorderAuthorizationMicroservice.entity.JwtResponse;

@RestController
@CrossOrigin
@RequestMapping("/auth")
public class JwtController {

	@Autowired
	private JwtService jwtService;

	@PostMapping({ "/login" })
	public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
		return jwtService.createJwtToken(jwtRequest);
	}

	@GetMapping("/validate")
	@PreAuthorize("hasRole('User')")
	public boolean validateAndReturnUser(@RequestHeader(value = "Authorization") String token,
			@RequestParam String userName) throws Exception {

		return jwtService.validateJwtToken(token, userName);

	}
}
