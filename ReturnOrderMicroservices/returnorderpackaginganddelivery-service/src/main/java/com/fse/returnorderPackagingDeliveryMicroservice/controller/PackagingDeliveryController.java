package com.fse.returnorderPackagingDeliveryMicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fse.returnorderPackagingDeliveryMicroservice.service.PackagingAndDeliveryService;
import com.fse.returnorderPackagingDeliveryMicroservice.util.ComponentType;

@RestController
@CrossOrigin
@RequestMapping("/GetPackagingDeliveryCharge")
public class PackagingDeliveryController {

	@Autowired
	public PackagingAndDeliveryService packagingAndDeliveryService;

	@GetMapping("/{componentType}/{count}")
	public double getPackagingAndDeliveryCharge(@PathVariable ComponentType componentType, @PathVariable Long count) {
		return packagingAndDeliveryService.getCharge(componentType, count);
	}
}
