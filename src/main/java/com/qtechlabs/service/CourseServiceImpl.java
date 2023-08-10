package com.qtechlabs.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qtechlabs.dto.CourseDTO;
import com.qtechlabs.entity.CourseEntity;
import com.qtechlabs.repository.CourseRepository;

@Component
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private ModelMapper modelmapper;

	@Override
	public CourseDTO CreateCourse(CourseDTO courseDTO) {

		CourseEntity courseEntity = modelmapper.map(courseDTO, CourseEntity.class);
		courseRepository.save(courseEntity);

		return courseDTO;
	}

	@Override
	public CourseDTO getcourse(Long courseid) {
		Optional<CourseEntity> courseOptional = courseRepository.findById(courseid);
		if (courseOptional.isPresent()) {
			CourseEntity courseEntity = courseOptional.get();
			CourseDTO courseDTO = modelmapper.map(courseEntity, CourseDTO.class);
			return courseDTO;
		}

		return null;
	}

	@Override
	public CourseDTO updateCourse(Long courseid, CourseDTO courseDTO) {
		Optional<CourseEntity> course = courseRepository.findById(courseid);

		if (course.isPresent()) {

		}
		return null;
	}

	@Override
	public CourseDTO deleteCourse(CourseDTO courseId) {

		return null;
	}

}
