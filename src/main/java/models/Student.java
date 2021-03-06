/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.*;

/**
 *
 * @author Ahmed Hammad
 */
@Entity
//@NamedQuery(name = "Students.findAll",
//        query = "SELECT s from Student s"
//)
//@Table(name = "student")
public class Student {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String major;
    private Float grade;

  

    public Student() {
    }

    public Student(int id, String name, String major, float grade) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.grade = grade;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", major=" + major + ", grade=" + grade + '}';
    }
    

}
