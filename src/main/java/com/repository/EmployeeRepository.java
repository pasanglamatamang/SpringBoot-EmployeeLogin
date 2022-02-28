package com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

	EmployeeEntity findByEmailId(String emailId);

	Optional <EmployeeEntity> findByEmailIdAndPassword(String emailId, String password);

	EmployeeEntity findByEmployeeId(int employeeId);

	
	

	
	
	
	

}
