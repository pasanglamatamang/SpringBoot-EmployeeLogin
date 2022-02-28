package com.dto;

import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

public class EmployeeDTO {
	
	private int employeeId;
	private String employeeName;
	private String emailId;
	private String password;
	private int salary;
	
	
	private String photo;
	private MultipartFile file;
	private byte[] tphoto;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public byte[] getTphoto() {
		return tphoto;
	}
	public void setTphoto(byte[] tphoto) {
		this.tphoto = tphoto;
	}
	
	
	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", employeeName=" + employeeName + ", emailId=" + emailId
				+ ", password=" + password + ", salary=" + salary + ", photo=" + photo + ", file=" + file + ", tphoto="
				+ Arrays.toString(tphoto) + "]";
	}
	
	
	
	

}
