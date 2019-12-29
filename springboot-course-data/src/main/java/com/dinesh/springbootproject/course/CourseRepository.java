package com.dinesh.springbootproject.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	public List<Course> findByName(String name);

	public List<Course> findByDescription(String description);

	public List<Course> findByTopicId(String topicid);
}
