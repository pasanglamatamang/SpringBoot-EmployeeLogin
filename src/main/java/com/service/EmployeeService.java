package com.service;

import java.util.List;

import com.dto.EmployeeDTO;

public interface EmployeeService {

	void registerUser(EmployeeDTO employeeDTO);

	EmployeeDTO findByEmailId(String emailId);

	EmployeeDTO authenticate(String emailId, String password);

	List<EmployeeDTO> fetchAllEmployee();

	EmployeeDTO fetchEmpById(int employeeId);

	void updateEmployeeAndPhoto(EmployeeDTO employeeDTO);

	

	

	

}
