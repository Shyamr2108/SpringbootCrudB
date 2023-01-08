package com.masai.main.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Icard {

    private int iid;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;


    public Icard() {}

    public Icard(int iid, Student student) {
        this.iid = iid;
        this.student = student;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    @Override
    public String toString() {
        return "Icard{" +
                "iid=" + iid +
                ", student=" + student +
                '}';
    }
}
