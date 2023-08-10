package com.qtechlabs.dto;

public class CourseDTO {

	private long courseId;
	private long fees;
	private String Instructor;
	private int duration;
	private String courseName;
	private String CourseDescription;

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
