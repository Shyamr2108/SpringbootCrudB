package com.masai.main.entity;


import jakarta.persistence.*;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int t_id;

    @OneToOne(mappedBy = "address")
    private Course course;

    public Teacher() {}

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher(int t_id, Course course) {
        this.t_id = t_id;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "t_id=" + t_id +
                ", course=" + course +
                '}';
    }
}
