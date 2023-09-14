package com.prakash.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;
	private String courseName ;
	private String courseDuration;
	private String courseFee;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "studentId")
	private List<Student> students;
	
	
}
