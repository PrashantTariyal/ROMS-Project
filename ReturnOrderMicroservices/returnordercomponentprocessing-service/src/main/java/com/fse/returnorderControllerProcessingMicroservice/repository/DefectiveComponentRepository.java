package com.fse.returnorderControllerProcessingMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fse.returnorderControllerProcessingMicroservice.entity.DefectiveComponentDetail;

import java.util.List;
@Repository
public interface DefectiveComponentRepository extends JpaRepository<DefectiveComponentDetail, Long> {
	public List<DefectiveComponentDetail> findAllByUserName(String userName);
}
