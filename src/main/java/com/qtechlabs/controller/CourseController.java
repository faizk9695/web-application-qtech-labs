package com.qtechlabs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qtechlabs.dto.CourseDTO;
import com.qtechlabs.service.CourseServiceImpl;

@RestController
@RequestMapping("/api/v1/course")
public class CourseController {
	private static final Logger log = LoggerFactory.getLogger(CourseController.class);

	@Autowired
	private CourseServiceImpl courseservice;

	@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CourseDTO> CreateCourse(@RequestBody CourseDTO courseDTO) {
		log.info("Create Api");
		CourseDTO CreateCourse = courseservice.CreateCourse(courseDTO);
		return new ResponseEntity<CourseDTO>(CreateCourse, HttpStatus.CREATED);
	}

	@GetMapping("/{courseid}")
	public ResponseEntity<CourseDTO> getcourse(@PathVariable Long courseid) {
		log.info(" Api");
		CourseDTO Course = courseservice.getcourse(courseid);
		return new  ResponseEntity<CourseDTO>(Course,HttpStatus.OK);

	}

	@PutMapping("/")
	public ResponseEntity<CourseDTO> updateCourse(@PathVariable Long courseId ,@RequestBody CourseDTO courseDTO) {
		log.info(" Api");
		CourseDTO updatecourse =courseservice.updateCourse(courseId ,courseDTO);
		return new  ResponseEntity<CourseDTO>(updatecourse,HttpStatus.OK);

	}

	@DeleteMapping("/{courseId}")
	public ResponseEntity<CourseDTO> deleteCourse(CourseDTO courseId) {
		log.info(" Api");
		CourseDTO deletecourse= courseservice.deleteCourse(courseId);
		return new  ResponseEntity<CourseDTO>(deletecourse,HttpStatus.OK);

	}

}
