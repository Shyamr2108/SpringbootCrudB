package com.masai.main.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Course")
public class Course {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int c_id;
        private String courses;

        @ManyToOne
        @JoinColumn(name = "Student_id", referencedColumnName = "id")
        Student ob;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "syllabus_id", referencedColumnName = "id")
        private Syllabus syllabus;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "teacher_id", referencedColumnName = "id")
        private Teacher teacher;

        public Course() {}

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public Student getOb() {
        return ob;
    }

    public void setOb(Student ob) {
        this.ob = ob;
    }

    public Syllabus getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(Syllabus syllabus) {
        this.syllabus = syllabus;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course(int c_id, String courses, Student ob, Syllabus syllabus, Teacher teacher) {
        this.c_id = c_id;
        this.courses = courses;
        this.ob = ob;
        this.syllabus = syllabus;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "c_id=" + c_id +
                ", courses='" + courses + '\'' +
                ", ob=" + ob +
                ", syllabus=" + syllabus +
                ", teacher=" + teacher +
                '}';
    }
}
