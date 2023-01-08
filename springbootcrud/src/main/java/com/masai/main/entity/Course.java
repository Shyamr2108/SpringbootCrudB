package com.masai.main.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Course")
@AllArgsConstructor
@NoArgsConstructor
@Data
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
