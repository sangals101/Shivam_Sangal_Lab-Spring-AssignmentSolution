package com.journaldev.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* @author Shivam
 *
 */
@Entity
@Table(name="STUDENT")
public class Student {

	@Id
	@Column(name="studentId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	
	private String name;
	
	private String department;
	
	private String country;

	public int getId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString(){
		return "studentId="+studentId+", name="+name+",department=\"+department+\" , country="+country;
	}
}
