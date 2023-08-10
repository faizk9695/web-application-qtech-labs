package com.qtechlabs.service;


import com.qtechlabs.dto.CourseDTO;

public interface CourseService {

	public CourseDTO CreateCourse( CourseDTO courseDTO);

	public CourseDTO getcourse( Long courseid);

	public CourseDTO updateCourse( Long courseid ,CourseDTO courseDTO);

	public CourseDTO deleteCourse(CourseDTO courseId);

}
