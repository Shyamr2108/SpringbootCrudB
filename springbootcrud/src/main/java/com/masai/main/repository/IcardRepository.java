package com.masai.main.repository;

import com.masai.main.entity.Course;
import com.masai.main.entity.Icard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IcardRepository extends JpaRepository<Icard,Integer> {

    public List<Icard> findByCourse_id(int iid);

}
