package controller;

import entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.StudentService;

@Controller
public class StudentController {

    private StudentService studentService;
//zeyda @autowired aana 1 constructor
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //handler method to handle list students and return mode and view
    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }
}
