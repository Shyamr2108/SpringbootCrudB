package com.masai.main.repository;

import com.masai.main.entity.Syllabus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SyllabusRepository extends JpaRepository<Syllabus,Integer> {
    public List<Syllabus> findBymail_id(int s_id);
}
