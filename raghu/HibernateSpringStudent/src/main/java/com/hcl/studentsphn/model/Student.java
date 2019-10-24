package com.hcl.studentsphn.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	private int RollNo;
	private String StudentName;
	private int Age;
	private String Gender;
	private String Country;
	private Date DateOfJoin;
	private float FinalScore;
	
	
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public Date getDateOfJoin() {
		return DateOfJoin;
	}
	public void setDateOfJoin(Date dateOfJoin) {
		DateOfJoin = dateOfJoin;
	}
	public float getFinalScore() {
		return FinalScore;
	}
	public void setFinalScore(float finalScore) {
		FinalScore = finalScore;
	}
	
	

}
