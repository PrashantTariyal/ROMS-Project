package com.fse.returnorderControllerProcessingMicroservice.dto;

import com.fse.returnorderControllerProcessingMicroservice.util.ComponentType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcessRequest {

	private String userName;
	private Long contactNumber;
//	private Long cardNumber;
	private Boolean isPriorityRequest;

	private ComponentType componentType;
	private String componentName;
	private Long quantity;
}
