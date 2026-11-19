package org.example.curdspringboot.controller;

import org.example.curdspringboot.entity.Student;
import org.example.curdspringboot.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

//  Create Student
    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {

       Student createdStudent = studentService.createStudent(student);

       return ResponseEntity
               .status(HttpStatus.CREATED)
               .body(createdStudent);
    }

//    Read One Student
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudents(@PathVariable Long id) {
        Student studentResp = studentService.getStudent(id);

        if(studentResp == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(studentResp);
    }

//    Read All Student
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> studentList = studentService.getAllStudent();

        if(studentList.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(studentList);
    }

//    Update Student

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudents(@PathVariable Long id,
                                                  @RequestBody Student studentReq) {
        Student studentResp = studentService.updateStudent(id,studentReq);

        if(studentResp == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(studentResp);
    }

//    Delete Student
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        Boolean isDeleted = studentService.deleteStudent(id);
        if(!isDeleted){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok("Record Deleted");
    }

}
