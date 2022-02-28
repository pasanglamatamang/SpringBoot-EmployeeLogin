package com.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.EmployeeDTO;
import com.entity.EmployeeEntity;
import com.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void registerUser(EmployeeDTO employeeDTO) {

		EmployeeEntity employeeEntity = new EmployeeEntity();
		BeanUtils.copyProperties(employeeDTO, employeeEntity);
		
		//for photo
		try {
			employeeEntity.setTphoto(employeeEntity.getFile().getBytes());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		employeeRepository.save(employeeEntity);
		
	}

	
	@Override
	public EmployeeDTO findByEmailId(String emailId) {

		EmployeeEntity employeeEntity = employeeRepository.findByEmailId(emailId);
		
		EmployeeDTO employeeDTO = new EmployeeDTO();
		BeanUtils.copyProperties(employeeEntity, employeeDTO);
		
		
		return employeeDTO;
	}


	
	@Override
	public EmployeeDTO authenticate(String emailId, String password) {

        Optional <EmployeeEntity> optional = employeeRepository.findByEmailIdAndPassword(emailId, password);
		
        if(optional.isPresent()) {
        	
        	EmployeeEntity employeeEntity = optional.get();
        	
        	EmployeeDTO employeeDTO = new EmployeeDTO();
			BeanUtils.copyProperties(employeeEntity, employeeDTO);
			return employeeDTO;
        }
        return null;
        
        
		
		
	}


	@Override
	public List<EmployeeDTO> fetchAllEmployee() {

		List<EmployeeEntity> employeeEntityList = employeeRepository.findAll(); //employeeEntity list
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();  // now convert employee entity list to DTO list
		
		for(EmployeeEntity employeeEntity : employeeEntityList) {
			
			EmployeeDTO employeeDTO = new EmployeeDTO();
			BeanUtils.copyProperties(employeeEntity, employeeDTO);
			
			employeeDTOList.add(employeeDTO);
		}
		
		return employeeDTOList;
	}


	@Override
	public EmployeeDTO fetchEmpById(int employeeId) {

		EmployeeEntity employeeEntity = employeeRepository.findByEmployeeId(employeeId);
		EmployeeDTO employeeDTO = new EmployeeDTO();
		BeanUtils.copyProperties(employeeEntity, employeeDTO);
		return employeeDTO;
	}


	@Override
	public void updateEmployeeAndPhoto(EmployeeDTO employeeDTO) {

		EmployeeEntity employeeEntity = new EmployeeEntity();
		BeanUtils.copyProperties(employeeDTO, employeeEntity);

		employeeRepository.save(employeeEntity);
		
	}


	

	
	
	
}