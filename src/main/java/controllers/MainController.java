/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repositories.StudentRepository;
import services.StudentService;

/**
 *
 * @author Ahmed Hammad
 */
@RestController
public class MainController {

    @Autowired(required = true)
    StudentRepository studentRepo;

//    @RequestMapping("/showAllStudent")
//    public String showAllStudent() {
//            List<Student> emps = studentRepo.findAll();
//        String str = "";
//        for (Student e : emps) {
//            str += e + "<br>";
//        }
//        return String.format("%s", str);
//    } 
    @RequestMapping("/home")
    public String Index() {
        return String.format("%s", "JPA Using Spring boot");
    }

//    @RequestMapping("/showAllStudent")
//    public String showAllStudent() {
//        List<Student> students = studentRepo.findAll();
//        String str = "";
//        for (Student s : students) {
//            str += s + "<br>";
//        }
//        return String.format("%s", str);
//    }
    
    @Autowired
    private StudentService stdService;

    @RequestMapping("/showAllStudent")
    public String showAllStudent() {
        String result = stdService.gettAllStudents();
        //System.out.println(result);
        return stdService.gettAllStudents();
    }

    @RequestMapping("/getStudent/{id}")
    public String getStudent(@PathVariable Integer id) {
        return stdService.getStudent(id);
    }

    @RequestMapping("/addStudent")
    public String addStudent() {
        Student newStudent = new Student();
        newStudent.setId(120141554);
        newStudent.setName("Hossam ");
        newStudent.setMajor("Eng");
        newStudent.setGrade(90.8f);
        return stdService.addStudent(newStudent);

    }
      
}
