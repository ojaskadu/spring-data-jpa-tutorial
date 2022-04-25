package com.dailycodebuffer.spring.data.jpa.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor; 

@Entity  //whatever you do in student class will be reflected in db
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table( 
		name = "tbl_student",
		uniqueConstraints = @UniqueConstraint(
				name="emailid_unique",
				columnNames="email_address"
				)
		)
public class Student {

	@Id
	@SequenceGenerator(
			name = "student_sequence",
			sequenceName = "student_sequence",
			allocationSize = 1
			)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="student_sequence")
	private Long studentId;
	
	private String firstName;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getGuardianEmail() {
		return guardianEmail;
	}
	public void setGuardianEmail(String guardianEmail) {
		this.guardianEmail = guardianEmail;
	}
	public String getGuardianMobile() {
		return guardianMobile;
	}
	public void setGuardianMobile(String guardianMobile) {
		this.guardianMobile = guardianMobile;
	}
	private String lastName;
	
	@Column(name= "email_address",
			nullable = false
			)
	private String emailId;
	
	private String guardianName;
	private String guardianEmail;
	private String guardianMobile;

}
