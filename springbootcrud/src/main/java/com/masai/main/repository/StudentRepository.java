package com.masai.main.repository;

import com.masai.main.entity.Course;
import com.masai.main.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    public List<Student> findByCourse_id(int id);
}
