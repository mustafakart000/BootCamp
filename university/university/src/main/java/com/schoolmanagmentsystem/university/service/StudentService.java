package com.schoolmanagmentsystem.university.service;




import com.schoolmanagmentsystem.university.domain.Student;
import com.schoolmanagmentsystem.university.exception.ConflictException;
import com.schoolmanagmentsystem.university.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class StudentService {


    @Autowired
    StudentRepository studentRepository;


    public List<Student> getAllStudent() {
       return studentRepository.findAll();
    }


    public void createStudent(Student student) {

        if (studentRepository.existsByEmail(student.getEmailManager())){
            throw new ConflictException("Student already exists");
        }
        studentRepository.save(student);
    }


}

