package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.dto.EmployeeDTO;
import com.service.EmployeeService;

@RestController
public class EmployeeViewController {

	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	private JavaMailSender emailSender;
	

	@GetMapping({ "/", "login" }) // slash as default page String viewLogin() {
	String loginViewPage() {
		return "login";
	}
	
	
	 @PostMapping("loginPost") 
	  String logging(@RequestParam String emailId,@RequestParam String password, Model model, HttpSession session) {

		 EmployeeDTO employeeDTO = employeeService.authenticate(emailId, password);

		 if(employeeDTO != null) {  //checks valid employee

			 byte[] b = employeeDTO.getTphoto();
			 byte[] encodeBase64 = Base64.getEncoder().encode(b);

				try {
					String base64DataString = new String(encodeBase64, "UTF-8");
					employeeDTO.setPhoto(base64DataString);

				}catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}

			  session.setAttribute("userData", employeeDTO);
			  model.addAttribute("loginMsg", "Successfull Login!");
			  model.addAttribute("emp", employeeDTO);
			  return "showLoginUser";

		  } else {

			  model.addAttribute("loginMsg", "Incorrect Email/Password!");
			  return "login";
		  }


	 }
	

	@GetMapping("registrationForm")
	String showRegistration() {
		return "registration";
	}


	@PostMapping("register")
	String registerUser(@ModelAttribute EmployeeDTO employeeDTO, Model model, @RequestParam String emailId) {
		
		employeeService.registerUser(employeeDTO);
		
		EmployeeDTO employeeDTO1 = employeeService.findByEmailId(emailId);
		byte[] b = employeeDTO1.getTphoto();
		byte[] encodeBase64 = Base64.getEncoder().encode(b);
		
		try {
			String base64DataString = new String(encodeBase64, "UTF-8");
			employeeDTO1.setPhoto(base64DataString);
			
		}catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		model.addAttribute("emp" , employeeDTO1);
	
		
		return "showLoginUser";
	}


	 @GetMapping("showAllEmployees") 
	 String showAllEmployees(Model model, HttpSession session) {
		 
		 
		
		 List<EmployeeDTO> employeeDTOList1 = employeeService.fetchAllEmployee();
		 List<EmployeeDTO> employeeDTOList = new ArrayList<>();
		 
		 for(EmployeeDTO employeeDTO : employeeDTOList1) {
			 
			 byte[] b =employeeDTO.getTphoto();
			 byte[] encodeBase64 = Base64.getEncoder().encode(b);
			 
			 try {
				 String base64DataString = new String(encodeBase64, "UTF-8");
				 employeeDTO.setPhoto(base64DataString);
				 employeeDTOList.add(employeeDTO);
				 
			 }catch (UnsupportedEncodingException e) {
				 e.printStackTrace();
			 }
		 }
		 
		 model.addAttribute("employeeDTOList", employeeDTOList);
		 return "showAllEmployees";
	 }


	 @GetMapping("editEmployee")
	 String editEmployee(@RequestParam int employeeId, Model model) {
		 
		 EmployeeDTO employeeDTO = employeeService.fetchEmpById(employeeId);
		 model.addAttribute("employeeDTO", employeeDTO);
		 
		 
		 return "editForm";
	 }
	 
	 
	 @PostMapping("updateEmployee")
	 public String updateEmployeeAndPhoto( @ModelAttribute EmployeeDTO employeeDTO, @RequestParam("file") MultipartFile file, @RequestParam("username") String username) {
		 
		 
		 
		 employeeService.updateEmployeeAndPhoto(employeeDTO);
		 /*
		 SimpleMailMessage email = new SimpleMailMessage();
			email.setTo(employeeDTO.getEmailId());
			email.setSubject("Account Updated Successfully!");
			email.setText("Hello, " + employeeDTO.getEmployeeName() + ", your account is successfully updated!" + "\n Your password is: " + employeeDTO.getPassword());
			emailSender.send(email);
		 */
		 
		 return "redirect:showAllEmployees";
	 }


}
