/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import repositories.StudentRepository;

/**
 *
 * @author Ahmed Hammad
 */
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepo;

    public StudentService() {
        System.out.println("Service layer is created");
    }
   
    public String gettAllStudents() {
        List<Student> students = studentRepo.findAll();
        String str = "";
        for (Student e : students) {
            str += e + "<br>";
        }
        return String.format("%s", str);
    }

    public String getStudent(int id) {
        Student std = studentRepo.findById(id).get();
        return String.format("%s", std);
    }
    
    public String addStudent(Student std) {
        studentRepo.save(std);
        return String.format("%s", "Successfully added new Studnet");
    }
}
