package com.masai.main.repository;

import com.masai.main.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {

    public List<Teacher> findBymail_id(int t_id);
}
