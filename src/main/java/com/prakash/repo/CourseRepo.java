package com.prakash.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prakash.entity.Course;
import com.prakash.utils.CourseStudent;
@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {
	
	@Query("select courseId, courseName, courseDuration,courseFee, studentId,studentName,studentAddres,studentEmail from Course")
	public List<CourseStudent> getCourseStudent();

}
