package com.tpe.SpringBoot_queryAndUpdate.service;

import com.tpe.SpringBoot_queryAndUpdate.DTO.StudentDTO;
import com.tpe.SpringBoot_queryAndUpdate.domain.Student;
import com.tpe.SpringBoot_queryAndUpdate.exception.ConflictException;
import com.tpe.SpringBoot_queryAndUpdate.exception.ResourceNotFoundException;
import com.tpe.SpringBoot_queryAndUpdate.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public List<Student> getAll() {
        return studentRepository.findAll();

    }

    public void createStudent(Student student) {

        if (studentRepository.existsByEmail(student.getEmail())) {
           throw new  ConflictException("this Mail adress already exists in database");
        }
        studentRepository.save(student);
    }

    public Student findStudent(Long id) {
        return studentRepository.findById(id).
                orElseThrow(()->new ResourceNotFoundException("Could not find student id"+id));
    }


    public void deleteStudent(Long id) {
        Student student=findStudent(id);
         studentRepository.delete(student);
    }

    public void updateStudent(Long id, StudentDTO studentDTO)
    {   Student student= findStudent(id);
        boolean existEmail = studentRepository.existsByEmail(studentDTO.getEmail());
        if (existEmail && !studentDTO.getEmail().equals(student.getEmail())){
            throw new ConflictException("Email already exists in database");
        }

    /*  * Oncelikle student değişkeni ile kullanıcının giriş yaptığı id'yi alıyoruz
        * existEmail ile kullanıcı mail adresini database de olup olmadığını kontrol ediyoruz
          burada tüm id'lerde ki mailleri tarar ve kime ait olduğunu değil database de olup olmadığını
          kontrol ediyoruz
        * if ile existmail database de varsa 2 ihtimal var yaa giriş yapan kullanıcıya ait bir mail
        * adresi yada kullanıcı başkasına ait bir mail adresi girmiş bunu da && sonra ki ikinci koşulda kimin
          mail adresi olduğuna bakıyoruz eğer giriş yapan kullanıcıya ait sonucu false donduruyoriz kullanıcı kendi
        * mail adresini girmesinde bir sakınca yok ancak database de başkasının mail adresini girmişsse o zaman true
        * dondurerek bu mail adresinin zaten var olduğu mesajını veriyoruz
        *
    */

        student.setName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setGrade(studentDTO.getGrade());
        student.setEmail(studentDTO.getEmail());

        studentRepository.save(student);
    }

    public Page<Student> getAllWithPage(Pageable pageable) {
        return studentRepository.findAllWithPage(pageable);
    }


    public List<Student> findByLastName(String lastName) {
        return studentRepository.findByLastName(lastName);
    }


    public List<Student> findAllEqualsGrade(Integer grade) {
        return studentRepository.findAllEqualsGrade(grade);
    }
}

    


