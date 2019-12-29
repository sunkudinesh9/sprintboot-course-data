package com.dinesh.springbootproject.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicid) {
		List<Course> coursesList = new ArrayList<Course>();
		courseRepository.findByTopicId(topicid).forEach(coursesList::add);
		return coursesList;
	}

	public Optional<Course> getcourse(String id) {
		return courseRepository.findById(id);
	}

	public void addcourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
