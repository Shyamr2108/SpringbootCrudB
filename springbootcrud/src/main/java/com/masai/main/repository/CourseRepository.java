package com.masai.main.repository;

import com.masai.main.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Integer> {

    public List<Course> findByCourse_id(int c_id);

}
