package com.qtechlabs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CourseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseId;
	private long fees;
	private String Instructor;
	private int duration;
	private String courseName;
	private String CourseDescription;
	
	public CourseEntity() {
		
	}

	public CourseEntity(long courseId, long fees, String instructor, int duration, String courseName,
			String courseDescription) {
		super();
		this.courseId = courseId;
		this.fees = fees;
		Instructor = instructor;
		this.duration = duration;
		this.courseName = courseName;
		CourseDescription = courseDescription;
	}
	
	
	@Override
	public String toString() {
		
		return "CourseEntity[courseid=" + courseId + "; courseName=" +	courseName + ", CourseDescription="
				+ CourseDescription + ", duration=" + duration + ", fees=" + fees + ", Instructor=" + Instructor + "]";
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public long getFees() {
		return fees;
	}

	public void setFees(long fees) {
		this.fees = fees;
	}

	public String getInstructor() {
		return Instructor;
	}

	public void setInstructor(String instructor) {
		Instructor = instructor;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return CourseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		CourseDescription = courseDescription;
	}
	
	
	
	
	
	
	
	
	
	
	

}
