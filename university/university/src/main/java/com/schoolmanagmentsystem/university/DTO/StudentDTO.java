package com.schoolmanagmentsystem.university.DTO;

import com.schoolmanagmentsystem.university.domain.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {


    private Long id_studentDto;
    @Size(min = 2, max =25)
    @NotBlank(message = "Name can nut be space")
    @NotNull(message = "Name can not be null")
    private String firstNameStudentDTO;

    @Size(min = 2, max =25)
    @NotBlank(message = "Name can nut be space")
    @NotNull(message = "Name can not be null")
    private String lastNameStudentDTO;

    private int age_studentDTO;

    private int getGradeDTO;
    @Email
    @Size(min = 1, max = 55)
    private String emailStudentDTO;

    public StudentDTO(Student student) {
        this.setId_studentDto(student.getId_student());
        this.setFirstNameStudentDTO(student.getFirstNameStudent());
        this.setLastNameStudentDTO(student.getLastNameStudent());
        this.setAge_studentDTO(student.getAge_student());
        this.setGetGradeDTO(student.getGetGrade());
        this.setEmailStudentDTO(student.getEmailStudent());
    }
}
