package com.masai.main.service;

import com.masai.main.entity.Course;
import com.masai.main.entity.Icard;
import com.masai.main.entity.Student;

import java.util.List;

public interface StudentService {
    public Student create(Student user);
    public Student getOne(int id);
    public List<Student> getAll();
    public void delete(int id);

    public Course createcourse(Course c);
    public Course get(int c_id);

    public Icard createicard(Icard i);
    public Icard geticard(int iid);
}
