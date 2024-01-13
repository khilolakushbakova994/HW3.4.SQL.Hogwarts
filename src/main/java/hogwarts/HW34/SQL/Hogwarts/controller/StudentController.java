package hogwarts.HW34.SQL.Hogwarts.controller;


import hogwarts.HW34.SQL.Hogwarts.model.Faculty;
import hogwarts.HW34.SQL.Hogwarts.model.Student;
import hogwarts.HW34.SQL.Hogwarts.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("{id}")
    public ResponseEntity<Student> find(@PathVariable Long id) {
        Student student = studentService.find(id);
        if (student == null) {
            return ResponseEntity.notFound().build();

        }
        return ResponseEntity.ok(student);

    }

    @PutMapping
    public ResponseEntity<Student> changeStudentInfo(@RequestBody Student student) {
        Student changeStudent = studentService.changeStudentInfo(student);
        if (changeStudent == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(changeStudent);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Student> removeStudent(@PathVariable Long id) {
        studentService.removeStudent(id);
        return ResponseEntity.ok().build();
    }


    @GetMapping("/all-students")
    public ResponseEntity<Collection<Student>> getAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("{age}")
    public Collection<Student> findStudentByAge(@PathVariable int age) {
        return studentService.findStudentByAge(age);
    }

    @GetMapping("/sort-age")
    public Collection<Student> findByAgeBetween(@RequestParam int min, @RequestParam int max) {
        return studentService.findByAgeBetween(min, max);

    }

    @GetMapping("{student-id}")
    public ResponseEntity<Faculty> findById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.findFacultyByStudent(id));
    }


}
