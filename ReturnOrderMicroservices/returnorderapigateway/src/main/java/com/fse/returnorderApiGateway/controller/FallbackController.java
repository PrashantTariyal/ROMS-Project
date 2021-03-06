package com.fse.returnorderApiGateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@RequestMapping("/returnFallback")
	public String componentReturnServiceFallback() {
		return "Return Service is down currently,  Try Again Later";
	}

	@RequestMapping("/packagingAndDeliveryFallback")
	public String packagingAndDeliveryServiceFallback() {
		return "Packaging & Delivery Service is down currently,  Try Again Later";
	}

	@RequestMapping("/authFallback")
	public String authServiceFallback() {
		return "Authentication Service is down currently,  Try Again Later";
	}

}
