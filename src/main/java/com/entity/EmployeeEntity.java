package com.entity;


import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class EmployeeEntity {
	
	private int employeeId;
	private String employeeName;
	private String emailId;
	private String password;
	private int salary;


	private MultipartFile file;
	private byte[] tphoto;
	
	@Id
	@GeneratedValue
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
	
	@Transient
	public MultipartFile getFile() {
		return file;
	}
	
	
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
	@Column(name="photo",columnDefinition="longblob")
	public byte[] getTphoto() {
		return tphoto;
	}
	public void setTphoto(byte[] tphoto) {
		this.tphoto = tphoto;
	}
	
	
	@Override
	public String toString() {
		return "EmployeeEntity [employeeId=" + employeeId + ", employeeName=" + employeeName + ", emailId=" + emailId
				+ ", password=" + password + ", salary=" + salary + ", file=" + file + ", tphoto="
				+ Arrays.toString(tphoto) + "]";
	}

	
	
	

}
