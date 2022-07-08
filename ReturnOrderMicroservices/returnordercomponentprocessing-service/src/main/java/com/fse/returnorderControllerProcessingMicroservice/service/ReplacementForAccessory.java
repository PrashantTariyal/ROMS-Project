package com.fse.returnorderControllerProcessingMicroservice.service;

import org.springframework.stereotype.Service;

import com.fse.returnorderControllerProcessingMicroservice.registry.ProcessingServiceFactory;
@Service("ACCESSORY")
public class ReplacementForAccessory  implements ProcessingServiceFactory {

	@Override
	public Long getProcessingDays() {
		// TODO Auto-generated method stub
		return (long) 2;
	}

	@Override
	public Double getProcessingCharge() {
		// TODO Auto-generated method stub
		return (double) 300;
	}

}
