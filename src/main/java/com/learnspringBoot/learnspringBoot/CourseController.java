package com.learnspringBoot.learnspringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnspringBoot.learnspringBoot.course.Course;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourse() {
		return Arrays.asList(new Course(1, "SprintBoot", "Apex"), new Course(2, "SprintData", "Rachitha"),new Course(3, "SpringMVC", "Dhanu")

		);
	}

}
