package com.fse.returnorderControllerProcessingMicroservice.service;

import org.springframework.stereotype.Service;

import com.fse.returnorderControllerProcessingMicroservice.registry.ProcessingServiceFactory;

@Service("INTEGRAL")
public class RepairForIntegralService implements ProcessingServiceFactory {

	@Override
	public Long getProcessingDays() {
		// TODO Auto-generated method stub
		return (long) 5;
	}

	@Override
	public Double getProcessingCharge() {
		// TODO Auto-generated method stub
		return  (double) 500;
	}

}
