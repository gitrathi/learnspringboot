package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	// /courses
	
	//Course: id, name, author
	@RequestMapping("/courses")
	public List<Course> retriveCourses() {
		return Arrays.asList(new Course(1, "AWS", "in28minutes"),
							new Course(2, "Azure", "in28minutes"));	}
	
}
